//  class student {
//     public student(){
//         System.out.println("hii");
//     }
//     void call(){
//         System.out.println("hello");
//     }
// }
// class constructor{
//     public static void main(String[] args) {
//         student s1=new student();
//         s1.call();
//     }
// }

// class student {
//     int rollNo;
//     String name;

//     public student(int rollNo, String name) {
//         this.rollNo = rollNo;
//         this.name = name;
//     }

//     void detail() {
//         System.out.println(rollNo + " " + name);
//     }
// }

// class constructor {
//     public static void main(String[] args) {
//         student s1 = new student(6, " ananya");
//         student s2 = new student(5, " riya");
//         s1.detail();
//         s2.detail();
//     }
// }

// class laptop {
//     int price;
//     double ram;
//     String brand;

//     public laptop(String brand, int price, double ram) {
//         this.price = price;
//         this.ram = ram;
//         this.brand = brand;
//     }
//     void detail() {
//         System.out.println(brand + " " + price + " " + ram);
//     }
// }
// class constructor {
//     public static void main(String[] args) {
//         laptop s1 = new laptop(" macbook", 60000, 5.5);
//         laptop s2 = new laptop(" dell", 75000, 4.5);
//         s1.detail();
//         s2.detail();
//     }
// }

// class calculator {
//     int a;
//     int b;
//     public calculator(int a, int b) {

//     }

//     void addition(int a, int b) {
//         System.out.println(a+b);
//     }

//     void substract(int a, int b) {
//         System.out.println(a-b);
//     }

//     void multiply(int a, int b) {
//         System.out.println(a*b);
//     }

//     void divition(int a, int b) {
//         System.out.println(a/b);
//     }
// }

// public class constructor {
//     public static void main(String[] args) {
//         calculator s1 = new calculator(12,4);

//         s1.addition(12,4);

//     }
// }

class movie {
    String name;
    double rate;
    int releaseYear;

    movie(String name, double rate, int releaseYear) {
        this.name = name;
        this.rate = rate;
        this.releaseYear = releaseYear;
    }

    void display() {
        System.out.println("name" + name);
        System.out.println("rate" + rate);
        System.out.println("releaseYear" + releaseYear);
    }
}

public class constructor {
    public static void main(String[] args) {
        movie m1 = new movie(" spider man", 8.3, 2021);
        movie m2 = new movie(" RRR", 8.0, 2022);
        movie m3 = new movie(" Javan", 7.9, 2023);
        movie m4 = new movie(" Shiddat", 8.9, 2020);
        movie m5 = new movie(" Mr. India", 6.8, 2012);

        movie[] movies = { m1, m2, m3, m4, m5 };
        for (int i = 0; i < movies.length; i++) {
            if (movies[i].releaseYear > 2020) {
                movies[i].display();
            }
        }
    }
}