
//import Packages
import java.sql.*;

public class InsertJdbc {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/demojdbc";
        String user = "root";
        String password = "Welcome@123";
        String sql = "Insert into Jdbc values(5, 'Kittu', 89)";
        // Load and Register the Driver
        // Class.forName("com.mysql.cj.jdbc.Driver");
        // create connection
        Connection con = DriverManager.getConnection(url, user, password);
        // create statement
        Statement st = con.createStatement();
        st.execute(sql);
        System.out.println("Values Inserted Successfully");
        con.close();
        System.out.println("Connection Closed");
    }
}