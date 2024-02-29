package db_application_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {

    public void getConnection() throws SQLException {
        try {
            String user = "root";
            String pwd = "";
            String jdbc = "";
            String dbUrl = "jdbc:mysql://localhost:3306";
            Class.forName(jdbc);

            Connection con = DriverManager.getConnection(dbUrl, user, pwd);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            System.out.println("finally complete");
        }
    }

    public void closeConnection() {
        System.out.println("closeConnection()");
    }


}
