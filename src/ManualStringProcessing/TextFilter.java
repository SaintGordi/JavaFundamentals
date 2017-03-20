package ManualStringProcessing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Think on 3/16/2017.
 */
public class TextFilter {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] bannedWords = reader.readLine().split(", ");
        String text = reader.readLine();
        StringBuilder sb = new StringBuilder(text);
        String[] wordsInText = text.split(" ");
        char s = '*';
        for (int i = 0; i < bannedWords.length; i++) {
            String padded = new String(new char[bannedWords[i].length()]).replace('\0', s);
            while (sb.indexOf(bannedWords[i]) >= 0){
                sb.replace(sb.indexOf(bannedWords[i]),sb.indexOf(bannedWords[i])+bannedWords[i].length(),padded);
            }
        }
        System.out.println(sb);
    }
}
