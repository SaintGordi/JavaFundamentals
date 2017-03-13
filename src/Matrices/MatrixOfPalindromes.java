package Matrices;

import java.util.Scanner;

/**
 * Created by Gordon on 2/13/17.
 */
public class MatrixOfPalindromes {
    public static void main(String[] args) {
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        Scanner scanner = new Scanner(System.in);
        String[] params = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(params[0]);
        int cols = Integer.parseInt(params[1]);
        String[][] matrix = new String[rows][cols];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                String str = new StringBuilder().append(alphabet[row]).append(alphabet[row+col]).append(alphabet[row]).toString();
                matrix[row][col] = str;

            }

        }
        for (String[] strings : matrix) {
            for (String string : strings) {
                System.out.print(string + " ");
            }
            System.out.println();
        }

    }
}
