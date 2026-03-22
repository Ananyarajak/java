public class palindrome {
    public static void main(String[] args) {
        {
            String s = "1231";
            int j = s.length() - 1;
            for (int i = 0; i < j; i++) {
                if (s.charAt(i) != s.charAt(j)) {
                    System.out.println("not palindrome");
                    return;
                }
                j--;
            }
            System.out.println(" palindrome");
        }
    }
}
