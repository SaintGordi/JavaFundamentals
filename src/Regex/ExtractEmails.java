package Regex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Think on 3/18/2017.
 */
public class ExtractEmails {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Pattern pattern = Pattern.compile
                ("(\\s|^)[a-zA-Z]+(\\.*\\-*[\\w]+){1,}@([a-zA-Z0-9\\r\\n-]+\\.+){1,}[a-zA-Z0-9]+[^.,$\\s_]");
        String line = "";

        while (!"end".equals(line = reader.readLine())){
            Matcher matcher = pattern.matcher(line);
            if(matcher.find() == true){
                System.out.println(matcher.group().trim());
            }else {
//                System.out.println("(no output)");
            }
            while (matcher.find()){
                System.out.println(matcher.group().trim());
            }
        }

    }
}
