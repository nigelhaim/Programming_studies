package mp1_2csc_sebastian;

/**
 *
 * @author nigel
 */

//Import packages

import javax.swing.*;
import java.io.*;
import java.util.*;
import java.awt.event.*; 
import java.awt.*;
import java.sql.*;

public class MP1_2CSC_SEBASTIAN implements ActionListener{
    
    //Initiates the elements of the login frame
    
    //Frames and panels
    private JFrame f; 
    private JPanel loginPanel;
    private JPanel loginPanelEmail;
    private JPanel loginPanelPass;
    
    //labels
    private JLabel email;
    private JLabel pass;
    
    private JTextField Textemail; 
    private JTextField TextPass; 
    
    //Values
    private String useremail_Value; 
    private int login_attempts; 
    
    //Buttons
    private JButton login;
      
    
    public MP1_2CSC_SEBASTIAN(){
        //Creates the Frame and contents
        f = new JFrame("Login");
        loginPanel = new JPanel();
        loginPanelEmail = new JPanel();
        loginPanelPass = new JPanel();
        
        Textemail = new JTextField(20);
        TextPass = new JTextField(20);
        
        email = new JLabel("Username: ");
        pass = new JLabel("Password:  ");
        
        login = new JButton("Login");
        login_attempts = 0;
    }
        
    public void startApp(){
        
        //Adds the email label and textfield to the panel
        loginPanelEmail.add(email);
        loginPanelEmail.add(Textemail);
        
        //Adds the password label and textfield to the 
        loginPanelPass.add(pass);
        loginPanelPass.add(TextPass);
        
        loginPanel.add(loginPanelEmail);
        loginPanel.add(loginPanelPass);
        loginPanel.add(login);
        
        f.add(loginPanel);
        f.setSize(330, 160); 
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        
        login.addActionListener(this);
        f.addWindowListener(new CloseProgram());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //Gets the texts from the Text panels 
        String email_value = Textemail.getText();
        String pass_value = TextPass.getText();
        
        //Prints in the terminal of the attempts and input details
        System.out.println("Attempted login: " + login_attempts);
        System.out.println("Username: " + email_value);
        System.out.println("Password: " + pass_value);
        
        //Runs a query in the data base and checks if access is granted
        boolean access = login_user(email_value, pass_value);
        
        /*
        * If granted access then the login panel will be disposed and show the list of users
        * else if there the attempt will be incremented if denied in the third time the program
        * will close 
        */
         
        if (access){
                System.out.println("Access Granted!");
                f.dispose();
                List_Of_Users main_App = new List_Of_Users();
                main_App.startApp();
            }
            else{//Else denied and when input the incorrect credentials for the 3rd time the system will exit
                System.out.println("Access Denied!");
                JOptionPane.showMessageDialog(f, "Incorrect Username / Password", "Error Screen", JOptionPane.INFORMATION_MESSAGE);
                login_attempts++;

                if(login_attempts > 2)
                {
                    JOptionPane.showMessageDialog(f, "Sorry, you have reached the limit of 3 tries, good bye!", "Error Screen", JOptionPane.INFORMATION_MESSAGE);
                    System.exit(0);
                }
            }
    }
    
    //Closes the program
    private class CloseProgram extends WindowAdapter{
        public void windowClosing(WindowEvent we){
            System.exit(0);
        }
    }
    
    //Checks the credentials form the database 
    private boolean login_user(String email, String pass){
        //Initates the variable
        boolean login = false;
        
        //Connects to the database and checks the credentials if valid it will return true else false 
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
           String query = "SELECT Email, Password FROM USERS WHERE Email=" + "'" + email + "'";
           
           ResultSet rs = stmt.executeQuery(query);
           
           System.out.print("Executed Query: " + query);
           
           //Prints the result and puts all the users credentials to the hashmap
           System.out.println("Processing the result set: ");
           while(rs.next()){
               String Remail = rs.getString("EMAIL").trim();
               String Rpass = rs.getString("PASSWORD").trim();
               System.out.println("Email : " + Remail);
               System.out.println("Password: " + Rpass);
               System.out.println();
                if((Remail.equals(email.trim())) && (Rpass.equals(pass.trim()))){
                login = true;
                System.out.println("Logged in");
                }
                else{
                    login = false;
                }
           }
              
           //Close the connection
           rs.close();
           stmt.close();
           con.close();
           
        }catch(SQLException | ClassNotFoundException sqle){
            sqle.printStackTrace();
        }
        return login;
    }
    
    public static void main(String[] args) {
        System.out.print("Running");
        MP1_2CSC_SEBASTIAN login = new MP1_2CSC_SEBASTIAN();
        login.startApp();
    }
    
}
