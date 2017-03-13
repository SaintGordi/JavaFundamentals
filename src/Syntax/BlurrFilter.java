package Syntax;

import java.util.Scanner;

/**
 * Created by Gordon on 2/11/17.
 */
public class BlurrFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int blur = Integer.parseInt(scanner.nextLine());
        String[] range = scanner.nextLine().split(" ");
        int[][] matrix = new int[Integer.parseInt(range[0])][Integer.parseInt(range[1])];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = scanner.nextInt();
            }
        }
        scanner.nextLine();
        String[] blurPosition = scanner.nextLine().split(" ");

        int startR = Math.max(0,Integer.parseInt(blurPosition[0]) - 1);
        int endR = Math.min(matrix.length-1,Integer.parseInt(blurPosition[0]) + 1);

        int startC = Math.max(0,Integer.parseInt(blurPosition[1]) - 1);
        int endC = Math.min(matrix.length-1,Integer.parseInt(blurPosition[1]) + 1);

        System.out.printf("startR: %d endR: %d startC: %d endC: %d%n", startR, endR, startC, endC);


//        for (int row = Math.max(0, Integer.parseInt(blurPosition[0]) - 2); row <= Math.min(matrix.length - 1, Integer.parseInt(blurPosition[0]) + 1); row++) {
//            for (int col = Math.max(0, Integer.parseInt(blurPosition[1]) - 2); col <= Math.min(matrix[0].length - 1, Integer.parseInt(blurPosition[1]) + 1); col++) {
//               // System.out.println("row: " + row + " ; " + col + " " + matrix[row][col]);
//                matrix[row][col] = matrix[row][col] + blur;
//
//            }
//        }


        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(" " + anInt);
            }
            System.out.println();
        }


    }
}
