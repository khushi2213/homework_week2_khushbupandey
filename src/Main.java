public class Main {
    int a = 5;
    static int b = 10;


    public static void main(String[] args) {
        myCar1();
        Main object = new Main();
        object.myCar();

    }


    public void myCar() {
        System.out.println(a);


    }

    public static void myCar1() {
        System.out.println(b);

    }

}




