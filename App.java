import java.sql.*;

public class App {
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/college",
            "root",
            "Shanu@1327");

        System.out.println(con);
        System.out.println("connection created");
        con.close();
    }
}