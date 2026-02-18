public class ValidPalindrome {
    public static void main(String[] args) {
        System.out.println("Execution Strats :");
        String s = "Nayana";
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            while (start < end && !Character.isLetterOrDigit(s.charAt(start))) {
                start++;
            }

            while (start < end && !Character.isLetterOrDigit(s.charAt(end))) {
                end--;
            }
            if (Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))) {
                System.out.println("Its not palindrome");
            }
            start++;
            end--;
        }
        System.out.println("Its palindrome");
    }
}