public class Power2 {
    public boolean isPowerOfTwo(int n){

        if(n<=0) {
           // System.out.println("False");

            for (int i = n; i > 1; i /= 2) {
                if (i % 2 != 0) {
                    System.out.println("false");
                }
            }

        }
        else{
            System.out.println("true");
        }
       // System.out.println("true");
        return true;
    }

    public static void main(String[] args) {
        Power2 pp = new Power2();
        pp.isPowerOfTwo(6);
    }

}
