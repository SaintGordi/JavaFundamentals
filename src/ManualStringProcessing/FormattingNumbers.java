package ManualStringProcessing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Think on 3/15/2017.
 */
public class FormattingNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split("\\s+");
        int a = Integer.parseInt(input[0]);
        double b = Double.parseDouble(input[1]);
        double c = Double.parseDouble(input[2]);
        StringBuilder sb = new StringBuilder();

        String aa = Integer.toBinaryString(a);
        while (aa.length()<10){
            aa = "0" + aa;
        }
        if (aa.length()>10){
            aa = aa.substring(0,10);
        }
        sb.append("|").append(String.format("%-10X",a))
                .append("|").append(String.format("%s", aa))
                .append("|").append(String.format("%10.2f",b))
                .append("|").append(String.format("%-10.3f",c))
                .append("|");
        System.out.println(sb);

    }
}
