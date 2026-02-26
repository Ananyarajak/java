import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(6);
        list.add(5);
         System.out.println(list);
         System.out.println(list.get(0));
         
        //list.remove(0);
        list.set(0,12);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.contains(26));
    }
}
