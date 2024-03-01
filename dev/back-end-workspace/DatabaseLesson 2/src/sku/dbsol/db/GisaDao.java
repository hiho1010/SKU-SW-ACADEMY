package sku.dbsol.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class GisaDao {
    public ArrayList<Student> select(String sql) throws SQLException, ClassNotFoundException {
        ArrayList<Student> list = null;
        Connection con = ConnectionManager.getConnection();
        try {
            PreparedStatement pstmt = con.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            list = new ArrayList<Student>();
            Student student = null;
            while (rs.next()) {
                // 하나의 레코드를 Student객체 1개에 맵핑하고 리스트에 저장
                int stdNo = rs.getInt(1);
                String email = rs.getString(2);
                int kor = rs.getInt(1);
                int eng = rs.getInt(1);
                int math = rs.getInt(1);
                int sci = rs.getInt(1);
                int his = rs.getInt(1);
                int total = rs.getInt(1);
                String mgrCode = rs.getString(9);
                String accCode = rs.getString(10);
                String locCode = rs.getString(11);
                student = new Student(stdNo, email, kor, eng, math, sci, his, total, mgrCode, accCode, locCode);
                list.add(student);
            }
            ConnectionManager.closeConnection(rs, pstmt, con);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
