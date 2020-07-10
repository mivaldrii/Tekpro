package DesignPattern;

public class User {
	String userName;
    String password;
    
    public User(String username, String password) {
        this.userName = username;
        this.password = password;
    }
    
    public String getUsername(){
        return userName;
    }
    
    public String getPassword() {
        return password;
    }

}
