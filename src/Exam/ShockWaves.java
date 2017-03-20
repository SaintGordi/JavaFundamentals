package Exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by Think on 3/19/2017.
 *
 * 15 minutes
 */
public class ShockWaves {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] dimensions = reader.readLine().split(" ");

        Integer[][] room = new Integer[Integer.parseInt(dimensions[0])][Integer.parseInt(dimensions[1])];
        for (int i = 0; i < room.length; i++) {
            for (int j = 0; j < room[i].length; j++) {
                room[i][j] = 0;

            }

        }
        String line = "";
        while (!"Here We Go".equals(line = reader.readLine())) {
            String[] shockWave = line.split(" ");
            int x1 = Integer.parseInt(shockWave[0]);
            int y1 = Integer.parseInt(shockWave[1]);
            int x2 = Integer.parseInt(shockWave[2]);
            int y2 = Integer.parseInt(shockWave[3]);

            for (int i = x1; i <= x2; i++) {
                for (int j = y1; j <= y2; j++) {
                    room[i][j] += 1;
                }
            }
        }
        for (Integer[] integers : room) {
            for (Integer integer : integers) {
                System.out.print(integer + " ");
            }
            System.out.println();
        }
    }

}
