package homework;
/**
 * 6. Write a program to enter any radius value of the circle and find out the
 * area.(Formula of Area A=PI*r*r).
 */

import java.util.Scanner;

public class AreaProgram6 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        myMethod();
    }

    public static void myMethod() {
        System.out.print("Enter radius of circle: ");
        Double radius = sc.nextDouble();
        Double area = Math.PI * radius * radius; // Pi value is predefine (3.14)
        System.out.println("Area Of Circle is = " + area);

    }

}