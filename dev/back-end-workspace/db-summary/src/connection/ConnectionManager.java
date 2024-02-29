package connection;

import java.sql.*;

public class ConnectionManager {
    public static Connection getConnection() {
        Connection con = null;
        String user = "root";
        String pwd = "";
        String jdbc = "com.mysql.cj.jdbc.Driver";
        String dbUrl = "jdbc:mysql://localhost:3306/sku";
        try {
            Class.forName(jdbc);
            con = DriverManager.getConnection(dbUrl, user, pwd);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return con;
    }

    public static void closeConnection(ResultSet rs, Statement pstmt, Connection con) {
        if(rs!=null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if(pstmt!=null) {
            try {
                pstmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if(con!=null){
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }


}
