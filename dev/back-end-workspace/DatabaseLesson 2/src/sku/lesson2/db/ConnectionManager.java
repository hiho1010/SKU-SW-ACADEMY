package sku.lesson2.db;

import java.sql.*;

public class ConnectionManager {

    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        String id = "root";
        String pwd = "";
        String driver = "com.mysql.cj.jdbc.Driver";
        String jdbcURL = "jdbc:mysql://localhost:3306/sku";
        Class.forName(driver);
        Connection con = DriverManager.getConnection(jdbcURL,id,pwd);

        return con;
    }

    public static void closeConnection(ResultSet rs, Statement stmt, Connection con) {
        if(rs !=null){
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            if(stmt !=null){
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                if(con !=null){
                    try {
                        con.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }}}
}
