package db_client_project;

import connection.ConnectionManager;

import java.sql.*;
import java.util.ArrayList;

public class ClientDAO {
    public ArrayList<String> select(String sql) throws SQLException {
        ArrayList<String> list = null;
        list = new ArrayList<String>();
        Connection con = ConnectionManager.getConnection();
        PreparedStatement pstmt = con.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        while (rs.next()) {
            // 작업 실시 . 데이터 클래스 없이 rs의 내용을 클라이언트로 어떻게 전달할 것인가
            String temp = "";
            for (int i = 0; i < 4; i++) {
                temp += rs.getString(i+1);
                if (i != 3) {
                    temp += ",";
                }
            }
            list.add(temp);
        }
        ConnectionManager.closeConnection(rs, pstmt, con);
        return list;
    }

    /* 준현 code
    public String[][] select(String sql) throws ClassNotFoundException, SQLException{
        Connection con = ConnectionManager.getConnection();
        Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ResultSet rs = stmt.executeQuery(sql);
        ResultSetMetaData rsmd = rs.getMetaData();
        rs.last();
        int row = rs.getRow();
        int col = rsmd.getColumnCount();
        String[][] data = new String[row][col];
        rs.beforeFirst();

        while(rs.next()) {
            for(int i = 0; i < col; i++) {
                data[rs.getRow()-1][i] = rs.getString(i+1);
            }
        }
        ConnectionManager.closeConnection(rs, stmt, con);
        return data;
    }
    */
}
