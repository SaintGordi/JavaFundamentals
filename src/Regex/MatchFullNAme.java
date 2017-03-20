package Regex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.*;

/**
 * Created by Think on 3/17/2017.
 */
public class MatchFullNAme {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine();
        String regex = "^[A-Z][a-z]+ [A-Z][a-z]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (!"end".equals(text)){
            if (Pattern.matches(regex,text)){
                System.out.println(text);
            }
            text = reader.readLine();
        }
    }
}
