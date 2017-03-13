package Syntax; /**
 * Created by Gordon on 2/6/17.
 */

import java.util.Scanner;

public class javaDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i <s.length(); i++) {

            System.out.println((int)s.charAt(i));

        }
    }
}
