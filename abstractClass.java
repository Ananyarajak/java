abstract class animal{
   abstract void sound();
}
class cat extends animal{
    void sound(){
        System.out.println("meowwwww");
    }
}
class dog extends animal{
    void sound(){
        System.out.println("woffffff");
    }
}
public class abstractClass {
    public static void main(String[] args){
        animal s1= new cat();
        animal s2= new dog();
        s1.sound();
        s2.sound();

    }
}

// abstract class shape {
//     abstract void area();
// }

// class circle extends shape {
//     void area() {
//         System.out.println("3.14 r^2");
//     }
// }

// class rectangle extends shape {
//     void area() {
//         System.out.println("length* breadth");
//     }
// }

// public class abstractClass {
//     public static void main(String[] args) {
//         circle s1 = new circle();
//         s1.area();
//         rectangle s2 = new rectangle();
//         s2.area();
//     }
// }
