package homework;
/**17. Write a Java program to convert a decimal number to binary number.

 Input Data:
 Input a Decimal Number : 5
 Expected Output

 Binary number is: 101
 */
import java.util.Scanner;

public class DecimalBinaryProgram17 {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        myMethod();
    }

    public static void myMethod() {
        System.out.println("Input a decimal number");
        int dec = input.nextInt();

        String bin = Integer.toBinaryString(dec);
        System.out.println("Binary number is " +bin);



    }
}
