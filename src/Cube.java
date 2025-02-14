/* Q1. Write a program to create class name as Cube with two methods
void setValue(int x): this function accept number as parameter
int getCube(): this function can calculate cube of number and return it.*/

public class Cube {
    int x;

    void setValue(int x)
    {
        this.x=x;
    }
    int getCube()
    {
       int  result=x*x*x;

        return result;
    }


    public static void main(String[] args) {
        Cube c = new Cube();
        c.setValue(10);
        c.getCube();
       System.out.println("Cube of a number" + c.getCube());
    }
}
