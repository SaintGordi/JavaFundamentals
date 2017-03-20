package ManualStringProcessing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Think on 3/16/2017.
 */
public class ExtractHyperlinks {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = "";
        String linkMark = "href=";
        while (!(line = reader.readLine()).equals("END")) {
            while (line.contains(linkMark)) {
                StringBuilder sb = new StringBuilder(line);
                int start = sb.indexOf(linkMark) + linkMark.length() + 1;
                int end = sb.indexOf("\"", start);
                System.out.println(sb.substring(start, end));
                line = sb.replace(start - linkMark.length() - 2,end,"").toString();
            }

        }
    }
}
