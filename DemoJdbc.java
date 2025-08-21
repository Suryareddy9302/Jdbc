
//import Packages
import java.sql.*;

public class DemoJdbc {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/demojdbc";
        String user = "root";
        String password = "Welcome@123";
        String sql = "select * from Jdbc";
        // Load and Register the Driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        // create connection
        Connection con = DriverManager.getConnection(url, user, password);
        // create statement
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        // System.out.println(rs.next());
        // fetch only one record
        // System.out.println(rs.getString("sname"));
        while (rs.next()) {
            System.out.print(rs.getInt(1) + " - ");
            System.out.print(rs.getString(2) + " - ");
            System.out.println(rs.getInt(3));
        }
        con.close();
        System.out.println("Connection Closed");
    }
}