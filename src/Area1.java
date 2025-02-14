/* Q2. Write program to create class name Area with methods name as void setRadius(float radius) and
void setLengthWidth(int len,int wid) and two child classes name as Circle and Rectangle so you have
to define float getCircleArea() method in Circle child class and calculate area of circle and return it
and You have to define getRectArea() method in Rectangle class and calculate area of rectangle and
return it  */


public class Area1 {
    float radius;
    int length;
    int width;
    void setRadius(float radius){
        this.radius=radius;
    }
    void setlengthWidth(int length,int width){
        this.length=length;
        this.width=width;
    }
}
class Circle4 extends Area1{
    float getCircleArea(){
        double  AreaOfCircle = (Math.PI * radius * radius);
        System.out.println("Area of circle " +(AreaOfCircle));
        return (float) AreaOfCircle;
    }
}
class Rectangle extends Area1{
    int getRectArea(){
        int rect = length*width;
        System.out.println("Area of Rectangle " +rect);
        return rect;
    }
}
class Demo{
    public static void main(String[] args) {
        Circle4 c = new Circle4();
        c.setRadius(10);
        c.getCircleArea();
        Rectangle r = new Rectangle();
        r.setlengthWidth(5,5);
        r.getRectArea();

    }
}
