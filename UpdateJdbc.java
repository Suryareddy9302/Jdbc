
//import Packages
import java.sql.*;

public class UpdateJdbc {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/demojdbc";
        String user = "root";
        String password = "Welcome@123";
        String sql = "Update Jdbc set sname='Ajay' where sid=5";
        // Load and Register the Driver
        // Class.forName("com.mysql.cj.jdbc.Driver");
        // create connection
        Connection con = DriverManager.getConnection(url, user, password);
        // create statement
        Statement st = con.createStatement();
        st.execute(sql);
        System.out.println("Values Update Successfully");
        con.close();
        System.out.println("Connection Closed");
    }
}
