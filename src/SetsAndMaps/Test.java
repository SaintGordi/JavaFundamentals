package SetsAndMaps;

/**
 * Created by Gordon on 3/1/17.
 */
public class Test {
    public static void main(String[] args) {
        String s1 = "10C";
        String str = s1.replaceAll("\\D","");
        int x = Integer.parseInt(str);
        System.out.println(x + s1);
    }
}
