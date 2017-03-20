package ManualStringProcessing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Think on 3/16/2017.
 */
public class LettersChangeNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = reader.readLine().split("\\s+");
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        double sum = 0;
        for (int i = 0; i < strings.length; i++) {
            String letter1 = strings[i].substring(0,1);
            String letter2 = strings[i].substring(strings[i].length()-1,strings[i].length());
            double number = Double.parseDouble(strings[i].substring(1,strings[i].length()-1));
            if(alphabet.contains(letter1)){
                number = number * (alphabet.indexOf(letter1)+1);
            }else if(alphabet.toUpperCase().contains(letter1)){
                number = number / (alphabet.toUpperCase().indexOf(letter1)+1);
            }

            if(alphabet.contains(letter2)){
                number = number + (alphabet.indexOf(letter2)+1);
            }else if(alphabet.toUpperCase().contains(letter2)){
                number = number - (alphabet.toUpperCase().indexOf(letter2)+1);
            }

            sum = sum+number;
        }
        System.out.println(String.format("%.2f",sum));
    }
}
