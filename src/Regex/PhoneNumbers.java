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
public class PhoneNumbers {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Pattern pattern = Pattern.compile
                ("([A-Z]+[a-zA-Z]*)[^A-Z]*?(\\+*[0-9]{1,}[0-9,\\/.\\s\\-()]*[0-9])");

        String line = "";
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        while (!"END".equals(line = reader.readLine())) {
            sb.append(line);
        }
        Matcher matcher = pattern.matcher(sb.toString());
        if (!matcher.find()) {
            System.out.println("<p>No matches!</p>");
        } else {
            matcher.reset();
            StringBuilder endLine = new StringBuilder();
            while (matcher.find()) {
                String name = matcher.group(1);
                String phone = matcher.group(2);

                if (phone.contains("+")) {
                    phone = phone.replaceAll("\\D", "");
                    phone = "+" + phone;
                } else {
                    phone = phone.replaceAll("\\D", "");
                }
                endLine.append(String.format("<li><b>%s:</b> %s</li>", name, phone));
            }
            endLine.append("</ol>");
            System.out.printf("<ol>%s",endLine.toString());
        }

    }
}
