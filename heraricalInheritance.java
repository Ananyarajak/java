class animal{
    void eat(){
        System.out.println("pizza");
    }
}
class dog extends animal {
    void bark(){
        System.out.println("barkinggg....");
    }
}
class puppy extends animal{
    void play(){
        System.out.println("slepppp....");
    }
}
public class heraricalInheritance{
    public static void main(String[] args) {
        puppy s1= new puppy();
        dog s2= new dog();
        s1.eat();
        s2.eat();
    }
}



