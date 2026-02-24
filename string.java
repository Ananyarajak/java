// public class string {
//     public static void main(String[] args) {
//         String s1="hello";    //reffrence comparision
//         String s2="hello";
//         int a=3;              //value comparision
//         int b=3;
//         System.out.println(s1==s2);
//          System.out.println(a==b);
//     }
// }

// public class string {
//     public static void main(String[] args) {
//         String s1="hello";   
//         // s1.concat("hii");     //immutable=once the string is created it can't be changed
//         //  s1=s1.concat("hii");
//         // String s2= s1+"hii";
//         // String s2="";
//         // s2= s1+"hii";
//         System.out.println(s2);

//         }
//         // System.out.println(s1.charAt(0));

//     }
// }

// palindrome

// public class string {
//     public static void main(String[] args) {
//         String s1 = "madam";
//         String s2 = "";
//         for (int i = s1.length() - 1; i >= 0; i--) {
//             s2 = s2 + s1.charAt(i);
//         }
//         System.out.println(s2);
//         if (s1.equals (s2)) {
//             System.out.println("is palindrome");
//         } else {
//             System.out.println("is not palindrome");
//         }
//     }
// }

// remove duplicate character

public class string {
    public static void main(String[] args) {
        String s1 = "ananya";
        String s2 = " ";
        s1.indexOf('m');
        for (int i = 0; i < s1.length() - 1; i++) {

            char ch = s1.charAt(i);
            if (s2.indexOf(ch) == -1) {
                s2 += ch;
            }
        }
         System.out.println(s2);
    }
}
