public class ReverseInteger {
    public int reverse(int x) {

        int reverse = 0, digit;
       
        for (; x != 0; x /= 10) {
            digit = x % 10;
                   if (reverse > Integer.MAX_VALUE / 10 || 
               (reverse == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }

            if (reverse < Integer.MIN_VALUE / 10 || 
               (reverse == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }
            reverse = reverse * 10 + digit;

        }

        return reverse;
    }

    public static void main(String args[]) {
        ReverseInteger ri = new ReverseInteger();
        int result = ri.reverse(123876);
        System.out.println("Reverse integer : " + result);
    }
}
