package Chapter1.Exercise11;

public interface StaticIface {

     static int m1(){
         return 42;
     }
     default int m2(){
         return 3;
     }

     abstract int m3();


}
