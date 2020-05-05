package test;

public class IfSo {

    public static void main(String[] args) {
        IfSo s = new IfSo();

        s.go(3);
    }

    boolean go(Integer so){
        Boolean ifSo = true;

        if(ifSo){
            System.out.println(++so);
        }

        return ifSo;
    }
}
