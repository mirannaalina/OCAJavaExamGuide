package Chapter2.Ex14;

public class DontBoilFrogs implements FrogBoilable {

    public static void main(String[] args) {


        new DontBoilFrogs().go();
    }

    void go() {
        System.out.println(hop());
       // System.out.println(getCtoF(100));
        System.out.println(FrogBoilable.getCtoF(100));
        DontBoilFrogs dbf = new DontBoilFrogs();
       // System.out.println(dbf.getCtoF(100));

    }
}
