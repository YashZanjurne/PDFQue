public class PrimeNumber{
    public static void main(String[] args) {
        int i,j;
        for( i=1;i<=500;i++){
             int count=0;
            for( j=1;j<=i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==2){
                System.out.println(+i);
                int x=i;
                int rev=0;
                 while(x > 0){
                     int lastDigit=x%10;
                      rev = rev*10+lastDigit;

                     i=x/10;

                 }
                System.out.println(+rev);

            }
            }


        }

    }
