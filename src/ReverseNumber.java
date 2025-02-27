class ReverseNumber {

    public int reverse(int x) {

        int rev = 0;
        while (x != 0) {
            int lastdigit = x % 10;
            if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
                return 0;
            }
            rev = rev * 10 + lastdigit;
            x = x / 10;

        }
        System.out.println("Reverse Number is  :" +rev);
        return rev;
    }

    public static void main(String[] args) {

        ReverseNumber rn = new ReverseNumber();
        rn.reverse(100);


    }
}

