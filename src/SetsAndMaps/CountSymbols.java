import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * Created by Gordon on 2/28/17.
 */
public class CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String letter = scanner.nextLine();

        char[] chars = letter.toCharArray();
        int[] counter = new int[chars.length];
        TreeSet<Character> uniChars = new TreeSet<>();
        for (int i = 0; i < chars.length; i++) {
            uniChars.add(chars[i]);
        }
        int c = 0;
        for (Character uniChar : uniChars) {
            for (int i = 0; i < chars.length; i++) {
                if(uniChar == chars[i]){
                  counter[c]++;
                }

            }
            System.out.printf("%s: %d time/s%n",uniChar,counter[c]);
            c++;
        }
    }
}
