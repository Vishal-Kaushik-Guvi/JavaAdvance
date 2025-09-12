import java.sql.*;

public class SelectQuery {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/college";
        String user = "root";
        String pass = "root";

        try {
            // 1. Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Establish Connection
            Connection con = DriverManager.getConnection(url, user, pass);
            System.out.println("Connection established...");

            // 3. Create Statement
            Statement stmt = con.createStatement();

            // 4. Write SQL query
            String sql = "SELECT * FROM student";

            // 5. Execute query
            ResultSet rs = stmt.executeQuery(sql);

            // 6. Process results
            System.out.println("---- Student Table ----");
            while (rs.next()) {
                String name = rs.getString("name");
                int roll = rs.getInt("roll_no");
                String cls = rs.getString("class");
                String sec = rs.getString("section");

                System.out.println("Name: " + name + 
                                   ", Roll No: " + roll + 
                                   ", Class: " + cls + 
                                   ", Section: " + sec);
            }

            // 7. Close resources
            rs.close();
            stmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
