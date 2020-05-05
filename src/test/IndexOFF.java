package test;

import java.util.ArrayList;
import java.util.List;

public class IndexOFF {

    public static void main(String[] args) {

        List<String> st  = new ArrayList<>();

        st.add("Paris");
        st.add("Oslo");

        System.out.println(st);

        st.add(2,"Bucharest");

        System.out.println(st);
    }
}
