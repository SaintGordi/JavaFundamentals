package Syntax;

import java.util.Scanner;

/**
 * Created by Gordon on 2/8/17.
 */
public class GameOfNames {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int players = scan.nextInt();
        int max=0;
        int pl=0;
        String[] playerName = new String[players];
        Integer[] playerScore = new Integer[players];

        for (int i = 0; i < players; i++) {
            playerName[i] = scan.next();
            playerScore[i] = scan.nextInt();
        }
        for (int i = 0; i < players; i++) {
            for (int j = 0; j < playerName[i].length(); j++) {
                if ((playerName[i].charAt(j) % 2) == 0) {
                    playerScore[i] += playerName[i].charAt(j);
                }else{
                    playerScore[i] -= playerName[i].charAt(j);
                }
            }
            if(max < playerScore[i]){
                pl = i;
                max = playerScore[i];
            }
        }

        System.out.printf("The winner is %1$s - %2$d points",playerName[pl], playerScore[pl]);
    }
}
