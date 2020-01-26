package Chapter2.Ex12;

import Chapter2.Ex8.Hound;

import java.util.ArrayList;

public class House extends Building{

    House(){
        System.out.println("h ");

    }
    House(String name) {

    this();
        System.out.println("hn "+ name);
    }

    public static void main(String[] args) {
        new House("x");
        String ar[] = {"3","4"};

        ArrayList<String> arr = new ArrayList<>();
    }
}
