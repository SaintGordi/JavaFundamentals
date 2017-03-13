package Matrices;

import java.util.Scanner;

/**
 * Created by Gordon on 2/13/17.
 */
public class SquaresInMatrix {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] size = scanner.nextLine().split(" ");
        String[][] matrix = new String[Integer.parseInt(size[0])][Integer.parseInt(size[1])];
        int countPairs = 0;

        for (int row = 0; row < matrix.length; row++) {
            String[] rows = scanner.nextLine().split(" ");
            for (int col = 0; col < matrix[0].length; col++) {
                matrix[row][col] = rows[col].toLowerCase();
            }
        }
        for (int row = 0; row < matrix.length-1; row++) {
            for (int col = 0; col < matrix[0].length-1; col++) {

                if (matrix[row][col].equals(matrix[row][col + 1]) &&
                        matrix[row][col].equals(matrix[row + 1][col]) &&
                        matrix[row][col].equals(matrix[row+1][col+1])) {
                    countPairs++;
                }
            }

        }
        System.out.println(countPairs);

    }
}
