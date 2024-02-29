package db_client_project;

import java.sql.SQLException;
import java.util.ArrayList;

public class DatabaseClient {
    public static void main(String[] args) throws SQLException {
        DatabaseClient client = new DatabaseClient();
        client.testSelect();
        try {
            client.testSelect();
        } catch (SQLException se) {
            se.printStackTrace();
        }
    }

    public void testSelect() throws SQLException {
        String sql = "select std_No,email, total,mgr_code from gisa limit 10";
        ClientDAO dao = new ClientDAO();
        try {
            ArrayList<String> list = dao.select(sql);
            this.printString(list);
        } catch (SQLException e) {
            e.printStackTrace();

        }
    }

    private void printString(ArrayList<String> list) {
        for (String s : list) {
            System.out.println(s);
        }
    }
}
