public class PrimePrint {
    public static void main(String[] args) {
        int num=500;
        for(int i=2;i<500;i++){
            int count=0;
            for(int j=2;j<i;j++){
                if(i % j == 0){
                    count++;
                }
            }
            if(count==2){
                System.out.println(+i);
            }
        }

    }
}