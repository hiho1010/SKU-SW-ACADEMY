package sku.lesson2.db;

import java.sql.SQLException;

public class JDBCMain {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //connectDatabase 호출
        JDBCMain jdbcMain = new JDBCMain();
        jdbcMain.testCRUD();
    }

    public void testCRUD() {
        // String sql = "insert INTO Gisa(student_id, email, kor, math, sci, his, total, mgr_code, acc_code, loc_code) VALUES(990002, 'heeho1998@gmail.com', 80,85,90,85, 340, 'A', 'B', 'C');";
        // String sql = "delete from Gisa where email LIKE '%hello%';";
        Student student = new Student(990011, "heeho1998@gmail.com", 80,85,90,85, 340, "A", "B", "C");
        GisaDao dao = new GisaDao();
        try {
            boolean flag = dao.insert(student);
            if (flag) {
                System.out.println("insert success");
            } else {
                System.out.println("insert fail");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

