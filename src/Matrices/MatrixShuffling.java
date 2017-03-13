package Matrices;

import java.util.Scanner;

/**
 * Created by Gordon on 2/13/17.
 */
public class MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] dimensions = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(dimensions[0]);
        int cols = Integer.parseInt(dimensions[1]);
        String[][] matrix = new String[rows][];

        for (int i = 0; i < matrix.length; i++) {
            String[] row = scanner.nextLine().split(" ");
            if (row.length > cols) {
                System.out.println("Invalid input!");
                break;
            }
            matrix[i] = new String[row.length];
            for (int j = 0; j < row.length; j++) {
                matrix[i][j] = row[j];
            }

        }
        String command = "";
        while (!command.equals("END")) {
            String[] com = scanner.nextLine().split(" ");
            if(com[0].equals("END")){
                break;
            }
            if (com[0].equals("swap") && com.length == 5) {
                try {
                    String temp = matrix[Integer.parseInt(com[1])][Integer.parseInt(com[2])];
                    matrix[Integer.parseInt(com[1])][Integer.parseInt(com[2])] = matrix[Integer.parseInt(com[3])][Integer.parseInt(com[4])];
                    matrix[Integer.parseInt(com[3])][Integer.parseInt(com[4])] = temp;
                    for (String[] strings : matrix) {
                        for (String string : strings) {
                            System.out.print(string + " ");
                        }
                        System.out.println();
                    }
                } catch (Exception e) {
                    System.out.println("Invalid input!");
                }
            } else {
                System.out.println("Invalid input!");
            }
           command = com[0];
        }


    }
}
