package Chapter5.Ex16;

public class Retread extends Tire {
    public static void main(String[] args) {
        new Retread().doStuff();
    }

    void doStuffs() throws ArithmeticException {
        System.out.println(7/0);
    }
    //

}
