package Z;

import java.util.Scanner;

public class TestClass {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int number1 = 0, number2 = 0;
        fillAndSwap(number1, number2);
    }

    public static void fillAndSwap(int number1, int number2) {
        int temp=0;
        System.out.println("Please ener 1st value:");
        number1 = scanner.nextInt();
        System.out.println("Please ener 2nd value:");
        number2 = scanner.nextInt();

        soutm(number1, number2);
                
        
        temp= number1;
        number1=number2;
        number2=temp;
        soutm(number1, number2);
        
        
        
    }
    public static  void soutm(int number1, int number2) {
        System.out.println("after swap : "
                + " number1 is :" + number1
                + "number2 is :" + number2);
    }
}
