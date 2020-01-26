package Chapter2.Ex14;

public interface FrogBoilable {
    static int getCtoF(int cTEmp){
        return (cTEmp*9/5)+32;
    }

    default String hop(){
        return "hopping";
    }
}
