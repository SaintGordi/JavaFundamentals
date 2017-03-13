package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

/**
 * Created by Gordon on 2/19/17.
 */
public class CalculateSequenceWithQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num = Double.parseDouble(scanner.nextLine());
        ArrayDeque<Double> queue = new ArrayDeque<>();
        queue.offer(num);
        for (int j = 0; j < 50; j++) {
            double n = queue.peek();
            queue.offer(n + 1);
            queue.offer((2 * n) + 1);
            queue.offer(n + 2);

            System.out.printf("%.0f ",queue.poll());
        }

    }
}