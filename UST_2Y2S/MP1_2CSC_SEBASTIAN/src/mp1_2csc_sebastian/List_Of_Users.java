
package mp1_2csc_sebastian;

/**
 *
 * @author nigel
 */

//Import packages 

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
public class List_Of_Users implements ActionListener{
    
    //Initiates the elements of the login frame
    
    //Frames and panels
    private JFrame f_main;
    private JPanel header;
    private JPanel users;
    private JPanel button;
    
    //Buttons
    private JButton logout;
    
    //Areas 
    private JTextArea printer;
    //Labels
    private JLabel email;
    private JLabel password;
    private JLabel role;
    
    //Data 
    private ArrayList<user> userList = new ArrayList<user>();
    
    public List_Of_Users(){
        f_main = new JFrame("List of users");
        
        header = new JPanel();
        users = new JPanel();
        button = new JPanel();
        
        printer = new JTextArea(15, 30);
        printer.setEditable(false);
        
        logout = new JButton("Logout");
        logout.addActionListener(this);
        email = new JLabel("Email        \t   ");
        password = new JLabel("      \t        Password\t       ");
        role = new JLabel("     \t Role");
        
    }
    
    public void startApp(){
        header.add(email);
        header.add(password);
        header.add(role);
        
        users.add(printer);
        button.add(logout);
        
        f_main.add(header);
        f_main.add(users);
        f_main.add(button);
        
        f_main.addWindowListener(new CloseProgram());
        
        f_main.setBounds(430, 200, 600, 360);
        f_main.setLayout(new FlowLayout());
        f_main.setLocationRelativeTo(null);
        f_main.setVisible(true);
        
        getData();
        printData();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        f_main.dispose();
        MP1_2CSC_SEBASTIAN login_App = new MP1_2CSC_SEBASTIAN();
        login_App.startApp();
    }
    public void getData(){
        try{
           //Loads the driver
           String driver = "org.apache.derby.jdbc.ClientDriver";
           Class.forName(driver);
           System.out.print("Loaded Driver: " + driver);
           
           //Establishes the connection
           String url = "jdbc:derby://localhost:1527/LoginDB";
           String username = "app";
           String password = "app";
           Connection con = DriverManager.getConnection(url, username, password);
           System.out.println("Connected to: " + url);
           
           Statement stmt = con.createStatement();
           String query = "SELECT * FROM USERS ORDER BY EMAIL ASC";
           
           ResultSet rs = stmt.executeQuery(query);
           
           System.out.print("Executed Query: " + query);
           
           //Prints the result and puts all the users credentials to the hashmap
           System.out.println("Processing the result set: ");
           while(rs.next()){
               String Remail = rs.getString("EMAIL").trim();
               String Rpass = rs.getString("PASSWORD").trim();
               String Rrole = rs.getString("USERROLE").trim();
               System.out.println("Email : " + Remail);
               System.out.println("Password: " + Rpass);
               user u = new user(Remail, Rpass, Rrole);
               userList.add(u);
               System.out.println();
           }
              
           //Close the connection
           rs.close();
           stmt.close();
           con.close();
           
        }catch(SQLException | ClassNotFoundException sqle){
            sqle.printStackTrace();
        }
    }
    public void printData(){
        String user = "";
        for(user u : userList){
            user += " \t   " + u.getEmail() + "\t" + u.getPass() + " \t " + u.getRole() + " \t       \t" + "\n";
        }
        printer.setText(user);
    }
    //Closes the program
    private class CloseProgram extends WindowAdapter{
        public void windowClosing(WindowEvent we){
            System.exit(0);
        }
    }
    
    public static void main(String[] args) {
        
        System.out.print("Showing list of users");
        List_Of_Users list = new List_Of_Users();
        list.startApp();
    }
}
