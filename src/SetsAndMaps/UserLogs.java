package SetsAndMaps;

import jdk.nashorn.internal.ir.WhileNode;

import java.util.*;

/**
 * Created by Gordon on 3/1/17.
 */
public class UserLogs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Username, IP, messages[]
        TreeMap<String, LinkedHashMap<String, ArrayList<String>>> logs = new TreeMap<>();
        String row = "";
        while (!"end".equals((row = scanner.nextLine()))) {
            String[] logRow = row.split(" ");
            String ip = logRow[0].substring(3);
            String message = logRow[1];
            String uName = logRow[2].replaceAll("user=", "");
            if (logs.get(uName) == null) {
                logs.put(uName, new LinkedHashMap<String, ArrayList<String>>());
            }
            if (logs.get(uName).get(ip) == null) {
                logs.get(uName).put(ip, new ArrayList<String>());
            }
            logs.get(uName).get(ip).add(message);
        }
        for (Map.Entry<String, LinkedHashMap<String, ArrayList<String>>> entry : logs.entrySet()) {
            System.out.print(entry.getKey() + ":");
            for (Map.Entry<String, ArrayList<String>> entry2 : entry.getValue().entrySet()) {
                System.out.printf("%n%S => %d", entry2.getKey(), entry2.getValue().size());
            }

            System.out.print(".");
            System.out.println();

            // System.out.printf("%s:%n %s => %d,",entry.getKey(),);
        }
    }
}