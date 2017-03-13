package Matrices;

import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by Gordon on 2/17/17.
 */
public class ActivityTrackeer2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = Integer.parseInt(scanner.nextLine());

        String[][] matrix = new String[rows][];

        for (int i = 0; i < rows; i++) {
            String[] read = scanner.nextLine().split("\\s+");
            read[0] = read[0].substring(3, 5);
            matrix[i] = new String[read.length];
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = read[j];
            }
        }
        Arrays.sort(matrix, new Comparator<String[]>() {
            @Override
            public int compare(final String[] entry1, final String[] entry2) {
                final String name1 = entry1[1];
                final String name2 = entry2[1];
                return name1.compareTo(name2);
            }
        });

        String[][] end = new String[rows][];
//        for (int i = 0; i < 12; i++) {
//            for (int j = 0; j < matrix.length; j++) {
//                if(Integer.parseInt(matrix[j][0]) == i){
//                    if()
//                }
//            }
//        }



    }
}

