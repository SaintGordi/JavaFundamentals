package Matrices;

import java.util.Scanner;

/**
 * Created by Gordon on 2/16/17.
 */
public class ToTheStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] star1 = scanner.nextLine().split(" ");
        String[] star2 = scanner.nextLine().split(" ");
        String[] star3 = scanner.nextLine().split(" ");
        String[] shipLoc = scanner.nextLine().split(" ");
        double y =  Double.parseDouble(shipLoc[0]);
        double x =  Double.parseDouble(shipLoc[1]);
        int moves = Integer.parseInt(scanner.nextLine());

        String[][] space = new String[30][30];
        for (int row = 0; row < space.length; row++) {
            for (int col = 0; col < space[row].length; col++) {
                space[row][col] = "space";
            }
        }
        for (int row = 0; row < space.length; row++) {
            for (int col = 0; col < space[row].length; col++) {
                if (space.length - row == (int) Double.parseDouble(star1[2]) && col == (int) Double.parseDouble(star1[1])) {
                    for (int i = row - 1; i <= row + 1; i++) {
                        for (int j = col - 1; j <= col + 1; j++) {
                            try {
                                space[i][j] = star1[0].toLowerCase();
                            } catch (Exception e) {

                            }
                        }
                    }
                    space[row][col] = star1[0].toLowerCase();
                } else if (space.length - row == (int) Double.parseDouble(star2[2]) && col == (int) Double.parseDouble(star2[1])) {
                    for (int i = row - 1; i <= row + 1; i++) {
                        for (int j = col - 1; j <= col + 1; j++) {
                            try {
                                space[i][j] = star2[0].toLowerCase();
                            } catch (Exception e) {

                            }
                        }
                    }
                    space[row][col] = star2[0].toLowerCase();

                } else if (space.length - row == (int) Double.parseDouble(star3[2]) && col == (int) Double.parseDouble(star3[1])) {
                    for (int i = row - 1; i <= row + 1; i++) {
                        for (int j = col - 1; j <= col + 1; j++) {
                            try {
                                space[i][j] = star3[0].toLowerCase();
                            } catch (Exception e) {

                            }
                        }
                    }
                    space[row][col] = star3[0].toLowerCase();
                }
            }
        }

//        for (String[] strings : space) {
//            for (String string : strings) {
//               if(string.equals("space")){
//                 System.out.print("- ");
//                }else{
//                   System.out.print("+ ");
//               }
//            }
//            System.out.println();
//        }
        for (int i = 0; i <= moves; i++) {
            System.out.println(space[(int)Math.round(space.length - x - i)][(int) Math.round(y)]);

        }
    }
}
