package Chapter1.Exercise11;

public class TestSIF implements StaticIface {

    @Override
    public int m3() {
        return 0;
    }

    public static void main(String[] args) {

        System.out.println(StaticIface.m1());

        new TestSIF().go();
        //System.out.println(m1()); nu poti avea metoda fara interfata de unde provine

    }

    void go(){
        System.out.println(StaticIface.m1());
    }
}
