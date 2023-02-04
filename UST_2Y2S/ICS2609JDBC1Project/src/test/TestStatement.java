package test;

// import packages
import java.sql.*;

public class TestStatement {

    public static void main(String[] args) {
        try {
            // Load Driver
            String driver = "org.apache.derby.jdbc.ClientDriver";
            Class.forName(driver);
            System.out.println("Loaded Driver: " + driver);

            // Establish Connection
            String url = "jdbc:derby://localhost:1527/PersonDB";
            String username = "app";
            String password = "app";
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to: " + url);

            // Create and Execute the Statement
            Statement stmt = con.createStatement();
            String query = "SELECT * FROM PERSON_INFO ORDER BY name desc";
            ResultSet rs = stmt.executeQuery(query);
            System.out.println("Executed Query: " + query);

            // Retrieve the ResultSet
            System.out.println("Processing The Result Set: ");
            while (rs.next()) {
                System.out.println("Name: " + rs.getString("NAME").trim());
                System.out.println("Age: " + rs.getString("AGE").trim());
                System.out.println("Country: " + rs.getString("COUNTRY").trim());
                System.out.println();
            }

            // Close the connection
            rs.close();
            stmt.close();
            con.close();
        } catch (SQLException | ClassNotFoundException sqle) {
            sqle.printStackTrace();
        }
    }
}
