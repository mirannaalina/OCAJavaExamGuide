package Chapter6.Ex5;

import java.util.ArrayList;

public class Sequence {

    public static void main(String[] args) {
        ArrayList<String> myLis = new ArrayList<>();

        myLis.add("apple");
        myLis.add("carrot");
        myLis.add("banana");
        myLis.add(1,"plum");
        System.out.println(myLis);
    }
}
