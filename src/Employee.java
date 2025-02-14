/* Q5. Write program to create POJO class name as Employee with id,name and salary attribute and
store data in object and retrieve data from object. */


public class Employee  {
    private int id;
    private String name;
    private double salary;
    Employee(int id,String name,double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public static void main(String[] args) {
        Employee emp = new Employee(101, "Yash",50000.00);
        Employee emp1= new Employee(102,"swapni",50000);
        System.out.println("Employee 1:");
        System.out.println("ID: " + emp.getId());
        System.out.println("Name: " + emp.getName());
        System.out.println("Salary: " + emp.getSalary());

        System.out.println("\nEmployee 2:");
        System.out.println("ID: " + emp1.getId());
        System.out.println("Name: " + emp1.getName());
        System.out.println("Salary: " + emp1.getSalary());

    }
    }



