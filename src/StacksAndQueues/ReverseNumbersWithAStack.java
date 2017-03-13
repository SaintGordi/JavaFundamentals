package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

/**
 * Created by Gordon on 2/17/17.
 */
public class ReverseNumbersWithAStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");

        ArrayDeque<Integer> numbers = new ArrayDeque<>();

        for (int i = 0; i < input.length; i++) {
            numbers.push(Integer.parseInt(input[i]));
        }
        int size = numbers.size();
        for (int i = 0; i < size; i++) {
            System.out.print(numbers.pop()+" ");
        }

    }
}
