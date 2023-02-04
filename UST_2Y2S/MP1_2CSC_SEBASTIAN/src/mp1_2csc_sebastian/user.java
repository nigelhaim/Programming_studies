package mp1_2csc_sebastian;

/**
 *
 * @author nigel
 */


public class user {
    private String email; 
    private String pass; 
    private String role;
    
    public user(String email, String pass, String role){
        this.email = email;
        this.pass = pass;
        this.role = role;
    }
    
    public String getEmail(){
        return email;
    }
    
    public String getPass(){
        return pass;
    }
        
    public String getRole(){
        return role;
    }
}
