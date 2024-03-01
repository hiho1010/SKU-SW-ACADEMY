import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class GisaDao {
    public boolean insertNew(ArrayList<Student> list) throws SQLException, ClassNotFoundException {
        boolean flag = false;
        Connection con = ConnectionManager.getConnection();
        String sql = "insert into gisa values (?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement pstmt = con.prepareStatement(sql);
        int affectedCount = 0;
        con.setAutoCommit(false);

        int count = 0;

        try {

            for (Student student : list) {
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
                pstmt.addBatch();
                count = count + 1;
                if (count % 100 == 0) {
                    int[] temp = pstmt.executeBatch();
                    affectedCount += temp.length;
                    System.out.println("batch execute()");
                }
            }


            if (affectedCount > 0) {
                System.out.println(affectedCount);
                flag = true;
            }
            con.commit();
        } catch (SQLException e) {

            con.rollback();
        } finally{
            con.setAutoCommit(true);
        }
        ConnectionManager.closeConnection(null, pstmt, con);

        return flag;
    }


    public boolean insert(ArrayList<Student> list) throws SQLException, ClassNotFoundException {
        boolean flag = false;
        Connection con = ConnectionManager.getConnection();
        String sql = "insert into gisa values (?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement pstmt = con.prepareStatement(sql);
        int affectedCount = 0;
        con.setAutoCommit(false);

        try {

            for (Student student : list) {
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

            if (affectedCount > 0) {
                System.out.println(affectedCount);
                flag = true;
            }
            con.commit();
        } catch (SQLException e) {

            con.rollback();
        } finally{
            con.setAutoCommit(true);
        }
        ConnectionManager.closeConnection(null, pstmt, con);

        return flag;
    }

    public String selectQuiz1(String sql) {
        return null;
    }public String selectQuiz2(String sql) {
        return null;
    }public String selectQuiz3(String sql) {
        return null;
    }public String selectQuiz4(String sql) {
        return null;
    }
}
