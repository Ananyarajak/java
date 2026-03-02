class Animal {
    protected void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    void display() {
        sound(); // ✅ Accessible (Inheritance)
    }
}

public class protectedModifier {
    public static void main(String[] args) {
        Dog a1 = new Dog();
        a1.display();
    }
}
