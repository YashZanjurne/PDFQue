/* Q2. Write program to create class name Area with methods name as void setRadius(float radius) and
void setLengthWidth(int len,int wid) and two child classes name as Circle and Rectangle so you have
to define float getCircleArea() method in Circle child class and calculate area of circle and return it
and You have to define getRectArea() method in Rectangle class and calculate area of rectangle and
return it. */

class Areaa {
    float radius;
    int len;
    int wid;

    void setRadius(float radius) {
        this.radius = radius;
    }

    void setLengthWidth(int len, int wid) {
        this.len = len;
        this.wid = wid;
    }
}

class Circle extends Areaa {
    float getCircleArea() {
        double Area = (3.14 * radius * radius);
        System.out.println("Area of circle= " + Area);
        return (float) Area;
    }
}

class Rectangal extends Areaa {
    double getRectArea() {
        double AreaRect = len * wid;
        System.out.println("Area of rectangle = " + (AreaRect));
        return AreaRect;
    }
}

public class Demoo {
    public static void main(String[] args) {
        Circle c = new Circle(); // Create circle object
        c.setRadius(4);        // Set radius on the circle object
        c.getCircleArea();     // Calculate and print circle area

        Rectangal r = new Rectangal(); // Create rectangle object
        r.setLengthWidth(5, 4);      // Set length and width on rectangle object
        r.getRectArea();           // Calculate and print rectangle area
    }
}