package Exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Think on 3/19/2017.
 */
public class Earthquake {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine().trim());
        List<ArrayDeque<Integer>> waves = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        int counter = 0;
        for (int i = 0; i < N; i++) {
            String[] line = reader.readLine().split(" ");
            if(!line[0].equals("")){
                waves.add(new ArrayDeque<Integer>());
                for (int j = 0; j < line.length; j++) {
                    waves.get(counter).offer(Integer.parseInt(line[j]));
                }
                counter++;
            }
        }
        while (waves.size()>0){
            for (int i = 0; i < waves.size(); i++) {
                int first = waves.get(i).poll();
                if(waves.get(i).size()==0){
                    sb.append(first).append(" ");
                    waves.remove(i);
                    break;
                }
                while (true){
                    if(first > waves.get(
                            i).peek()){
                        waves.get(i).remove();
                    }else if(first == waves.get(i).peek()){
                        sb.append(first).append(" ");
                        waves.get(i).remove();
                        break;
                    }else {
                        sb.append(first).append(" ");
                        break;
                    }

                }
            }

        }
        System.out.println(sb.toString().replaceAll("\\s+","").length());
        System.out.println(sb.toString());
    }
}
