package javaproject;
import java.sql.Connection;  
import java.sql.DriverManager;  
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;  
import java.sql.Statement;

public class JavaProject {

    public static void main(String[] args) {
        Connection connection = null;
        
        try 
        {  
            String url = "jdbc:sqlite:our_database.db";  
            connection = DriverManager.getConnection(url);  
            System.out.println("Database Connected");  
            
            String example_query = "SELECT * FROM student_table";
            PreparedStatement pst = connection.prepareStatement(example_query);
            ResultSet rs = pst.executeQuery(); 
            
            while (rs.next()) 
            {  
                System.out.println(rs.getInt("id") +" "+rs.getString("name"));  
            }  
              
        } 
        catch (SQLException e) 
        {  
            System.out.println(e.getMessage());  
        }
        
    }
    
}
