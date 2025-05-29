import java.sql.*;

public class InsertUpdateJDBC {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:students.db");

            PreparedStatement ps = conn.prepareStatement("INSERT INTO students(name) VALUES (?)");
            ps.setString(1, "John");
            ps.executeUpdate();

            ps = conn.prepareStatement("UPDATE students SET name = ? WHERE name = ?");
            ps.setString(1, "Johnny");
            ps.setString(2, "John");
            ps.executeUpdate();

            conn.close();
        } catch (SQLException e) {
            System.out.println("DB Error");
        }
    }
}
