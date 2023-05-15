package homework;
/**16. Write a Java program to add two binary numbers.

 Input Data:
 Input first binary number: 10
 Input second binary number: 11
 Expected Output:

 Sum of two binary numbers: 101 */

import java.util.Scanner;

public class BinaryProgram16 {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        myMethod();
    }

    public static void myMethod() {
        System.out.println("Enter The First and Second Numbers = ");
        String b1 = input.nextLine();
        String b2 = input.nextLine();

        int num1 = Integer.parseInt(b1, 2);
        int num2 = Integer.parseInt(b2, 2);

        int output = num1 + num2;

        System.out.print("\nThe Sum = ");
        System.out.print(Integer.toBinaryString(output));


    }
}
