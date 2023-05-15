package homework;
//9. Write a program to convert the upper case to lower case.

import java.util.Scanner;

public class UpperCaseToLowerCaseProgram9
{
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        myMethod();
    }

    public static void myMethod() {


        System.out.println("Enter the string");
        String txt= sc.nextLine();
        System.out.println(txt.toLowerCase());
    }
}