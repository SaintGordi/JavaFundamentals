package SetsAndMaps;

import com.sun.scenario.effect.impl.state.LinearConvolveKernel;
import sun.rmi.server.InactiveGroupException;

import java.util.*;
import java.util.stream.Stream;

/**
 * Created by Gordon on 3/2/17.
 */
public class PopulationCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String row;
        Map<String, Map<String, Long>> population = new LinkedHashMap<>();
        Map<String, Long> countryPopulation = new LinkedHashMap<>();
        while (!"report".equals(row = scanner.nextLine())) {
            String[] line = row.split("\\|");
            String city = line[0];
            String country = line[1];
            long people = Long.parseLong(line[2]);
            long totalPop = 0;
            if (!population.containsKey(country)) {
                population.put(country, new LinkedHashMap<>());
                countryPopulation.put(country, 0L);
            }
            population.get(country).put(city, people);
            totalPop = countryPopulation.get(country);
            countryPopulation.put(country, totalPop + people);
        }


//        countryPopulation.entrySet()
//                .stream().sorted((e1,e2) -> e2.getValue().compareTo(e1.getValue()))
//                .forEach(entry -> {
//            System.out.println(String.format("%s (total population: %d)",entry.getKey(),entry.getValue()));
//            population.get(entry.getKey()).entrySet().stream().sorted((p1,p2) -> p2.getValue().compareTo(p1.getValue()))
//                    .forEach(pair -> System.out.println(String.format("=>%s: %d",pair.getKey(),pair.getValue())));
//
//        });


        List<Map.Entry<String, Long>> entries = new ArrayList<Map.Entry<String, Long>>(countryPopulation.entrySet());
        Collections.sort(entries, new Comparator<Map.Entry<String, Long>>() {
            public int compare(Map.Entry<String, Long> a, Map.Entry<String, Long> b) {
                return b.getValue().compareTo(a.getValue());
            }
        });
        Map<String, Long> sortedCoutries = new LinkedHashMap<String, Long>();
        for (Map.Entry<String, Long> entry : entries) {
            sortedCoutries.put(entry.getKey(), entry.getValue());
        }

        Map<String, Map<String, Long>> sortedCities = new LinkedHashMap<>();
        for (Map.Entry<String, Map<String, Long>> stringMapEntry : population.entrySet()) {
            List<Map.Entry<String, Long>> pairs = new ArrayList<Map.Entry<String, Long>>(stringMapEntry.getValue().entrySet());
            Collections.sort(pairs, new Comparator<Map.Entry<String, Long>>() {
                public int compare(Map.Entry<String, Long> a, Map.Entry<String, Long> b) {
                    return b.getValue().compareTo(a.getValue());
                }
            });

            sortedCities.put(stringMapEntry.getKey(), new LinkedHashMap<>());
            for (Map.Entry<String, Long> entry : pairs) {
               sortedCities.get(stringMapEntry.getKey()).put(entry.getKey(), entry.getValue());
            }
        }

        for (Map.Entry<String, Long> patka : sortedCoutries.entrySet()) {
            System.out.println(String.format(String.format("%s (total population: %d)",patka.getKey(),patka.getValue())));
            for (Map.Entry<String, Long> patok : sortedCities.get(patka.getKey()).entrySet()) {
                System.out.println(String.format("=>%s: %d",patok.getKey(),patok.getValue()));
            }
        }
    }
}



