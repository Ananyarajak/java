// class main{   //method overloading
//     void add(){
//         System.out.println("hellooo");
//     }
//      void add(int a){
//         System.out.println("a");
//     }
//      void add(int a,int b){
//         System.out.println(a+b);
//     }
// }
// public class polymorphism {
//     public static void main(String[] args) {
//         main s1= new main();
//         s1.add();
//         s1.add(6);
//         s1.add(6,7);
//     }

// }

class Animal { // method overriding
    void sound() {
        System.out.println("animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("dog barks");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("cat meoww");
    }
}

public class polymorphism {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        a1.sound();

        Dog d1 = new Dog();
        d1.sound();

        Cat c1 = new Cat();
        c1.sound();
    }

}