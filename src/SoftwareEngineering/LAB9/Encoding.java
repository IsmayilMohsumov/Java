package SoftwareEngineering.LAB9;

import java.nio.charset.StandardCharsets;

public class Encoding {

    public static void main(String[] args) {
         int a = 7559^11   ;
         int b = 63  ;
      // converting to binary and representing it in a string
      int bin =a % b;
      System.out.println(bin);
    }

}
