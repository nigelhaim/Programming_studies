package test;

// import packages
import java.sql.*;

public class TestPreparedStatement {

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

//            // Create and Execute the Statement
//            Statement stmt = con.createStatement();
//            String query = "SELECT * FROM PERSON_INFO ORDER BY name";


            // Create and Execute the PreparedStatement
            String query = "SELECT * FROM PERSON_INFO WHERE NAME = ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, "Lawrence");

            // ResultSet rs = stmt.executeQuery(query);
            ResultSet rs = ps.executeQuery();
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
            // stmt.close();
            ps.close();
            con.close();
        } catch (SQLException | ClassNotFoundException sqle) {
            sqle.printStackTrace();
        }
    }
}
