package Chapter2.Ex10;

public class Tenor extends Singer {

    public static void main(String[] args) {
        Tenor t = new Tenor();
        Singer s = new Singer();
        System.out.println(t.sing()+ " "+s.sing());
    }
}
