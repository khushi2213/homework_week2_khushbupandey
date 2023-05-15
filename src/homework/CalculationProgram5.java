package homework;
/**
 * 5. Write a program for a calculator with addition, subtraction, multiplication
 * and division methods all with parameters and use string concatenation
 * methods.(Note: Two static and Two instance methods.)
 */


import java.util.Scanner;


public class CalculationProgram5 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        addition();
        subtraction();
        CalculationProgram5 obj = new CalculationProgram5();
        obj.division();
        obj.multiplication();

    }


    public static void addition() {

        System.out.println("Addition");
        System.out.println("Enter Value 1;  ");
        int a = sc.nextInt();
        System.out.println("Enter Value 2;  ");
        int b = sc.nextInt();
        int result = a + b;
        System.out.println("Addition of " + a + " and  +b+  is " + result);

    }

    public static void subtraction()
    //Scanner sc =new Scanner(System.in);

    {
        System.out.println("Subtraction");
        System.out.println("Enter Value 1;  ");
        int a = sc.nextInt();
        System.out.println("Enter Value 2;  ");
        int b = sc.nextInt();
        int result = a - b;
        System.out.println("Subtraction of " + a + " and " + b + " is " + result);

    }

    public static void division() {
        System.out.println("division");
        System.out.println("Enter Value 1;  ");
        int a = sc.nextInt();
        System.out.println("Enter Value 2;  ");
        int b = sc.nextInt();
        int result = a / b;
        System.out.println("division of " + a + " and " + b + " is " + result);

    }

    public static void multiplication() {
        System.out.println("multiplication");
        System.out.println("Enter Value 1;  ");
        int a = sc.nextInt();
        System.out.println("Enter Value 2;  ");
        int b = sc.nextInt();
        int result = a * b;
        System.out.println("multiplication of " + a + " and " + b + " is " + result);

    }
}

