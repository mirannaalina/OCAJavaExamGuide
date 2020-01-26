package Chapter5.Ex1;

public class Flipper {
    public static void main(String[] args) {
        String o = "-";
        switch ("RED".toLowerCase()){
            case "yellow":
                o+="y";
            case "red":
                o+="r";
            case "green":
                o+="g";
        }
        System.out.println(o);
    }
}
