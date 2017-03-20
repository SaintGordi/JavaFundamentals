package Regex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Think on 3/17/2017.
 */
public class ReplaceATag {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String regex = "<a(\\s*href=[^>]+)>([^<]+)<\\/a>";
        Pattern pattern = Pattern.compile(regex);

        StringBuilder sb = new StringBuilder();
        String line = "";

        while (!"END".equals(line = reader.readLine())) {
            sb.append(line).append("\r\n");
        }
        Matcher matcher = pattern.matcher(sb.toString());
        String text = "";
        while(matcher.find()){
            sb.replace(matcher.start(),matcher.end(),
                    "[URL"+ matcher.group(1) + "]" + matcher.group(2)+"[/URL]");
            matcher = pattern.matcher(sb.toString());
        }
        System.out.println(sb.toString());
    }
}
