package sku.lesson2.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class GisaDao {

    public boolean insert(ArrayList<Student> list) throws SQLException, ClassNotFoundException {
        boolean flag = false;
        Connection con = ConnectionManager.getConnection();
        String sql = "insert into gisa values (?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement pstmt = con.prepareStatement(sql);
        int affectedCount = 0;
        for(Student student : list) {
            pstmt.setInt(1, student.getStdNo());
            pstmt.setString(2, student.getEmail());
            pstmt.setInt(3, student.getKor());
            pstmt.setInt(4, student.getEng());
            pstmt.setInt(5, student.getMath());
            pstmt.setInt(6, student.getSci());
            pstmt.setInt(7, student.getHist());
            pstmt.setInt(8, student.getTotal());
            pstmt.setString(9, student.getMgrCode());
            pstmt.setString(10, student.getAccCode());
            pstmt.setString(11, student.getLocCode());
            affectedCount += pstmt.executeUpdate();
        }

        if(affectedCount>0) {
            System.out.println(affectedCount);
            flag = true;
        }
        ConnectionManager.closeConnection(null, pstmt, con);

        return flag;
    }

    public boolean insert0(Student student) throws SQLException, ClassNotFoundException {
        boolean flag = false;
        Connection con = ConnectionManager.getConnection();
        String sql = "insert into gisa values (?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setInt(1, student.getStdNo());
        pstmt.setString(2, student.getEmail());
        pstmt.setInt(3, student.getKor());
        pstmt.setInt(4, student.getEng());
        pstmt.setInt(5, student.getMath());
        pstmt.setInt(6, student.getSci());
        pstmt.setInt(7, student.getHist());
        pstmt.setInt(8, student.getTotal());
        pstmt.setString(9, student.getMgrCode());
        pstmt.setString(10, student.getAccCode());
        pstmt.setString(11, student.getLocCode());
        int affectedCount = pstmt.executeUpdate();
        if(affectedCount>0) {
            flag = true;
        }
        ConnectionManager.closeConnection(null, pstmt, con);
        return flag;
    }
    public boolean insert(String sql) throws SQLException, ClassNotFoundException {
        boolean flag = false;
        Connection con = ConnectionManager.getConnection();
        Statement stmt = con.createStatement();
        int affectedCount = stmt.executeUpdate(sql);
        ConnectionManager.closeConnection(null, stmt, con);
        if(affectedCount>0) {
            flag = true;
        }
        return flag;
    }

    public boolean delete(String sql) throws SQLException, ClassNotFoundException {
        boolean flag = false;
        Connection con = ConnectionManager.getConnection();
        Statement stmt = con.createStatement();
        int affectedCount = stmt.executeUpdate(sql);
        ConnectionManager.closeConnection(null, stmt, con);
        if(affectedCount>0) {
            flag = true;
        }
        return flag;
    }

    public ArrayList<Student> select() {

    }

}
