package org.nextbyte;

import java.io.File;
import java.io.FileInputStream;
import java.nio.charset.StandardCharsets;

public class ExceptionBasics {

    public static void main(String[] args) {
        int a = 4;
        int b = 0;
        //System.out.println(a/b);


        File f = new File("D:\\NextByte\\User.txt");
        try {
            System.out.println("Try reading file");
            FileInputStream is = new FileInputStream(f);
            byte[] bytes = is.readAllBytes();
            String content = new String(bytes, StandardCharsets.UTF_8);
            System.out.println(content);
        }catch (Exception e){
            System.out.println("Error while reading file from disk");
        }finally {
            System.out.println("THis is finally block");
        }
        System.out.println("Execution completed");
    }
}
