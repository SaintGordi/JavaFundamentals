package Matrices;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by Gordon on 2/14/17.
 */
public class StringMatrixRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();
        int rotation = Integer.parseInt(num.replaceAll("[^\\d]", ""));
        rotation = rotation % 360;
        int index = 0;
        int max = 0;
        ArrayList<ArrayList<Character>> list = new ArrayList<ArrayList<Character>>();

        String line = scanner.nextLine();
        while (!line.equals("END")) {
            list.add(index, new ArrayList<Character>());
            char[] ch = line.toCharArray();
            if (max < line.length()) {
                max = line.length();
            }
            for (char c : ch) {
                list.get(index).add(c);
            }
            line = scanner.nextLine();
            index++;
        }

        index = 0;
        if (rotation == 90) {
            while (max > index) {
                for (int i = list.size() - 1; i >= 0; i--) {
                    try {
                        System.out.print(list.get(i).get(index));
                    } catch (Exception e) {
                        System.out.print(" ");
                    }
                }
                index++;
                System.out.println();
            }
        } else if (rotation == 180) {
            for (int i = list.size(); i >= 0; i--) {
                for (int j = max-1; j >= 0 ; j--) {
                    try{
                        System.out.print(list.get(i).get(j));
                    }catch (Exception e){
                        System.out.print(" ");
                    }

                }
                System.out.println();
            }
        } else if (rotation == 270) {
            while (max != -1) {
                for (int i = 0; i <list.size(); i++) {
                    try{
                        System.out.print(list.get(i).get(max-1));
                    }catch (Exception e){
                        System.out.print(" ");
                    }
                }
                max --;

                System.out.println();
            }
        } else {
            for (ArrayList<Character> characters : list) {
                for (Character character : characters) {
                    System.out.print(character);
                }
                System.out.println();
            }
        }

    }
}
