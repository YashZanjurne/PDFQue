/* Q8. Write program to create class name as MergeTwoArray with parameterized constructor
MergeTwoArray(int [],int []): this constructor accept two array as parameter
int [] getMergeArray(): this function merge two array in third array and return new merged array.*/


public class MergeTwoArrays {
    int arr1[];
    int arr2[];
    MergeTwoArrays(int arr1[],int arr2[]){
        this.arr1=arr1;
        this.arr2=arr2;
    }
    int [] getMergeArray(){
        int arr3[] = new int[arr1.length + arr2.length];
        for(int i=0;i< arr1.length;i++){
            arr3[i]=arr1[i];
        }
        for(int i=0;i< arr2.length;i++){
            arr3[arr1.length + i] = arr2[i];
        }
        System.out.println("Display Array");
        for(int i=0;i< arr3.length;i++){
            System.out.print(+arr3[i]+" ");
        }
        return arr3;
    }

    public static void main(String[] args) {
        int a1[]={1,2,3};
        int a2[]={4,5,6};
        MergeTwoArrays ma = new MergeTwoArrays(a1,a2);
        ma.getMergeArray();



    }

}
