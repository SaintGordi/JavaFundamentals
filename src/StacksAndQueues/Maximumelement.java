package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

/**
 * Created by Gordon on 2/17/17.
 */
public class Maximumelement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = Integer.parseInt(scanner.nextLine());
        ArrayDeque<String> numbers = new ArrayDeque<>();
        long maxNum = 0;
        long secondMaxNum = 0;
        for (int i = 0; i < rows; i++) {
            String[] command = scanner.nextLine().split(" ");
            if (command[0].equals("1")) {
                numbers.push(command[1]);
                if(maxNum<Long.parseLong(command[1])){
                    maxNum = Long.parseLong(command[1]);
                }
                if(secondMaxNum<Long.parseLong(command[1]) && maxNum > Long.parseLong(command[1]) ){
                    secondMaxNum = Long.parseLong(command[1]);
                }
            } else if (command[0].equals("2")) {
                long k = Long.parseLong(numbers.pop());
                if(k == maxNum){
                    maxNum = secondMaxNum;
                }
            } else if (command[0].equals("3")) {
                System.out.println(maxNum);
            }
        }
    }

    private static long maxInStack(ArrayDeque<String> numbers) {
        long max = 0;
        for (int i = 0; i < numbers.size(); i++) {

            long current = Long.parseLong(numbers.pop());
            if (max < current) {
                max = current;
            }
            numbers.offer(String.valueOf(current));
        }
        return max;
    }
}
