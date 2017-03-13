package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

/**
 * Created by Gordon on 2/24/17.
 */
public class TruckTour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Deque<Long> stationPetrol = new ArrayDeque<>();
        Deque<Long> rollPetrol = stationPetrol;
        Deque<Long> stationDistance = new ArrayDeque<>();
        Deque<Long> rollDistance = stationDistance;
        long carTank = 0;
        long N = Long.parseLong(sc.nextLine());
        long startIndex = 0;
        long counter = 0;
        for (int i = 0; i < N; i++) {
            String[] input = sc.nextLine().split(" ");
            stationPetrol.offer(Long.parseLong(input[0]));
            stationDistance.offer(Long.parseLong(input[1]));
        }

        for (int i = 0; i < stationDistance.size(); i++) {
            startIndex = i;
            for (int j = 0; j < stationDistance.size(); j++) {
                carTank = carTank + rollPetrol.peek();
                if (carTank - rollDistance.peek() >= 0) {
                    carTank = carTank-rollDistance.peek();
                    rollDistance.offer(rollDistance.pop());
                    rollPetrol.offer(rollPetrol.pop());
                    counter++;

                } else {
                    stationDistance.offer(stationDistance.pop());
                    stationPetrol.offer(stationPetrol.pop());
                    rollDistance = stationDistance;
                    rollPetrol = stationPetrol;
                    carTank = 0;
                    counter = 0;
                    break;
                }
            }
            if (counter == N) {
                System.out.println(startIndex);
                return;
            }
        }
    }
}
