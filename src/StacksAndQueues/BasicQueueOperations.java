package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

/**
 * Created by Gordon on 2/17/17.
 */
public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] dependencies = scanner.nextLine().split(" ");

        String[] input = scanner.nextLine().split(" ");

        ArrayDeque<Integer> numbers = new ArrayDeque<>();
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < input.length; i++) {
            numbers.offer(Integer.parseInt(input[i]));
        }
        int poping = Integer.parseInt(dependencies[1]);
        for (int i = 0; i < poping; i++) {
            numbers.poll();
        }
        int size = Integer.parseInt(dependencies[0]);
        int number = Integer.parseInt(dependencies[2]);
        for (int i = 0; i < size - poping; i++) {
            int popped = numbers.poll();
            if (popped < min) {
                min = popped;
            }
            if (popped == number) {
                System.out.println("true");
                return;
            }
        }
        if (min == Integer.MAX_VALUE) {
            System.out.println(0);
        } else {

            System.out.println(min);
        }
    }
}
