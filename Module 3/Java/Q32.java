import java.sql.*;

public class StudentDAO {
    public void insertStudent(String name) throws Exception {
        Connection con = DriverManager.getConnection("jdbc:sqlite:students.db");
        PreparedStatement ps = con.prepareStatement("INSERT INTO students(name) VALUES (?)");
        ps.setString(1, name);
        ps.executeUpdate();
        con.close();
    }

    public void updateStudent(int id, String name) throws Exception {
        Connection con = DriverManager.getConnection("jdbc:sqlite:students.db");
        PreparedStatement ps = con.prepareStatement("UPDATE students SET name = ? WHERE id = ?");
        ps.setString(1, name);
        ps.setInt(2, id);
        ps.executeUpdate();
        con.close();
    }
}
