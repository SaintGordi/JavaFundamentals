package ManualStringProcessing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Think on 3/16/2017.
 */
public class CountSubstringOccurences {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine().toLowerCase();
        String word = reader.readLine().toLowerCase();
        int counter = 0;

        for (int i = 0; i <= text.length()-word.length(); i++) {
            if(text.substring(i, word.length()+i).equals(word)){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
