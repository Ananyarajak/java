// class animal{
//     void eat(){
//         System.out.println("pizza");
//     }
// }
// class dog extends animal{
//     void bark(){
//         System.out.println("barkinggg....");
//     }
// }
// class puppy extends dog{
//     void play(){
//         System.out.println("slepppp....");
//     }
// }
// public class  multiInheritence {
//     public static void main(String[] args) {
//         puppy s1= new puppy();
//         s1.bark();
//         s1.eat();
//         s1.play();

//     }
// }



class person{
    void displayName(){
        System.out.println("ananya");
    }
}
class student extends person{
    void displayClass(){
        System.out.println("cse");
    }
}
class monitor extends student{
    void checkDiscipline(){
        System.out.println("keep quit");
    }
}
public class  multiInheritence {
    public static void main(String[] args) {
        monitor s1= new monitor();
        s1.displayName();
        s1.displayClass();
        s1.checkDiscipline();

    }
}


