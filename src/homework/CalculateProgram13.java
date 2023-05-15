package homework;

import java.util.Scanner;

/**13. Write a Java program that takes three numbers as input to calculate and
        print the average of the numbers.*/


public class CalculateProgram13 {
     public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        myMethod();
    }

    public static void myMethod() {
        System.out.print("Input the first number: ");
        double a = input.nextDouble();
        System.out.print("Input the second number: ");
        double b = input.nextDouble();
        System.out.print("Input the third number: ");
        double c = input.nextDouble();
        double avg= (a+b+c)/3;
        System.out.print("The average value is " + avg);
    }

}
