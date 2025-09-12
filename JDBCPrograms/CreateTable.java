import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable {
        public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/college";
        String user = "root";
        String pass = "root";

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement stmt = con.createStatement();
            String sql = "CREATE TABLE student (name VARCHAR(50), roll_no INT PRIMARY KEY,class VARCHAR(20),section VARCHAR(10))";
    
            stmt.executeUpdate(sql);
            System.out.println("Table Created : ");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
