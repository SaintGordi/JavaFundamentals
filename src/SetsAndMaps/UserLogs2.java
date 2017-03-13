package SetsAndMaps;

import jdk.nashorn.internal.ir.WhileNode;

import java.util.*;

/**
 * Created by Gordon on 3/1/17.
 */
public class UserLogs2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Username, IP, messages[]
        TreeMap<String, LinkedHashMap<String, Integer>> logs = new TreeMap<>();
        String row = "";
        while (!"end".equals((row = scanner.nextLine()))) {
            String[] logRow = row.split(" ");
            String ip = logRow[0].substring(3);
            String message = logRow[1];
            String uName = logRow[2].replaceAll("user=", "");
            if (logs.get(uName) == null) {
                logs.put(uName, new LinkedHashMap<String, Integer>());
            }
            if (logs.get(uName).get(ip) == null) {
                logs.get(uName).put(ip, 0);
            }
            int var = logs.get(uName).get(ip) + 1;
            logs.get(uName).put(ip, var);
        }
//        for (Map.Entry<String, LinkedHashMap<String, ArrayList<String>>> entry : logs.entrySet()) {
//            System.out.print(entry.getKey() + ":");
//            for (Map.Entry<String, ArrayList<String>> entry2 : entry.getValue().entrySet()) {
//                System.out.printf("%n%S => %d", entry2.getKey(), entry2.getValue().size());
//            }
//
//            System.out.print(".");
//            System.out.println();
//
//            // System.out.printf("%s:%n %s => %d,",entry.getKey(),);
//        }


        System.out.println();


        for (Map.Entry<String, LinkedHashMap<String, Integer>> entry : logs.entrySet()) {
            System.out.println(entry.getKey() + ":");
            Iterator it = entry.getValue().entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry pair = (Map.Entry) it.next();
                System.out.printf(" %S => %d", pair.getKey(), pair.getValue());
                if (it.hasNext()) {
                    System.out.print(",");
                }
            }
            System.out.print(".");
            System.out.println();

            // System.out.printf("%s:%n %s => %d,",entry.getKey(),);
        }
    }
}