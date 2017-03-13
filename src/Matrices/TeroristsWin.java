package Matrices;

import java.util.Scanner;

/**
 * Created by Gordon on 2/14/17.
 */
public class TeroristsWin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] msg = scanner.nextLine().toCharArray();
        int start = 0;
        int end = 0;
        int sum = 0;

        for (int i = 0; i < msg.length; i++) {
            start = i;
            if (msg[i] == '|') {
                for (int j = i + 1; j < msg.length; j++) {
                    if (msg[j] == '|') {
                        end = j;
                        break;
                    }
                    sum = sum + msg[j];
                }
                start = Math.max(0,start - (sum % 10));
                end = Math.min(end + (sum % 10),msg.length-1);
                try{
                    for (int j = start; j <= end; j++) {
                        msg[j] = '.';
                    }
                }catch (Exception e){

                }

                i = end;
                sum = 0;
            }

        }
        for (char c : msg) {
            System.out.print(c);
        }
    }
}
