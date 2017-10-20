/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrator
 */
public class BLLHoaDon {
    public static void Data(DefaultTableModel tblMode){
        Object[] item = new Object[7];
        tblMode.setRowCount(0);
        try{
            ResultSet rs = DAL.DAL_HoaDon.DataSql();
            while(rs.next()){
                item[0] = rs.getString("MaHD");
                item[1] = rs.getString("SoHoaDon");
                item[2] = rs.getString("NgayTaoHD");
                item[3] = rs.getString("MaNhanVien");
                item[4] = rs.getString("MaKhachHang");
                item[5] = rs.getString("TongTien");
                item[6] = rs.getString("GhiChu");
                tblMode.addRow(item);
            }
        }catch(SQLException ex){
            System.out.println("Lỗi truy vấn" + ex.getMessage());
        }
    }
}
