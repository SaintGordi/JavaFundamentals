package Regex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Think on 3/17/2017.
 */
public class SeriesOfLetters {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine();
        String regex = "([a-z])\\1{0,}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        StringBuilder sb = new StringBuilder(text);

        while (matcher.find()) {
            String str = matcher.group();

           text = text.replaceFirst(str, String.valueOf(str.charAt(0)));
        }

        System.out.println(text);

    }
}
