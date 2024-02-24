import java.sql.*;
public class mycon {
    

    public static void main(String[] args) throws Exception
    {
       try {
        Statement s=null;
        String url="jdbc:mysql://localhost:3306/bokii";
        String username="root";
        String pass="root";
        Connection connection=DriverManager.getConnection(url, username, pass);
        System.out.println("connection sucess");
        s=connection.createStatement();
        //s.executeUpdate("CREATE DATABASE divya");
        s.executeUpdate("CREATE TABLE mau  (id INT PRIMARY KEY,Name VARCHAR(10))");
         s.executeUpdate("INSERT INTO mau VALUES(1,'diu')");
          s.executeUpdate("INSERT INTO mau VALUES(2,'ganu')");
       } catch ( SQLDataException e) {
         e.printStackTrace(); 
       }    
    
    }
}
