package Matrices;

import java.util.Scanner;

/**
 * Created by Gordon on 2/13/17.
 */
public class MaximalSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] size = scanner.nextLine().split(" ");
        int[][] matrix = new int[Integer.parseInt(size[0])][Integer.parseInt(size[1])];
        int countPairs = 0;
        int[] largest = new int[2];
        int sum = 0;
        int max = 0;
        for (int row = 0; row < matrix.length; row++) {
            String[] rows = scanner.nextLine().split(" ");
            for (int col = 0; col < matrix[0].length; col++) {
                matrix[row][col] = Integer.parseInt(rows[col]);
            }
        }
        for (int row = 0; row < matrix.length - 2; row++) {
            for (int col = 0; col < matrix[0].length - 2; col++) {
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        sum = sum + matrix[row + i][col + j];
                    }
                }

                if (max < sum) {
                    max = sum;
                    largest[0] = row;
                    largest[1] = col;
                }
                sum = 0;
            }

        }
        System.out.println("Sum = " + max);
        for (int i = largest[0]; i < largest[0] + 3; i++) {
            for (int j = largest[1]; j < largest[1] + 3; j++) {
                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();
        }

    }
}
