package homework;

import java.util.Scanner;

/**
 * 12. Write a Java program to compute the specified expressions and print the
 * output.
 * Test Data:
 * ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
 * Expected Output : 2.138888888888889
 */

public class ExpressionProgram12 {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        myMethod();
    }

    public static void myMethod() {

        System.out.println((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
    }


}
