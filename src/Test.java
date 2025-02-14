/* Q1. Write a program to crate class name as Value with single function name as setValue(int,int) and
we have to create three child classes name as Add with function int getAdd() , Mul with function
getMul() and Div with function getDiv() and getAdd() function return addition of two value which is
inherited from Value class , getMul() function return multiplication of two values which is inherited
from Value class and gitDiv() function return division of two values which Is inherited from Value
class. */

class Value2 {
    int val1;
    int val2;

    public void setVal(int val1,int val2) {
        this.val1 = val1;
        this.val2=val2;
    }
}
class Add2 extends Value2{
    void getAdd(){
        System.out.println("Addition is " +(val1+val2));

    }
}
class Mul2 extends Value2{
    void getMul(){
        System.out.println("multiplication is "+(val1*val2));
    }
}
class Div2 extends Value2{
    void getDiv(){
        System.out.println("Division is "+(val1/val2));

    }
}
public class Test {
    public static void main(String[] args) {
        Add2 add = new Add2();
        add.setVal(10,5);
        add.getAdd();
        Mul2 mul = new Mul2();
        mul.setVal(10,5);
        mul.getMul();
        Div2 div = new Div2();
        div.setVal(10,2);
        div.getDiv();


    }
}
