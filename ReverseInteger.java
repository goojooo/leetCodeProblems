public class ReverseInteger {
    public int reverse(int x) {

        int reverse = 0, digit;
        if (x <= Integer.MIN_VALUE && x >= Integer.MAX_VALUE) {
            return 0;
        }
        for (; x != 0; x /= 10) {
            digit = x % 10;
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
