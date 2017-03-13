package Syntax;

import java.util.Scanner;

public class getFirstOddOrEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nums = scanner.nextLine().split(" ");
        String[] command = scanner.nextLine().split(" ");
        int n = Integer.parseInt(command[1]);
        int x = 1;
        if (command[2].equals("odd")) {
            for (String s : nums) {
                if (((Integer.parseInt(s) % 2) != 0) && x <= n) {
                    System.out.print(s + " ");
                    x++;
                }

            }
        } else if (command[2].equals("even")) {
            for (String s : nums) {
                if (((Integer.parseInt(s) % 2) == 0) && x <= n) {
                    System.out.print(s + " ");
                    x++;
                }

            }
        }

    }
}
