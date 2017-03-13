package Syntax; /**
 * Created by Gordon on 2/9/17.
 */

import java.util.Scanner;


public class VehiclePark {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countSold = 0;
        String all = " " + scan.nextLine();
        String[] giveCars = all.split(" ");
        String firstIn = scan.nextLine();
        String inputCar;
        boolean sold;
        int requests = 0;
        if (giveCars.length <= 10000 && giveCars.length >= 0) {
            while (!firstIn.contains("End of customers!")) {
                if (requests < 10000 && requests >= 0) {
                    requests++;
                    inputCar = (firstIn.toLowerCase().substring(0, 1) + Integer.parseInt(firstIn.replaceAll("[\\D]", "")));
                    sold = false;

                    for (int i = 0; i < giveCars.length; i++) {

                        if (giveCars[i].equals(inputCar)) {
                            System.out.printf("Yes, sold for %d$%n", ((int) giveCars[i].charAt(0)) * Integer.parseInt(giveCars[i].replaceAll("[\\D]", "")));
                            countSold++;
                            sold = true;
                            giveCars[i] = "";
                            all = all.replaceFirst(" " + inputCar, "");
                            break;
                        }
                    }
                    if (!sold) {
                        System.out.println("No");
                    }
                    firstIn = scan.nextLine();
                }
            }
            System.out.printf("Vehicles left: %s", all.trim().replace(" ", ", "));
            System.out.printf("%nVehicles sold: %d", countSold);
        }
    }
}
