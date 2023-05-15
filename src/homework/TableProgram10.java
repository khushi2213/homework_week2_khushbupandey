package homework;

import java.util.Scanner;

/**10. Write a Java program that takes a number as input and prints its
 multiplication table up to 10.
 Test Data: Input a number: 8
 Expected Output :
 8 x 1 = 8
 8 x 2 = 16
 8 x 3 = 24
 ...
 8 x 10 = 80 */

public class TableProgram10 {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        myMethod();
    }

    public static void myMethod() {

        System.out.print("Input a number: ");
        int num1 =input.nextInt();
        for (int i=0; i< 10; i++)
        {
            System.out.println(num1 + " x " + (i + 1) + " = " + (num1 * (i + 1)));
        }
    }
}
