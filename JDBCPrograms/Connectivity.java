import java.sql.*;

public class Connectivity {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/college";
        String user = "root";
        String pass = "root";

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, pass);
            System.out.println("Connected to database successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
