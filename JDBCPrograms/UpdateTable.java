import java.sql.*;

public class UpdateTable {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/college";
        String user = "root";
        String pass = "root";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, pass);

            System.out.println("Connection done..");

            Statement stmt = con.createStatement();
            
            String sql = "update student set name = 'Raman' where roll_no = 1 ";

            stmt.executeUpdate(sql);
            System.out.println("Data Updated into the Table ");

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
