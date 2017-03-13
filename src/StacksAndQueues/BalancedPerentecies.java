package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

/**
 * Created by Gordon on 2/24/17.
 */
public class BalancedPerentecies {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] inn = scanner.nextLine().toCharArray();
        Deque<Character> sequence = new ArrayDeque<>();
        String str = "YES";
        for (int i = 0; i < inn.length; i++) {

            sequence.offer(inn[i]);
        }
        while (sequence.size() > 1) {
            char first = sequence.poll();
            char last = sequence.pollLast();

            if (first != last) {
                str = "NO";
                break;
            }
        }

        System.out.println(str);
    }
}
