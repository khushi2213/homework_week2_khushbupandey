package homework;

/** 2. Write a Java programme using the following steps.
 2.1 Declare two static variables
 2.2 Declare one static method
 2.3 Call both static variables into the static method inside the print statement.
 2.4 Declare the Main method.
 2.5 Call the static method into the Main method and Run the programme.*/

public class StaticVariablesProgram2
{
    static int a=10;
    static int b=20;
    static int result=a+b;


    public static void main(String[] args) {

        StaticVariablesProgram2 obj1 = new StaticVariablesProgram2();
        StaticVariablesProgram2 obj2 = new StaticVariablesProgram2();
        obj1.myHome();
        obj2.myHome();

    }

    public static void myHome() {

        System.out.println("Value of a : " + a);
        System.out.println("Value of b : " + b);;
        System.out.println(result);
        }
    }

