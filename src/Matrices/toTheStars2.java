package Matrices;

import java.util.Scanner;

/**
 * Created by Gordon on 2/16/17.
 */
public class toTheStars2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] star1 = scanner.nextLine().split(" ");
        Double[] star1Dim = new Double[2];
        star1Dim[0] = Double.parseDouble(star1[1]);
        star1Dim[1] = Double.parseDouble(star1[2]);

        String[] star2 = scanner.nextLine().split(" ");
        Double[] star2Dim = new Double[2];
        star2Dim[0] = Double.parseDouble(star2[1]);
        star2Dim[1] = Double.parseDouble(star2[2]);

        String[] star3 = scanner.nextLine().split(" ");
        Double[] star3Dim = new Double[2];
        star3Dim[0] = Double.parseDouble(star3[1]);
        star3Dim[1] = Double.parseDouble(star3[2]);

        String[] shipLoc = scanner.nextLine().split(" ");
        double x = Double.parseDouble(shipLoc[0]);
        double y = Double.parseDouble(shipLoc[1]);
        int moves = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <= moves; i++) {
            if (x <= star1Dim[0] + 1 && x >= star1Dim[0] - 1 && y + i <= star1Dim[1] +1 && y + i >= star1Dim[1] - 1 ) {

                System.out.println(star1[0].toLowerCase());

            } else if (x <= star2Dim[0] + 1 && x >= star2Dim[0] - 1 && y + i <= star2Dim[1] +1 && y + i >= star2Dim[1] - 1 ) {

                System.out.println(star2[0].toLowerCase());

            } else if (x <= star3Dim[0] + 1 && x >= star3Dim[0] - 1 && y + i <= star3Dim[1] +1 && y + i >= star3Dim[1] - 1 ) {

                System.out.println(star3[0].toLowerCase());

            } else {
                System.out.println("space");
            }
        }


    }
}
