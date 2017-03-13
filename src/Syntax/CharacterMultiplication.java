package Syntax;

import java.util.Scanner;

/**
 * Created by Gordon on 2/8/17.
 */
public class CharacterMultiplication {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str1 = scan.next();
        String str2 = scan.next();

        int a = 0;
        int k = 0;
        if (str1.length() > str2.length()) {
            k = str1.length();
        } else {
            k = str2.length();
        }

        for (int i = 0; i < k; i++) {
            if (str2.length() > i && str1.length() > i) {
                a = a + str1.charAt(i) * str2.charAt(i);

            } else if (str1.length() > i) {
                a = a + str1.charAt(i) * 1;
            } else if (str2.length() > i) {
                a = a + str2.charAt(i) * 1;
            }
        }
        System.out.println(a);
    }
}
