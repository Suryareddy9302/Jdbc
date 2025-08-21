import java.sql.*;
import java.util.*;

public class PreparedStmt {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/demojdbc";
        String user = "root";
        String password = "Welcome@123";
        String sql = "insert into Jdbc values(?,?,?)";
        // Load and Register the Driver
        // Class.forName("com.mysql.cj.jdbc.Driver");
        // create connection
        Connection con = DriverManager.getConnection(url, user, password);
        // create statement
        PreparedStatement st = con.prepareStatement(sql);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many users you need to create");
        int count = sc.nextInt();
        int sid = 6;
        String sname = "Sai";
        int marks = 56;
        // for(int i=0;i<=count;i++)
        // {
        st.setInt(1, sid);
        st.setString(2, sname);
        st.setInt(3, marks);
        // }
        st.execute();
        System.out.println("Values added Successfully by using PreparedStatement");
        con.close();
        System.out.println("Connection Closed");
    }
}
