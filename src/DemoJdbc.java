import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DemoJdbc {
    public static void main(String[] args) throws Exception{

        int id1 = 2;
        String name1="Swapnil";
        String city1="Kolhapur";
        Class.forName("com.mysql.cj.jdbc.Driver");
      Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_demo","root","Yash@2002");
     //PreparedStatement ps =  con.prepareStatement("insert into students VALUES ('1', 'Amrut','Pune')");

        PreparedStatement ps = con.prepareStatement("insert into students values (?,?,?)");
        ps.setInt(1,id1);
        ps.setString(2,name1);
        ps.setString(3,city1);
     int i= ps.executeUpdate();
     if(i>0){
         System.out.println("Data inserted");
     }
     else{
         System.out.println("Failed");
     }
        System.out.println("Connection Successful");
    }
}
