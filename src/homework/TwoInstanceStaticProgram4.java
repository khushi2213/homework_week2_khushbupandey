package homework;

/**
 * 4. Write a Java programme using the following steps.
 * 4.1 Declare two instance and two static variables.
 * 4.2 Declare one instance method.
 * 4.3 Declare one static method.
 * 4.4 Call all four instance and static variables into both instance and static methods inside the
 * print statement.
 * 4.5 Declare the Main method.
 * 4.6 Call both instance and static methods into the Main method and run the programme.
 */

public class TwoInstanceStaticProgram4 {

    int a = 1;
    int b = 2;
    static int c = 3;
    static int d = 4;

    public static void main(String[] args) {
        TwoInstanceStaticProgram4 obj1 = new TwoInstanceStaticProgram4();
        obj1.myCar(); //calling Instance method with object
        staticMethod(); //calling static method directly
    }

      public void myCar() {
        System.out.println("Instance method Value of a:  "+a);
        System.out.println("Instance method static variable Value of b: "+b);
        System.out.println("Instance method Value of c:  "+c);
        System.out.println("Instance method static variable Value of bd: "+d);

    }


        public static void staticMethod() {
            System.out.println("Static method instance variable Value of a : "+c); //calling instance variable in static method
            System.out.println("Static method Value of b:  "+d);
            System.out.println("Static method instance variable Value of c : "+c);
            System.out.println("Static method Value of d:  "+d);



    }



    }

