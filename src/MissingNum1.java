public class MissingNum1 {
    public static void main(String[] args) {
        int a[]=new int[]{1,2,4,5,6};
        for(int i=0;i<a.length-1;i++){
            for(int j=a[i]+1;j<a[i+1];j++){
                System.out.println(+j);
            }
        }
    }
}
