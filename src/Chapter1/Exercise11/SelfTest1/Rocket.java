package Chapter1.Exercise11.SelfTest1;

import static java.lang.System.*;

interface Device{
    public void doIt();
}

public class Rocket implements Device {

    @Override
    public void doIt() {

    }

    private void blastoff(){
        System.out.println("bang");
    }
}

abstract class iphone1 extends Rocket implements Device{
    public void doIt(int __x) {

    }

}

class Shuttle extends Rocket{

public static void main(String[]args){

    new Shuttle().go();

        }
        void go(){
    blastoff();
    //Rocket.blastoff();
        }
        private void blastoff(){
            System.out.println("ah-bang");
        }
}
