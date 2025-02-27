class CheckPalindrom{
    public boolean isPalindrome(int x) {
        int y=x;
        int rev=0;
        while(y>0){
            int lastdigit=y%10;
            rev=rev*10+lastdigit;
            y=y/10;
        }
        if(rev==x){
            System.out.println("Number is Palindrom");
            return true;
        }
        else{
            System.out.println("Number is not Palindrom");
            return false;
        }
    }

    public static void main(String[] args) {
        CheckPalindrom cp = new CheckPalindrom();
        cp.isPalindrome(121);
    }
}


