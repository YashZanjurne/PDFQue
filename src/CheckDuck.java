/*Q6. Write program to create class name as CheckDuck with parameterized constructor
        CheckDuck(int no): this constructor can accept number as parameter
Boolean isDuckNumber(): this function check if number is duck return true otherwise return false */

public class CheckDuck {
    int num;
    CheckDuck(int num){
        this.num=num;
    }
    Boolean isDuckNumber(){
        int temp=num;
        while(temp>0){
            if(temp % 10==0){
                return true;
            }
            temp=temp/10;
        }
        return false;
    }

    public static void main(String[] args) {
        CheckDuck cd = new CheckDuck(12301);
        System.out.println("Is 12301 a duck number?" +cd.isDuckNumber());
    }
}


