package Matrices;

import java.util.Scanner;

/**
 * Created by Gordon on 2/13/17.
 */
public class CollectTheCoins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] board = new char[4][];
        int coins = 0;
        int walls = 0;
        for (int i = 0; i < board.length; i++) {
            String row = scanner.nextLine();
            board[i] = new char[row.length()];
            for (int j = 0; j < row.length(); j++) {
                board[i][j] = row.charAt(j);
            }
        }
        char[] commands = scanner.nextLine().toCharArray();
        int x = 0;
        int y = 0;
        for (char command : commands) {


            if (command == 'V') {
                x++;
                try {
                    // System.out.println(board[x][y]);
                    if (board[x][y] == '$') {
                        coins++;
                    }
                } catch (Exception e) {
                    walls++;
                    x--;
                }
            } else if (command == '>') {
                y++;
                try {
                    // System.out.println(board[x][y]);
                    if (board[x][y] == '$') {
                        coins++;
                    }
                } catch (Exception e) {
                    walls++;
                    y--;
                }
            } else if (command == '<') {
                y--;
                try {
                    // System.out.println(board[x][y]);
                    if (board[x][y] == '$') {
                        coins++;
                    }
                } catch (Exception e) {
                    walls++;
                    y++;
                }
            } else if (command == '^') {
                x--;
                try {
                    // System.out.println(board[x][y]);
                    if (board[x][y] == '$') {
                        coins++;
                    }
                } catch (Exception e) {
                    walls++;
                    x++;
                }
            }

        }
        System.out.println("Coins = " + coins);
        System.out.println("Walls = " + walls);
    }
}
