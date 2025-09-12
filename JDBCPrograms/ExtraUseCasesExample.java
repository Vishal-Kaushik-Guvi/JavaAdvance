import java.sql.*;

public class ExtraUseCasesExample {
public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/college"; // change DB if needed
        String user = "root";
        String pass = "root";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, pass);

            System.out.println("✅ Connected to Database!");

            // -------------------------
            // 1. READ-ONLY ResultSet
            // -------------------------
            System.out.println("\n=== READ-ONLY ResultSet ===");
            Statement stmt1 = con.createStatement(
                    ResultSet.TYPE_FORWARD_ONLY,
                    ResultSet.CONCUR_READ_ONLY);

            ResultSet rs1 = stmt1.executeQuery("SELECT * FROM student");
            while (rs1.next()) {
                System.out.println(rs1.getInt("roll_no") + " - " + rs1.getString("name"));
            }

            // -------------------------
            // 2. SCROLLABLE ResultSet
            // -------------------------
            System.out.println("\n=== SCROLLABLE ResultSet ===");
            Statement stmt2 = con.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);

            ResultSet rs2 = stmt2.executeQuery("SELECT * FROM student");

            rs2.afterLast(); // Move cursor to after last row
            System.out.println("Backward traversal:");
            while (rs2.previous()) {
                System.out.println(rs2.getInt("roll_no") + " - " + rs2.getString("name"));
            }

            rs2.absolute(2); // Move cursor to 2nd row
            System.out.println("Jumped to 2nd Row: " + rs2.getString("name"));

            // -------------------------
            // 3. UPDATABLE ResultSet
            // -------------------------
            System.out.println("\n=== UPDATABLE ResultSet ===");
            Statement stmt3 = con.createStatement(
                    ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);

            ResultSet rs3 = stmt3.executeQuery("SELECT * FROM student");

            // ✅ Update first row
            if (rs3.absolute(1)) {
                System.out.println("Before Update: " + rs3.getString("name"));
                rs3.updateString("name", "Raman");
                rs3.updateRow();
                System.out.println("Updated 1st row to Raman");
            }

            // ✅ Insert new row
            rs3.moveToInsertRow();
            rs3.updateString("name", "Suman");
            rs3.updateInt("roll_no", 10);
            rs3.updateString("class", "VII");
            rs3.updateString("section", "C");
            rs3.insertRow();
            System.out.println("Inserted new student: ");

            // ✅ Delete 2nd row
            if (rs3.absolute(2)) {
                System.out.println("Deleting: " + rs3.getString("name"));
                rs3.deleteRow();
                System.out.println("2nd row deleted!");
            }

            // Close resources
            rs1.close();
            rs2.close();
            rs3.close();
            stmt1.close();
            stmt2.close();
            stmt3.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
