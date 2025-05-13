/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classproject;

/**
 *
 * @author Danyar Group
 */


import java.util.Scanner;
public class superr {
    Scanner s=new Scanner(System.in);
    private String fullname;
        private String email;
    private String pass;
        private String confirmpass;
public void setfullname(String fullname){
   this.fullname=fullname;
}
public String getfullname(){
    return fullname;
}
public void setemail(String email){
   this.email=email;
}
public String getemail(){
    return email;
}
public void setpass(String pass){
   this.pass=pass;
}
public String getpass(){
    return pass;
}
public void setcofirmpass(String confirmpass){
   this.confirmpass=confirmpass;
}
public String getcofirmpass(){
    return confirmpass;
}
public void signup(){
    System.out.println("Enter fullname: ");
    String fullname=s.next();
    setfullname(fullname);
    System.out.println("Enter Email: ");
    String email=s.next();
    setemail(email);
    System.out.println("Enter pass: ");
    String pass=s.next();
    setpass(pass);
    System.out.println("Enter confirmpass: ");
    String confirmpass=s.next();
    setcofirmpass(confirmpass);
   
}
public void signin(){
   System.out.println("Enter Email: ");
    String email=s.next();
    setemail(email);
    System.out.println("Enter pass: ");
    String pass=s.next();
    setpass(pass); 
}



    
}
