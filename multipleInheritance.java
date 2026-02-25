class A{      //multipleInheritance wont work becuase of diamond problem
    void run(){

    }
}
class B{
    void running(){

    }
} 
class C extends A,B{
    void run(){

    }
}

public class multipleInheritance {
    public static void main(String[] args) {
        C s1= new C();
        s1.run();
    }
}
