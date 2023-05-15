package homework;

/**
 * 3. Write a Java programme using the following steps.
 * 3.1 Declare one instance and one static variable.
 * 3.2 Declare one instance method.
 * 3.3 Declare one static method.
 * 3.4 Call both instance and static variables into both instance and static methods inside the
 * print statement.
 * 3.5 Declare the Main method.
 * 3.6 Call both instance and static methods into the Main method and run the programme.
 */


public class InstanceStaticProgram3 {
    int a = 30;
    static int b = 40;


    public static void main(String[] args) {

        InstanceStaticProgram3 obj = new InstanceStaticProgram3();
        obj.myPen(); //calling Instance method with object
        staticMethod(); //calling static method directly
    }

    public void myPen() {
        System.out.println("Instance method Value of a:  "+a);
        System.out.println("Instance method static variable Value of b: "+b);

    }

    public static void staticMethod() {
        System.out.println("Static method instance variable Value of a : "+b); //calling instance variable in static method
        System.out.println("Static method Value of b:  "+b);
    }


}