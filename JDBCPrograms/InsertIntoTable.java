import java.sql.*;

public class InsertIntoTable {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/college";
        String user = "root";
        String pass = "root";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, pass);

            System.out.println("Connection done..");

            Statement stmt = con.createStatement();
            
            String sql = "INSERT INTO student (name, roll_no, class, section) VALUES "
                       + "('Vishal', 1, 'VI', 'B'), "
                       + "('Rohit', 2, 'VI', 'B'), "
                       + "('Aman', 4, 'IV', 'A'), "
                       + "('Mohit', 7, 'V', 'C'), "
                       + "('Ritik', 9, 'V', 'D'), "
                       + "('Shivam', 3, 'VII', 'C')";

            stmt.executeUpdate(sql);
            System.out.println("Data added to the Table ");

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
