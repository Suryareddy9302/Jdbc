import java.sql.*;

public class DeleteJdbc {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/demojdbc";
        String user = "root";
        String password = "Welcome@123";
        String sql = "delete from Jdbc where sid=5";
        // Load and Register the Driver
        // Class.forName("com.mysql.cj.jdbc.Driver");
        // create connection
        Connection con = DriverManager.getConnection(url, user, password);
        // create statement
        Statement st = con.createStatement();
        st.execute(sql);
        System.out.println("Values Deleted Successfully");
        con.close();
        System.out.println("Connection Closed");
    }
}
