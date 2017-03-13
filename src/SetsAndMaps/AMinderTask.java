package SetsAndMaps;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Gordon on 2/28/17.
 */
public class AMinderTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = 0;
        HashMap<String,Integer> resources = new HashMap<>();
        String element = scanner.nextLine();
        while (!"stop".equals(element)){
            amount = Integer.parseInt(scanner.nextLine());
            if(resources.containsKey(element)){
                resources.put(element,amount+resources.get(element));
            }else{
                resources.put(element,amount);
            }
            element = scanner.nextLine();
        }

        for (String s : resources.keySet()) {
            System.out.println(s+" -> "+resources.get(s));
        }
    }
}
