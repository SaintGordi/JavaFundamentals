package SetsAndMaps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Gordon on 2/28/17.
 */
public class FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String email = "";
        HashMap<String, String> mailBook = new HashMap<>();
        HashMap<String, String> mailBook2= new HashMap<>();

        String name = scanner.nextLine();
        while (!"stop".equals(name)) {
            email = scanner.nextLine();
            mailBook.put(name, email);
            name = scanner.nextLine();
        }

        Iterator it = mailBook.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry pair = (Map.Entry) it.next();
            if(pair.getValue().toString().endsWith("us") || pair.getValue().toString().endsWith("uk") || pair.getValue().toString().endsWith("com")){
              it.remove();
            }
        }
//        mailBook2.putAll(mailBook);
//        for (String s : mailBook.keySet()) {
//            if (mailBook.get(s).endsWith("us") || mailBook.get(s).endsWith("uk") || mailBook.get(s).endsWith("com")) {
//                mailBook2.remove(s);
//            }
//        }

        for (String ss : mailBook.keySet()) {
            System.out.println(ss + " -> " + mailBook.get(ss));
        }
    }
}

