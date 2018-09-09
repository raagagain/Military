package military;

import java.sql.*;
import javax.swing.JOptionPane;

public class db {
    Connection con=null;
    public static Connection java_db()
    {
        String username="root";
        String pass="";
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/military",username,pass);
            return con;
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
    }
    
}
