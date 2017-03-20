package ManualStringProcessing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Think on 3/15/2017.
 */
public class ConvertFromBase10toBaseN {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split("\\s+");

        long base = Integer.parseInt(input[0]);
        long number = Integer.parseInt(input[1]);
        StringBuilder sb = new StringBuilder();
        if(base >=1){
            while (number != 0){
                sb.append(number%base);
                number = number/base;
            }
            System.out.println(sb.reverse());
        }

    }
}
