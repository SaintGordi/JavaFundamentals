package FilesAndDirectories;

import java.io.*;

/**
 * Created by Think on 3/14/2017.
 */
public class Test {
    public static void main(String[] args) {
        String path = "D:\\input.txt";
        String outPath = "D:\\output.txt";
//        FileInputStream fileStream = null;
//        try {
//            fileStream = new FileInputStream(path);
//            int oneByte = fileStream.read();
//            while (oneByte >= 0) {
//                System.out.println(oneByte);
//                oneByte = fileStream.read();
//            }
//            fileStream.close();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


        try (FileInputStream fis = new FileInputStream(path)) {
            int bytee = fis.read();
            while (bytee >= 0) {
                System.out.println(bytee);
                bytee = fis.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        //read file binary
        try (FileInputStream fis = new FileInputStream(path)) {
            int oneByte = fis.read();
            while (oneByte >= 0) {
                System.out.print(Integer.toBinaryString(oneByte) + " ");
                oneByte = fis.read();

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        //write file
        try (FileInputStream fis = new FileInputStream(path);
             FileOutputStream fos = new FileOutputStream(outPath)) {
            int oneByte = fis.read();
            while (oneByte >= 0) {
                fos.write(oneByte);
                oneByte = fis.read();

            }
        } catch (IOException e) {

            e.printStackTrace();
        }
    }
}

