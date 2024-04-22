/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.loginandregsystem;

/**
 *
 * @author RC_Student_lab
 */
import javax.swing.JOptionPane;
public class LoginAndRegSystem {
    static String username;
    static String password;
    static String name;
    static String surname;

    public static void main(String[] args) {
    details();
    checkUserName ();  
    checkpasswordcomplexity();
    LoginUser();
    }

    public static void details(){
        
    name = JOptionPane.showInputDialog("Please enter name");
    surname =JOptionPane.showInputDialog("Enter surname");
   
    }
    
    
    //Username

    public static boolean checkUserName (){
    boolean user;
    username = JOptionPane.showInputDialog(null,"Enter username");
    
    if(username.contains("_") && (username.length() <=5))
    {    
    
       JOptionPane.showInputDialog(null,"Username succefully captured");
       
       return true;
    
    }else{;
    user = false;
    JOptionPane.showInputDialog(null,"Username is not correctly formatted,"
                                                 +"\nplease ensure that your username contains an underscore"
                                                 +"\nand no more than 5 characters in length");
    checkUserName();
    
    }
      
    return user;        
}    
    
    //Password
    
    public static boolean checkpasswordcomplexity(){
        
        //correct password
        
        boolean pass;       
        password =  JOptionPane.showInputDialog(null,"Enter password");
    
        if(password.length() >=8 && password.matches(".*[A-Z].*") && password.matches(".*\\d*") && password.matches(".*[!@#%^&*()-+=_].*"))
        {
            
          JOptionPane.showInputDialog(null,"Password succefully captured");
       
        return true;
        
        //Incorrect password 
        
        }else{;
        pass = false;
        JOptionPane.showInputDialog(null,"Password is not corectly formatted,"
                                                 +"\nEnsure that the password contains at least 8 characters"
                                                 +"\na capital letter"
                                                 +"\na number and a special character");
        
        checkpasswordcomplexity();
        }
        return pass ;
                  
    }       
    
    //Login
                    
    public static void LoginUser(){
        {
        //True
        String User2 =  JOptionPane.showInputDialog("your registration was succesful,enter your username to login");
        String password2 = JOptionPane.showInputDialog("Enter your password to login"); 
        
        if(User2.equals(username) && password2.equals(password))
        {
            JOptionPane.showMessageDialog(null," Welcome"
                                                                + name
                                                                + " "
                                                                + surname
                                                                +" , It is great to see you again."); 
        //false
            System.exit(0);
        }else{
            
                JOptionPane.showMessageDialog(null," Username or password incorect"
                                                                + "\n please try again later");               
                LoginUser();
                }
         
        }
    }        
}          
 



           
        
        
        
        
        
        
        
    
        
        
           

        
          
    
   
    
                 
