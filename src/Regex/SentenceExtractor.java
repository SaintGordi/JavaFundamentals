package Regex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Think on 3/18/2017.
 */
public class SentenceExtractor {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String keyword = reader.readLine();

        String line = reader.readLine();
        Pattern pattern = Pattern.compile("((?<=^|\\!|\\.|\\?)[^!.?]+(!|\\.|\\?))");
        Matcher matcher = pattern.matcher(line);

        while (matcher.find()){
            if(matcher.group().contains(" "+keyword+" ")){
                System.out.println(matcher.group().trim());
            }
        }
    }
}
