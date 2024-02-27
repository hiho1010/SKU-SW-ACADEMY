package sku.lesson2.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class GisaDao {

    public boolean insert(Student student) throws SQLException, ClassNotFoundException {
        boolean flag = false;

        Connection con = ConnectionManager.getConnection();
        String sql = "insert into Gisa values (?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement pstmt = con.prepareStatement(sql);

        pstmt.setInt(1, student.getStudentId());
        pstmt.setString(2, student.getEmail());
        pstmt.setInt(3, student.getKorean());
        pstmt.setInt(4, student.getMath());
        pstmt.setInt(5, student.getSci());
        pstmt.setInt(6, student.getHis());
        pstmt.setInt(7, student.getTotal());
        pstmt.setString(8, student.getMgrCode());
        pstmt.setString(9, student.getAccCode());
        pstmt.setString(10, student.getLocCode());

        int affectedCount = pstmt.executeUpdate();
        if (affectedCount > 0) {
            flag = true;
        }
        ConnectionManager.closeConnection(null,pstmt,con);
        return flag;
    }


//    public boolean insert(String sql) throws SQLException, ClassNotFoundException {
//        boolean flag = false;
//
//        Connection con = ConnectionManager.getConnection();
//        Statement stmt = con.createStatement();
//        int affectedCount = stmt.executeUpdate(sql);
//
//        ConnectionManager.closeConnection(null, stmt, con);
//        if (affectedCount > 0) {
//            flag = true;
//        }
//        return flag;
    }
//    public boolean delete(String sql) throws SQLException, ClassNotFoundException {
//        boolean flag = false;
//
//        Connection con = ConnectionManager.getConnection();
//        Statement stmt = con.createStatement();
//        int affectedCount = stmt.executeUpdate(sql);
//
//        ConnectionManager.closeConnection(null, stmt, con);
//        if (affectedCount > 0) {
//            flag = true;
//        }
//        return flag;
//    }
