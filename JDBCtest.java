package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class JDBCtest {
  public static void main(String[] args) {
      String url = "jdbc:mysql://localhost:3306/student?useSSL=false&serverTimezone=UTC";
      String user = "root";
      String password = "hostel";
      try {
          Class.forName("com.mysql.cj.jdbc.Driver");
          Connection conn = DriverManager.getConnection(url, user, password);
          System.out.println("Connected");
          conn.close();
      } catch (ClassNotFoundException e) {
          System.out.println("Driver not found");
          e.printStackTrace();
      } catch (SQLException e) {
          System.out.println("Connection failed: " + e.getMessage());
      }
  }
}