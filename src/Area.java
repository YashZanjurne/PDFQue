/* Q7. Write program to create class name as Area with constructor overloading
 Area(float radius): this function can accept radius as input and calculate circle Area
 Area(int len,int width): this function can accept len and width as input and calculate area of
rectangle */


class Area {

    // Method to calculate the area of a circle
    Area(float radius) {
        double area = Math.PI * radius * radius;
        System.out.println("Area of circle with radius " + radius + " is: " + area);
    }

    // Method to calculate the area of a rectangle
    Area(int len, int width) {
        int area = len * width;
        System.out.println("Area of rectangle with length " + len + " and width " + width + " is: " + area);
    }


    public static void main(String[] args) {
        Area circleArea = new Area(5.0f); // Calls the constructor for circle area
        Area rectangleArea = new Area(10, 20); // Calls the constructor for rectangle area

        Area anotherCircle = new Area(2.5f); // Example of another circle calculation
        Area anotherRectangle = new Area(7, 15); // Example of another rectangle calculation

    }
}
