// public class method {
//     void sum(){
//         System.out.println("hello");
//     }
//     public static void main(String[] args) {
//         method s1=new method();
//         s1.sum();
//     }
// }

//parameter argument
// public class method {
//     void sum(int a,int b){
//         System.out.println(a+b);
//     }
//     public static void main(String[] args) {
//         method s1=new method();
//         s1.sum(5,6);
//     }
// }

//prime number
// public class method {
//     public static void main(String[] args) {
//         int a = 5;
//         boolean isPrime = true;
//         if (a <= 1) {
//             isPrime = false;
//         } else {
//             for (int i = 2; i < a; i++) {
//                 if (a % i == 0) {
//                     isPrime = false;
//                     break;
//                 }
//             }
//         }
//         System.out.println(isPrime);
//     }
// }

// public class method {
//     public static void main(String[] args) {
//        String s1=new String("hello");
//         String s2=new String("hello");
//         //System.out.println(s1==s2);   //object will not be same as it do not compare refference or value
//         System.out.println(s1.equals(s2));
//     }
// }

public class method {
    public static void main(String[] args) {
        String s1 = "aabbcc";
        for (int i = 0; i < s1.length(); i++) {
            int count = 1;
            if (s1.charAt(i) == '0')
                continue;

            for (int j = i + 1; j < s1.length(); j++) {
                if (s1.charAt(i) == s1.charAt(j)) {
                    count++;
                }
            }
            System.out.println(s1.charAt(i) + " : " + count);
        }
    }
}