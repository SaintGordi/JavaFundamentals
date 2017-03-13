package SetsAndMaps;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

/**
 * Created by Gordon on 2/28/17.
 */
public class UniqueUsernames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = Integer.parseInt(sc.nextLine());
        LinkedHashSet<String> userNames = new LinkedHashSet<>();
        for (int i = 0; i < rows; i++) {
            userNames.add(sc.nextLine());
        }
        for (String userName : userNames) {
            System.out.println(userName);
        }
    }
}
