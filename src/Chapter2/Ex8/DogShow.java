package Chapter2.Ex8;

public class DogShow {

    public static void main(String[] args) {
        new DogShow().go();
    }

    void go(){
        new Hound().bark();
        ((Dog) new Hound()).bark();
       // ((Dog) new Hound()).sniff();
    }
}
