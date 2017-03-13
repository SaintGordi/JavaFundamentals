package SetsAndMaps;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * Created by Gordon on 3/5/17.
 */
public class LogsAggregator {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int rows = Integer.parseInt(scanner.nextLine());
       String[] row = new String[rows];
        for (int i = 0; i < rows; i++) {
            row[i] = scanner.nextLine();
        }
        Map<String, Map<String, Integer>> logs = new TreeMap<>();
        Map<String, Integer> userTime = new TreeMap<>();
        for (String s : row) {
            String[] temp = s.split(" ");
            String userName = temp[1];
            String ip = temp[0];
            Integer duration = Integer.parseInt(temp[2]);
            if(!logs.containsKey(userName)){
                logs.put(userName, new TreeMap<>());
                userTime.put(userName,0);

            }
            if(logs.get(userName).containsKey(ip)){
                int dur = duration+logs.get(userName).get(ip);
                logs.get(userName).put(ip,dur);

            }else{
                logs.get(userName).put(ip,duration);
            }
            userTime.put(userName,duration + userTime.get(userName));
        }
        System.out.println();

        for (Map.Entry<String, Map<String, Integer>> entry : logs.entrySet()) {
            String str = entry.getValue().toString().replaceAll("=+\\d+","").replaceAll("\\{","[").replaceAll("\\}","]");
            System.out.printf("%s: %d %s%n",entry.getKey(),userTime.get(entry.getKey()),
                    str);

        }

    }
}
