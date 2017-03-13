package SetsAndMaps;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * Created by Gordon on 2/28/17.
 */
public class PeriodicTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = Integer.parseInt(sc.nextLine());
        TreeSet<String> element = new TreeSet<>();
        for (int i = 0; i < rows; i++) {
            String[] row = sc.nextLine().split(" ");

            for (int j = 0; j < row.length; j++) {
                element.add(row[j]);
            }
        }
        for (String s : element) {
            System.out.print(s + " ");
        }
    }
}
