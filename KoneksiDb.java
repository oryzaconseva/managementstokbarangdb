/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Koneksi;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.SQLException;

/**
 *
 * @author ORYZA CONSEVA
 */
public class KoneksiDb {
    static Connection con;
    
    public static Connection connection(){
        if(con == null){
            MysqlDataSource data = new MysqlDataSource();
            data.setDatabaseName("dbpbo");
            data.setUser("root");
            data.setPassword("");
            
            try {
                con = (Connection) data.getConnection();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }  
        }
        return con;
    }
}
