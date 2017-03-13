package SetsAndMaps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * Created by Think on 3/13/2017.
 */
public class DragonArmy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = Integer.parseInt(scanner.nextLine());
        Map<String, Map<String, Integer[]>> dragons = new LinkedHashMap<>();
        Map<String, Double[]> typeAverage = new LinkedHashMap<>();
        double average = 0;
        for (int i = 0; i < rows; i++) {
            String[] line = scanner.nextLine().split(" ");
            String type = line[0];
            String name = line[1];
            int damage = 45;
            int health = 250;
            int armor = 10;
            if (!line[2].equals("null")) {
                damage = Integer.parseInt(line[2]);
            }
            if (!line[3].equals("null")) {
                health = Integer.parseInt(line[3]);
            }
            if (!line[4].equals("null")) {
                armor = Integer.parseInt(line[4]);
            }
            Integer[] ahd = new Integer[]{damage, health, armor};
            if (!dragons.containsKey(type)) {
                dragons.put(type, new TreeMap<>());
            }

            dragons.get(type).put(name, ahd);

        }
        for (Map.Entry<String, Map<String, Integer[]>> entry : dragons.entrySet()) {
            double avgDamage = 0;
            double avgHealth = 0;
            double avgArmor = 0;
            for (Map.Entry<String, Integer[]> dragonEntry : entry.getValue().entrySet()) {
                avgDamage = avgDamage + dragonEntry.getValue()[0];
                avgHealth = avgHealth + dragonEntry.getValue()[1];
                avgArmor = avgArmor + dragonEntry.getValue()[2];

            }
            avgDamage = avgDamage / entry.getValue().size();
            avgHealth = avgHealth / entry.getValue().size();
            avgArmor = avgArmor / entry.getValue().size();

            Double[] stats = new Double[]{avgDamage,avgHealth, avgArmor};
            typeAverage.put(entry.getKey(), stats);

            System.out.println(String.format("%s::(%.2f/%.2f/%.2f)",entry.getKey(), avgDamage, avgHealth, avgArmor));
            for (Map.Entry<String, Integer[]> dragonEntry : entry.getValue().entrySet()) {
                System.out.println(String.format("-%s -> damage: %d, health: %d, armor: %d",dragonEntry.getKey(), dragonEntry.getValue()[0], dragonEntry.getValue()[1], dragonEntry.getValue()[2]));
            }
        }
    }
}

