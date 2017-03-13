package SetsAndMaps;

import java.util.*;

/**
 * Created by Gordon on 3/5/17.
 */
public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> collectedMaterial = new TreeMap<>();
        Map<String, Map<String, Integer>> legendaries = new HashMap<>();
        legendaries.put("Valanyr", new LinkedHashMap<>());
        legendaries.get("Valanyr").put("fragments", 0);
        legendaries.put("Shadowmourne", new LinkedHashMap<>());
        legendaries.get("Shadowmourne").put("shards", 0);
        legendaries.put("Dragonwrath", new LinkedHashMap<>());
        legendaries.get("Dragonwrath").put("motes", 0);


        boolean collected = false;
        while (!collected) {
            String[] line = scanner.nextLine().toLowerCase().split(" ");
            for (int j = 0; j < line.length - 1; j += 2) {
                String material = line[j + 1];
                int amount = Integer.parseInt(line[j]);

                if (legendaries.get("Shadowmourne").containsKey(material)) {
                    legendaries.get("Shadowmourne").put(material, legendaries.get("Shadowmourne").get(material) + amount);
                    if (legendaries.get("Shadowmourne").get(material) >= 250) {
                        System.out.println("Shadowmourne obtained!");
                        legendaries.get("Shadowmourne").put(material, legendaries.get("Shadowmourne").get(material) - 250);
                        collected = true;
                        break;
                    }
                } else if (legendaries.get("Valanyr").containsKey(material)) {
                    legendaries.get("Valanyr").put(material, legendaries.get("Valanyr").get(material) + amount);
                    if (legendaries.get("Valanyr").get(material) >= 250) {
                        System.out.println("Valanyr obtained!");
                        legendaries.get("Valanyr").put(material, legendaries.get("Valanyr").get(material) - 250);
                        collected = true;
                        break;
                    }
                } else if (legendaries.get("Dragonwrath").containsKey(material)) {
                    legendaries.get("Dragonwrath").put(material, legendaries.get("Dragonwrath").get(material) + amount);
                    if (legendaries.get("Dragonwrath").get(material) >= 250) {
                        System.out.println("Dragonwrath obtained!");
                        legendaries.get("Dragonwrath").put(material, legendaries.get("Dragonwrath").get(material) - 250);
                        collected = true;
                        break;
                    }
                } else {
                    if (!collectedMaterial.containsKey(material)) {
                        collectedMaterial.put(material, amount);
                    } else {
                        collectedMaterial.put(material, collectedMaterial.get(material) + amount);
                    }
                }

            }

        }
        //sorting materials
        Map<String, Integer> leftMaterials = new TreeMap<>();
        for (Map.Entry<String, Map<String, Integer>> entry : legendaries.entrySet()) {
            for (Map.Entry<String, Integer> stringIntegerEntry : entry.getValue().entrySet()) {
                leftMaterials.put(stringIntegerEntry.getKey(),stringIntegerEntry.getValue());
            }
        }
        List<Map.Entry<String, Integer>> entries = new ArrayList<Map.Entry<String, Integer>>(leftMaterials.entrySet());
        Collections.sort(entries, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> a, Map.Entry<String, Integer> b) {
                return b.getValue().compareTo(a.getValue());
            }
        });
        Map<String, Integer> sortedMaterials = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> entry : entries) {
            sortedMaterials.put(entry.getKey(), entry.getValue());
        }
        //printing materials
        for (Map.Entry<String, Integer> entry : sortedMaterials.entrySet()) {
            System.out.println(entry.getKey()+ ": " + entry.getValue());
        }

        for (Map.Entry<String, Integer> stringIntegerEntry : collectedMaterial.entrySet()) {
            System.out.println(stringIntegerEntry.getKey() + ": " + stringIntegerEntry.getValue());
        }
    }
}
