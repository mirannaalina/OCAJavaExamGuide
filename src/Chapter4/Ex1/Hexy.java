package Chapter4.Ex1;

public class Hexy {

    public static void main(String[] args) {


        int i = 42;
        String s = (i < 20) ? "life" : (i > 48) ? "universe" : "everything";
        System.out.println(s);
    }
}
