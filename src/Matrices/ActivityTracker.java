package Matrices;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by Gordon on 2/17/17.
 */
public class ActivityTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = Integer.parseInt(scanner.nextLine());

        ArrayList<ArrayList<String>> matrix = new ArrayList<>();

        for (int i = 0; i < rows; i++) {
            String[] read = scanner.nextLine().split("\\s+");
            read[0] = read[0].substring(3, 5);
            matrix.add(i, new ArrayList<>());
            for (int j = 0; j < 3; j++) {
                matrix.get(i).add(j,read[j]);
            }
        }

        for (ArrayList<String> strings : matrix) {
            System.out.println(strings);
        }

    }
}
