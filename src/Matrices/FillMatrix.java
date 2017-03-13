package Matrices;

import java.util.Scanner;

/**
 * Created by Gordon on 2/13/17.
 */
public class FillMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] params = scan.nextLine().split(", ");
        String pattern = params[1].toLowerCase();
        int dimensions = Integer.parseInt(params[0]);

        int[][] matrix = new int[dimensions][dimensions];
        int number = 1;

        if (pattern.equals("a")) {
            patternA(matrix, number);
        } else if (pattern.equals("b")) {
            patternB(matrix, number);
        }
        printMatrix(matrix);
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }

    private static void patternB(int[][] matrix, int number) {
        for (int col = 0; col < matrix.length; col++) {
            if ((col + 1) % 2 == 0) {
                for (int row = matrix.length - 1; row >= 0; row--) {
                    matrix[row][col] = number++;

                }
            } else {
                for (int row = 0; row < matrix.length; row++) {
                    matrix[row][col] = number++;

                }
            }

        }
    }

    private static void patternA(int[][] matrix, int number) {
        for (int col = 0; col < matrix.length; col++) {
            for (int row = 0; row < matrix.length; row++) {
                matrix[row][col] = number++;
            }
        }
    }
}
