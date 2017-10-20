/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.sql.ResultSet;

/**
 *
 * @author Administrator
 */
public class DAL_HoaDon {
    public static ResultSet DataSql(){
        String query = "SELECT * FROM dbo.HoaDon";
        return Layout.Main.connection.ExcuQuery(query);
    }
}
