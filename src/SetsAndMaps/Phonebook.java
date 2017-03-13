package SetsAndMaps;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Gordon on 2/28/17.
 */
public class Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> phonebook = new HashMap<>();
        String[] line = scanner.nextLine().split("-");

        while (!line[0].equals("search")) {
            phonebook.put(line[0], line[1]);
            line = scanner.nextLine().split("-");
        }
        line[0] = scanner.nextLine();

        while (!line[0].equals("stop")) {
            if (phonebook.containsKey(line[0])) {
                System.out.println(line[0] + " -> " +phonebook.get(line[0]));
            } else {
                System.out.println("Contact " + line[0] + " does not exist.");
            }
            line[0] = scanner.nextLine();
        }
    }
}
