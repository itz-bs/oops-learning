package jdbc;
import java.sql.*;

public class JDBCexample {
    public static void main(String[] args) {
    	String url = "jdbc:mysql://localhost:3306/testdb?useSSL=false&serverTimezone=UTC";
String user = "root";
        String password = "hostel";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM students");
            while(rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2));
            }
            rs.close();
            stmt.close();
            con.close();
        } catch(Exception e) {
            System.out.println(e);
        }System.out.println("CHANDRAHAAS");
        System.out.println("2117240040018");
    }
}
