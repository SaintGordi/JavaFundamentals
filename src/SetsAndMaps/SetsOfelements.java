package SetsAndMaps;

import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by Gordon on 2/28/17.
 */
public class SetsOfelements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nAndM = scanner.nextLine().split(" ");
        int n = Integer.parseInt(nAndM[0]);
        int m = Integer.parseInt(nAndM[1]);
        HashSet<Integer> nNumbers = new HashSet<>();
        HashSet<Integer> mNumbers = new HashSet<>();
        int loopC = 0;
        for (int i = 0; i < n; i++) {
            nNumbers.add(Integer.parseInt(scanner.nextLine()));
        }
        for (int i = 0; i < m; i++) {
            mNumbers.add(Integer.parseInt(scanner.nextLine()));
        }
        for (Integer mNumber : mNumbers) {
            if (nNumbers.contains(mNumber)) {
                System.out.print(mNumber + " ");
            }
        }
    }
}
