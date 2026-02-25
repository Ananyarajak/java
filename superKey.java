class paint {
    String color = "green";
}

class wall extends paint {
    String color = "red";

    void print() {
        System.out.println(color);
        System.out.println(super.color);
    }
}

public class superKey {
    public static void main(String[] args) {
        wall s1 = new wall();
        s1.print();
    }
}
