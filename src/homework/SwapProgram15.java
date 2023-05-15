package homework;

import java.util.Scanner;

public class SwapProgram15 {


    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        myMethod();
    }

    public static void myMethod() {
        System.out.print("Input the first number: ");
        int x = input.nextInt();
        System.out.print("Input the second number: ");
        int y = input.nextInt();
        int z;
        z = x;
        x = y;
        y = z;
        System.out.println("Swapped values of first value and second value:" + x + " and " +y);




    }
}
