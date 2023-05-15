package homework;

import java.util.Scanner;

/**19. Write a Java program to convert a given string into lowercase.
 Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
 Output: the quick brown fox jumps over the lazy dog.
 */
public class LowercaseStringProgram19
{
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        myMethod();
    }

    public static void myMethod() {


        System.out.println("Enter the string");
        String txt= sc.nextLine();
        System.out.println(txt.toLowerCase());
    }
}

