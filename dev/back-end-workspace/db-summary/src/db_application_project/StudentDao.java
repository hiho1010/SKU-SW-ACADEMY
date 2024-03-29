package db_application_project;

import connection.ConnectionManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class StudentDao {
    public boolean insert(ArrayList<Student> list) throws SQLException {
        boolean flag = false;
        Connection con = ConnectionManager.getConnection();
        String sql = "insert into Gisa values (?,?,?,?,?,?,?,?,?,?,?)";
        int affectedCount = 0;
        PreparedStatement pstmt = null;
        try {
            con.setAutoCommit(false);
            pstmt = con.prepareStatement(sql);
            for (Student student : list) {
                pstmt.setInt(1, student.getStdId());
                pstmt.setString(2, student.getEmail());
                pstmt.setInt(3, student.getKor());
                pstmt.setInt(4, student.getEng());
                pstmt.setInt(5, student.getMath());
                pstmt.setInt(6, student.getSci());
                pstmt.setInt(7, student.getHis());
                pstmt.setInt(8, student.getTotal());
                pstmt.setString(9, student.getMgrCode());
                pstmt.setString(10, student.getAccCode());
                pstmt.setString(11, student.getLocCode());
                affectedCount += pstmt.executeUpdate();
            }
            if (affectedCount > 0) {
                System.out.println(affectedCount);
                flag = true;
            }
            con.commit();
        } catch (SQLException se) {
            con.rollback();
        } finally {
            con.setAutoCommit(true);
        }
        ConnectionManager.closeConnection(null, pstmt, con);

        return flag;
    }
    public String selectQuiz1(String sql) throws SQLException {
        String answer = null;
        Connection con = ConnectionManager.getConnection();
        try {
            PreparedStatement pstmt = con.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()) {
                answer = rs.getString(1);
            }
            ConnectionManager.closeConnection(rs, pstmt, con);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return answer;
    }

    public String selectQuiz2(String sql) throws SQLException {
        String answer = null;
        Connection con = ConnectionManager.getConnection();
        try {
            PreparedStatement pstmt = con.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()) {
                answer = rs.getString(1);
            }
            ConnectionManager.closeConnection(rs, pstmt, con);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return answer;
    }

    public String selectQuiz3(String sql) throws SQLException {

        String answer = null;
        Connection con = ConnectionManager.getConnection();
        try {
            PreparedStatement pstmt = con.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()) {
                answer = rs.getString(1);
            }
            ConnectionManager.closeConnection(rs, pstmt, con);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return answer;
    }

    public String selectQuiz4(String sql) throws SQLException {

        String answer = null;
        Connection con = ConnectionManager.getConnection();
        try {
            PreparedStatement pstmt = con.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()) {
                answer = rs.getString(1);
            }
            ConnectionManager.closeConnection(rs, pstmt, con);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return answer;
    }
}
