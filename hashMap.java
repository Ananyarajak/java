import java.util.HashMap;

// public class hashMap {
//     public static void main(String[] args) {
//         HashMap<Integer,String> map= new HashMap<>();
//         map.put(0,"ananya");
//         map.put(1,"bhoomika");
//         map.put(2,"anushka");
//         map.put(3,"sarthak");
//         map.put(4,"priyesh");
//         System.out.println(map);
//         System.out.println(map.get(0));
//         map.remove(4);
//         System.out.println(map.containsKey(4));
//          System.out.println(map.containsValue("bhoomika"));
//     }
// }

// public class hashMap {
//     public static void main(String[] args) {
//         HashMap<Character,Integer> map= new HashMap<>();
//         String str="ananya";
//         for(int i=0;i<str.length();i++){
//             char ch= str.charAt(i);
//             map.put(ch,map.getOrDefault(ch, 0)+1);  
//          }
//          System.out.println(map);   
//     }
// }

// public class hashMap {
//     public static void main(String[] args) {
//         HashMap<Character, Integer> map = new HashMap<>();
//         String str = "ananya";
//         for (int i = 0; i < str.length(); i++) {
//             char ch = str.charAt(i);
//             map.put(ch, map.getOrDefault(ch, 0) + 1);
//         }
//         for (char ch : map.keySet()) {
//             if (map.get(ch) == 1) {
//                 System.out.println(ch);
//             }
//         }
//     }
// }


public class hashMap {
    public static void main(String[] args) {
        int arr[]={2,4,5,7,8,0};
        int target=3;
         HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
          int diff=target-arr[i];
          if(map.containsKey(diff)){
            System.out.println(diff + "+" +arr[i] + "=" + target);
            return;
          }
          map.put(arr[i],i);

        }
            System.out.println("pair not found");
      
    }
}



