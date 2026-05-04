class Student {

    // Private variables (data hiding)
    private String name;
    private int age;

    // Public setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if(age > 0) {      // validation
            this.age = age;
        } else {
            System.out.println("Invalid age");
        }
    }

    // Public getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student();

        // Setting values using setter
        s1.setName("Sarthak");
        s1.setAge(19);

        // Getting values using getter
        System.out.println("Name: " + s1.getName());
        System.out.println("Age: " + s1.getAge());
    }
}