/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class Connections {
    String ConnectionString = "jdbc:sqlserver://ADMIM:1433;databaseName=QLSanPham;user=sa;password=123456";
    Connection conn;
    
    public Connections(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(ConnectionString);
            if(conn != null){
                System.out.println("Kế nối cơ sở dữ liệu thành công.");
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("Lỗi JDBC: " + ex.getMessage() );
        }catch (SQLException ex) {
            System.out.println("Lỗi kết nối CSDL: " + ex.getMessage());
        }  
    }

    
    public ResultSet ExcuQuery(String query){
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query); // Thực thi truy vấn SELECT
            return rs;  //Trả về ResultSet
        } catch (SQLException ex) {
            System.out.println("Lỗi câu truy vấn. " + ex.getMessage());
        }
        return null;
    }
    
    public int ExcuteNonQuery(String query){
        try {
            Statement stmt = conn.createStatement();
            int kq = stmt.executeUpdate(query);
            return kq; 
        } catch (SQLException ex) {
            System.out.println("Lỗi câu truy vấn: " + ex.getMessage());
        }
        return -1;
    }
}
