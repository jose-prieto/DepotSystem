package DBController;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

class connection {

    public static final String URL = "jdbc:mysql://localhost:3306/depotdb";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "24217857";

    public static Connection getConnection() {
        Connection con = null;
        try {

            Class.forName("com..mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(URL, USERNAME, PASSWORD);
            JOptionPane.showMessageDialog(null, "successfull connection");

        } catch (Exception e) {
            System.out.println(e);
        }
        return con;
    }

}
