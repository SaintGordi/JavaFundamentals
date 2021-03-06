package Matrices;

import java.util.Scanner;

/**
 * Created by Gordon on 2/13/17.
 */
public class SequenceInMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] size = scanner.nextLine().split(" ");
        String[][] matrix = new String[Integer.parseInt(size[0])][Integer.parseInt(size[1])];
        int[] length = new int[4];
        length[0] = 1;
        length[1] = 1;
        length[2] = 1;
        length[3] = 1;
        int max = 0;
        String what = "";
        String Row;
        String Col;
        String Dia;
        String Dia2;
        for (int row = 0; row < matrix.length; row++) {
            String[] rows = scanner.nextLine().split(" ");
            for (int col = 0; col < matrix[0].length; col++) {
                matrix[row][col] = rows[col];
            }
        }
        //Row = 0

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                //row
                Row = matrix[row][col];
                for (int i = 1; i < matrix[0].length - col; i++) {
                    if (matrix[row][col].equals(matrix[row][col + i])) {
                        length[0]++;
                        Row = Row + ", " + matrix[row][col + i];
                    } else {
                        break;
                    }
                }
                Col = matrix[row][col];
                for (int i = 1; i < matrix.length - row; i++) {
                    if (matrix[row][col].equals(matrix[row + i][col])) {
                        length[1]++;
                        Col = Col + ", " + matrix[row + i][col];
                    } else {
                        break;
                    }
                }
                // dia
                Dia = matrix[row][col];
                for (int i = 1; i < Math.min(matrix.length - row, matrix[0].length - col); i++) {
                    if (matrix[row][col].equals(matrix[row + i][col + i])) {
                        length[2]++;
                        Dia = Dia + ", " + matrix[row + i][col + i];
                    } else {
                        break;
                    }
                }
                Dia2 = matrix[row][col];
                for (int i = 1; i < Math.min(matrix.length - row, col); i++) {
                    if (matrix[row][col].equals(matrix[row + i][col - i])) {
                        length[3]++;
                        Dia2 = Dia2 + ", " + matrix[row + i][col - i];
                    } else {
                        break;
                    }
                }

                if (length[2] >= length[1] && length[2] >= length[3] && length[2] >= length[0] && max <= length[2]) {
                    max = length[2];
                    what = Dia;
                } else if (length[3] >= length[0] && length[3] >= length[1] && length[3] >= length[2] && max <= length[3]) {
                    max = length[3];
                    what = Dia2;
                } else if (length[1] >= length[2] && length[1] >= length[3] && length[1] >= length[0] && max <= length[1]) {
                    max = length[1];
                    what = Col;

                } else if (length[0] >= length[1] && length[0] >= length[2] && length[0] >= length[3] && max <= length[0]) {
                    max = length[0];
                    what = Row;
                }
                length[0] = 1;
                length[1] = 1;
                length[2] = 1;
                length[3] = 1;
            }

        }

        System.out.println(what + ",");


    }
}
