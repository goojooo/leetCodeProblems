public class PalindromNumber {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int rev = 0;
        int original = x;
        int digit;
        for (; x != 0; x /= 10) {
            digit = x % 10;
            rev = rev * 10 + digit;
        }

        if (rev == original) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        PalindromNumber pn = new PalindromNumber();
        boolean result = pn.isPalindrome(1213);
        System.out.println("Is palindrome : " + result);

    }
}
