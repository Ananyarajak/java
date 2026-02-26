// class Atm {
//     private int paisa;

//     public Atm(int r) {
//         this.paisa = r;
//     }

//     public int gatter(int a) {
//         return paisa;
//     }
// }

// public class encapsulation {
//     public static void main(String[] args) {
//         Atm s1 = new Atm(100);
//         System.out.println(s1.gatter(20));
//     }
// }

// class student {
//     private String name;
//     private int marks;

//     public student(String n, int m) {
//         this.name = "ananya";
//         this.marks = 87;
//     }

//     public String gatter(String a) {
//         return name;
//     }

//     public int gatter(int b) {
//         return marks;
//     }
// }

// public class encapsulation {
//     public static void main(String[] args) {
//         student s1 = new student("ananya", 87);
//         System.out.println(s1.gatter("riya"));
//         System.out.println(s1.gatter(87));
//     }
// }

// class employee {
//     private String name;
//     private int id;
//     private double salary;

//     public employee(String n, int i, double s) {
//         this.name = "ananya";
//         this.id = 8;
//         this.salary= 45000;
//     }

//     public String gatter(String a) {
//         return name;
//     }

//     public int gatter(int i) {
//         return id;
//     }

//     public double gatter(double s) {
//         return salary;
//     }
// }

// public class encapsulation {
//     public static void main(String[] args) {
//         employee s1 = new employee("ananya", 8, 45000);
//         System.out.println(s1.gatter("ananya"));
//         System.out.println(s1.gatter(8));
//         System.out.println(s1.gatter(45000.00));
//     }
// }

class temperature {
    private int celcius;

    public temperature(int c) {
        this.celcius = c;
    }

    public int gatter() {
        return celcius;
    }

    public double getFahrenhite() {
        return (celcius * 1.8) + 32;
    }
}

public class encapsulation {
    public static void main(String[] args) {
        temperature t1 = new temperature(25);
        System.out.println("temperature in fehrenhite:" + t1.getFahrenhite());
    }
}