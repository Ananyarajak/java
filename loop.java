//sum of digit
// public class loop {
//     public static void main(String[] args) {
//         int a =1234;
//         int sum=0;
//         while(a!=0){
//             sum = sum+(a%10);
//             a = a/10;
//              System.out.println(sum);
//         }
//     }
// }

//find which digit is even and which is odd

// public class loop {
//     public static void main(String[] args) {
//         int a =656777;
//         int b=0;
//         while(a>0){
//             b=(a%10);
//             if(b%2==0){
//                 System.out.println(b+"is even");
//             }
//             else{
//                System.out.println(b+"is odd"); 
//             }
//             a = a/10;
//         }
//     }
// }

//check if number is palindrome or not

public class loop {
    public static void main(String[] args) {
        int a =121;
        int rev=0;
        int c=a;
        while(a>0){
            rev=rev*10+(a%10);
            a=a/10;
        }
        System.out.println(rev);
        if(c==rev){
            System.out.println("number is palindrome");
        }
        else{
            System.out.println("number is not palindrome");
        }
    }
}   

