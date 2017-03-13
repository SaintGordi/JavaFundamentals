package StacksAndQueues;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayDeque;
import java.util.Scanner;

/**
 * Created by Gordon on 2/19/17.
 */
public class Robotics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] robots = scanner.nextLine().split(";");
        String inputTime = scanner.nextLine();
        ArrayDeque<String> queue = new ArrayDeque<>();
        String[][] robot = new String[robots.length][3];
        if (inputTime.length() == 7) {
            inputTime = "0" + inputTime;
        }

        LocalTime time = LocalTime.parse(inputTime);
        for (int i = 0; i < robots.length; i++) {
            robot[i][0] = robots[i].substring(0, robots[i].indexOf("-"));
            robot[i][1] = robots[i].substring(robots[i].indexOf("-")+1);
            robot[i][2] = "00:00:00";
        }

        String detail = scanner.nextLine();
        while (!detail.equals("End")) {
            queue.offer(detail);
            detail = scanner.nextLine();
        }
        boolean processed = false;
        int second = 1;
        while (!queue.isEmpty()) {
            time = time.plusSeconds(second);
            processed = false;
            for (int i = 0; i < robot.length; i++) {
                if (LocalTime.parse(robot[i][2]).isBefore(time) || LocalTime.parse(robot[i][2]).equals(time)) {
                    System.out.println(robot[i][0] + " - " + queue.poll() + " [" + time.format(DateTimeFormatter.ofPattern("HH:mm:ss")) + "]");
                    robot[i][2] = String.valueOf(time.plusSeconds(Integer.parseInt(robot[i][1])));
                    processed = true;
                    break;
                }
            }
            if(!processed){
                queue.offer(queue.poll());
            }
        }
    }
}

