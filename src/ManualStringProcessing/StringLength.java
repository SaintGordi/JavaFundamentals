package ManualStringProcessing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Think on 3/15/2017.
 */
public class StringLength {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line = reader.readLine();

        if(line.length() >= 20){
            System.out.println(line.substring(0,20));
        }else{
            String s = "*";
            StringBuilder sb = new StringBuilder(line);

            System.out.println(sb.append(new String(new char[20 - line.length()]).replace("\0",s)));
        }
    }
}
