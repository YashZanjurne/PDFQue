/* Q1. Write a program to crate class name as Value with single function name as setValue(int,int) and
we have to create three child classes name as Add with function int getAdd() , Mul with function
getMul() and Div with function getDiv() and getAdd() function return addition of two value which is
inherited from Value class , getMul() function return multiplication of two values which is inherited
from Value class and gitDiv() function return division of two values which Is inherited from Value
class.*/



class Value {
    protected int a, b;

    public void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }
}

class Add extends Value {
    public int getAdd() {
        return a + b;
    }
}

class Mul extends Value {
    public int getMul() {
        return a * b;
    }
}

class Div extends Value {
    public double getDiv() {
        if (b != 0) {
            return (double) a / b;
        } else {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
    }
}

public class Main1 {
    public static void main(String[] args) {
        Add addition = new Add();
        Mul multiplication = new Mul();
        Div division = new Div();

        addition.setValue(10, 5);
        multiplication.setValue(10, 5);
        division.setValue(10, 5);

        System.out.println("Addition: " + addition.getAdd());
        System.out.println("Multiplication: " + multiplication.getMul());
        System.out.println("Division: " + division.getDiv());
    }
}

