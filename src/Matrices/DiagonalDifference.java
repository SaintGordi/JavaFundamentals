package Matrices;

import java.util.Scanner;

/**
 * Created by Gordon on 2/13/17.
 */
public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[size][size];
        int sumPrimary = 0;
        int sumSecondary = 0;
        for (int row = 0; row < matrix.length; row++) {
            String[] rows = scanner.nextLine().split(" ");
            for (int col = 0; col < matrix.length; col++) {
                matrix[row][col] = Integer.parseInt(rows[col]);

            }

        }

        for (int i = 0; i < matrix.length; i++) {
            sumPrimary = sumPrimary+matrix[i][i];
        }
        for (int i = matrix.length-1; i >=0; i--) {
            sumSecondary = sumSecondary+matrix[i][size-1-i];

        }
        System.out.println(Math.abs(sumPrimary-sumSecondary));

    }
}
