package ManualStringProcessing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Think on 3/16/2017.
 */
public class SummarizeBigNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String num1 = reader.readLine();
        String num2 = reader.readLine();
        int above = 0;
        StringBuilder sb = new StringBuilder();
        if(num1.length() >= num2.length()){
            for (int i = 0; i < num1.length(); i++) {
                int n1 = Integer.parseInt(String.valueOf(num1.charAt(num1.length()-i-1)));
                int n2 = Integer.parseInt(String.valueOf(num2.charAt(num2.length()-i-1)));
                int sum = n1+n2+above;
                if(sum>10){
                    sb.append(sum-10);
                    above=1;
                }else {
                    sb.append(sum);
                    above =0;
                }
            }
        }
        System.out.println(sb.reverse());
    }
}
