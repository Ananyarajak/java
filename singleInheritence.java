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
// public class singleInheritence {
//     public static void main(String[] args) {
//         dog s1= new dog();
//         s1.bark();
//         s1.eat();

//     }
// }



class employee{
    void work(){
        System.out.println("workinggg...");
    }
}
class manager extends employee{
    void attendMeeting(){
        System.out.println("attendinggg...");
    }
}
public class singleInheritence {
    public static void main(String[] args) {
        manager s1= new manager();
        s1.work();
        s1.attendMeeting();

    }
}