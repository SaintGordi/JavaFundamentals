package FilesAndDirectories;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Think on 3/16/2017.
 */
public class MelrahShake {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine();
        StringBuilder sb = new StringBuilder(text);
        String pattern = reader.readLine();
        StringBuilder sb2 = new StringBuilder(pattern);

        while (sb.indexOf(pattern) != sb.lastIndexOf(pattern) && pattern.length() >= 1 && sb.indexOf(pattern)>=0 && sb.lastIndexOf(pattern)>=0) {
            if (sb.indexOf(pattern) >= 0 && sb.lastIndexOf(pattern) >= 0) {
                sb.replace(sb.indexOf(pattern), sb.indexOf(pattern) + pattern.length(), "");
                sb.replace(sb.lastIndexOf(pattern), sb.lastIndexOf(pattern) + pattern.length(), "");
                System.out.println("Shaked it.");
            }
            sb2.deleteCharAt((pattern.length()/2));
            pattern = sb2.toString();
        }
        System.out.println("No shake.");
        System.out.println(sb);
    }
}
