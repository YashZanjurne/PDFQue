public class ReverseString {
    public static void main(String[] args) {
        String input = "java";
        char inputArray[]=input.toCharArray();
        for(int i=inputArray.length-1;i>=0;i--){
            System.out.print(inputArray[i]);
        }



    }
}
