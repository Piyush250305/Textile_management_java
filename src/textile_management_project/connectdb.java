/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package textile_management_project;

/**
 *
 * @author asus
 */
import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author asus
 */
public class connectdb {
    Connection conn;
    public static Connection Connectdb()
    {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/texttile","root","");
            return conn;
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
    }
    
  }