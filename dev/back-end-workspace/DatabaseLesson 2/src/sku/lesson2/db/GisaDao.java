package sku.lesson2.db;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class GisaDao {
    public boolean insert(String sql) throws SQLException, ClassNotFoundException {
        boolean flag = false;

        Connection con = ConnectionManager.getConnection();
        Statement stmt = con.createStatement();
        int affectedCount = stmt.executeUpdate(sql);

        ConnectionManager.closeConnection(null, stmt, con);
        if (affectedCount > 0) {
            flag = true;
        }
        return flag;
    }
}
