package SetsAndMaps;

import java.util.*;

/**
 * Created by Think on 3/13/2017.
 */
public class SrubskoUnleashed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Map<String, Integer>> events = new LinkedHashMap<>();
        String line;

        while (!"End".equals(line = scanner.nextLine())) {
            try {
                String[] first = line.split(" @");
                String singer = first[0];
                String[] second = first[1].split(" ");
                int ticketCost = Integer.parseInt(second[second.length - 2]);
                int ticketQuantity = Integer.parseInt(second[second.length - 1]);
                String venue = "";
                for (int i = 0; i < second.length - 2; i++) {
                    venue = venue + " " + second[i];
                }
                if (!events.containsKey(venue)) {
                    events.put(venue, new LinkedHashMap<>());
                }
                if (!events.get(venue).containsKey(singer)) {
                    events.get(venue).put(singer, 0);
                }
                events.get(venue).put(singer, events.get(venue).get(singer) + (ticketCost * ticketQuantity));
            } catch (Exception e) {
                //skip
            }
        }
        System.out.printf("");
        for (String s : events.keySet()) {
            System.out.println(s.trim());
            events.get(s).entrySet().stream().sorted((o1, o2) -> o2.getValue().compareTo(o1.getValue())).forEach(pair -> System.out.println("#  " + pair.getKey() + " -> " + pair.getValue()));
        }
    }
}
