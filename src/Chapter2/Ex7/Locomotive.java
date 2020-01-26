package Chapter2.Ex7;

import java.time.LocalDate;

import static com.sun.tools.jdeps.Main.main;

public class Locomotive {

    Locomotive(){
        main("hi");
    }

    public static void main(String[] args) {
        System.out.println("2");
    }

    public static void main(String args) {
        System.out.println("3 "+ args);

    }
}
