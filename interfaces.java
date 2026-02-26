// interface Animal{
//     void sound();
// }
// class Dog implements Animal{
//     public void sound(){
//         System.out.println("woffff....");
//     }
// } 
// public class interfaces {
//     public static void main(String[] args) {
//         Animal a1= new Dog();
//         a1.sound();
//     }


// using same method 
//  interface Animal{
//     void run();  
//   }
//   interface Dog{
//     void run();
//   }
//  class cat implements Animal,Dog{
//     public void run(){
//         System.out.println("runninggggg");
//     }
//  }
//  public class interfaces{
//     public static void main(String[] args) {
//         Animal a1 = new cat();
//          a1.run();
//     }
//  }


// using different method 
interface Animal{
    void run();  
  }
  interface Dog{
    void eat();
  }
 class cat implements Animal,Dog{
    public void run(){
        System.out.println("runninggggg");
    }
     public void eat(){
        System.out.println("eatinggggg");
    }
 }
 public class interfaces{
    public static void main(String[] args) {
        Animal a1 = new cat();
         a1.run();
         Dog d1 = new cat();
         d1.eat();
    }
 }
