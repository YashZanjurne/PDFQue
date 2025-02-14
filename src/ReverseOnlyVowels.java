public class ReverseOnlyVowels {
    public static void main(String[] args) {
        String input = "Hello";
        char [] inputArray = input.toCharArray();
        String vowels="aeiouAEIOU";
        int left=0;
        int right=inputArray.length-1;
        while(left<right){
            if(vowels.indexOf(inputArray[left])==-1){
                left++;
            }
            else if(vowels.indexOf(inputArray[right])==-1){
                right--;
            }
            else{
                char temp;
                 temp = inputArray[left];
                inputArray[left] = inputArray[right];
                inputArray[right] = temp;
                left++;
                right--;
            }
        }
        System.out.println("Output as string: " + new String(inputArray));
        System.out.println("Output as string: " + new String(inputArray));
    }
}
