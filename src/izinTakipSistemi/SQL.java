/*License
// ====================================================
// EasySSA Copyright(C) 2017 Furkan Türkal
// This program comes with ABSOLUTELY NO WARRANTY; This is free software,
// and you are welcome to redistribute it under certain conditions; See
// file LICENSE, which is part of this source code package, for details.
// ====================================================
*/

package izinTakipSistemi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class SQL {
    
    public static final SQL Instance = new SQL();
    
    public Connection CONNECTION = null; 
    
    public static final String URL = "jdbc:mysql://localhost:3306/";
    public static final String DB = "odev2";
    public static final String PROPERTIES= "?useUnicode=true&characterEncoding=utf8"; 
    public static final String DRIVER = "com.mysql.jdbc.Driver";
    public static final String USERNAME = "root"; 
    public static final String PASSWORD = "123456";
    
    public calisan Calisan;
    
    public SQL(){
        
    }
 
    public boolean ac() throws SQLException {  
        try {
            Class.forName(DRIVER).newInstance();
            CONNECTION = DriverManager.getConnection(URL + DB, USERNAME, PASSWORD);
            CONNECTION.setAutoCommit(true);
            return true;
        } catch(ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException ex) {
            Logger.getLogger(SQL.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(SQL.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(SQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public void kapat() throws SQLException {
         CONNECTION.close();
    }
    
    public PreparedStatement exec(final String sorgu){
        PreparedStatement ps = null;
        
        try {
            ps = this.CONNECTION.prepareStatement(sorgu);
            ps.setQueryTimeout(3);
        } catch (SQLException ex) {
            Logger.getLogger(SQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return ps;
    }
    
    
}
