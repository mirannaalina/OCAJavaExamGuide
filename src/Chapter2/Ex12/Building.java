package Chapter2.Ex12;

public class Building {

    Building(){
        System.out.println("b ");
    }
    Building(String name){
        this();
        System.out.println("bn "+name);
    }

}
