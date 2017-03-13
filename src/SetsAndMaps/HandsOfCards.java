package SetsAndMaps;

import java.util.*;

/**
 * Created by Gordon on 2/28/17.
 */
public class HandsOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] lines = scanner.nextLine().split(": ");
        Map<String, Set<String>> players = new LinkedHashMap<>();
        HashSet<String> uniCards = new HashSet<>();
        HashSet<String> fake = new HashSet<>();
        HashSet<String> end = new HashSet<>();
        while (!"JOKER".equals(lines[0])) {
            String[] cards = lines[1].split(", ");
            String key = lines[0];
            if (players.get(key) == null) {
                players.put(key, new HashSet<String>());
            }
            for (int i = 0; i < cards.length; i++) {
                players.get(key).add(cards[i]);
            }
            lines = scanner.nextLine().split(": ");
        }
        int x = 0, y = 0;
        int points = 0;
        for (String s : players.keySet()) {

            for (String s1 : players.get(s)) {
                if (s1.charAt(0) == 'J') {
                    x = 11;
                } else if (s1.charAt(0) == 'Q') {
                    x = 12;
                } else if (s1.charAt(0) == 'K') {
                    x = 13;
                } else if (s1.charAt(0) == 'A') {
                    x = 14;
                } else {
                    String str = s1.replaceAll("\\D", "");
                    x = Integer.parseInt(str);
                }

                if (s1.endsWith("S")) {
                    y = 4;
                } else if (s1.endsWith("H")) {
                    y = 3;
                } else if (s1.endsWith("D")) {
                    y = 2;
                } else if (s1.endsWith("C")) {
                    y = 1;
                }
                points = points + x * y;
            }
            System.out.println(s + ": " + (points));
            x = 0;
            y = 0;
            points = 0;
        }
    }
}
