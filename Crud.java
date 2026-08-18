
import java.sql.*;

public class Crud {

    static String url = "jdbc:mysql://localhost:3306/EmployeeDb";
    static String name = "root";
    static String password = "";

    public static void main(String[] args) {

        try {
            // Establishing connection
            Connection con = DriverManager.getConnection(url, name, password);

            // INSERT
            String insertSQL =
                "INSERT INTO EMPLOYEES(id, name, salary) VALUES(?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(insertSQL);

            ps.setInt(1, 1);
            ps.setString(2, "Ram");
            ps.setDouble(3, 80000);

            ps.executeUpdate();

            System.out.println("Record inserted in the table");

            // READ
            String readSQL = "SELECT * FROM EMPLOYEES";

            ps = con.prepareStatement(readSQL);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println(
                    rs.getInt("id") + " " +
                    rs.getString("name") + " " +
                    rs.getDouble("salary")
                );
            }

            // UPDATE
            String updateSQL =
                "UPDATE EMPLOYEES SET salary=? WHERE id=?";

            ps = con.prepareStatement(updateSQL);

            ps.setDouble(1, 90000);
            ps.setInt(2, 1);

            ps.executeUpdate();

            System.out.println("Data updated");

            // DELETE
            String deleteSQL =
                "DELETE FROM EMPLOYEES WHERE id=?";

            ps = con.prepareStatement(deleteSQL);

            ps.setInt(1, 1);

            ps.executeUpdate();

            System.out.println("Data deleted");

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

