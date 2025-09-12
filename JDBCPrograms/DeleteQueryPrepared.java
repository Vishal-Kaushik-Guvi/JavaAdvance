import java.sql.*;
import java.util.Scanner;

public class DeleteQueryPrepared {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/college";
        String user = "root";
        String pass = "root";

        try {
            // 1. Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Connect
            Connection con = DriverManager.getConnection(url, user, pass);
            System.out.println("Connection established...");

            // 3. Prepare SQL with placeholder (?)
            String sql = "DELETE FROM student WHERE roll_no = ?";
            PreparedStatement pstmt = con.prepareStatement(sql);

            // 4. Take input from user
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Roll No to delete: ");
            int roll = sc.nextInt();

            // 5. Bind parameter
            pstmt.setInt(1, roll);

            // 6. Execute
            int rows = pstmt.executeUpdate();
            if (rows > 0) {
                System.out.println("✅ Student with roll_no " + roll + " deleted successfully.");
            } else {
                System.out.println("⚠️ No student found with roll_no " + roll);
            }

            // 7. Close resources
            pstmt.close();
            con.close();
            sc.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
