package sku.lesson.db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BookDAO {
    public void select(String sql) {
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            con = ConnectionManager.getConnection();
            stmt = con.createStatement();
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                // 행처리
                String attr1 = rs.getString(1);
                String attr2 = rs.getString(2);
                String attr3 = rs.getString(3);
                int attr4 = rs.getInt(4);
                System.out.println(attr1+ "," + attr2+ "," + attr3+ "," + attr4*10);
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        ConnectionManager.closeConnection(rs, stmt, con);
    }
}
