/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classproject;

/**
 *
 * @author Danyar Group
 */
public class loginuser extends superr {
 public void signin(){
   System.out.println("Enter the email: ");
    String email=s.nextLine();
    setemail(email);
    System.out.println("Enter pass: ");
    String pass=s.nextLine();
    setpass(pass); 
}   
  public void signup(){
    System.out.println("Enter fullname: ");
    String fullname=s.nextLine();
    setfullname(fullname);
    System.out.println("Enter Email: ");
    String email=s.nextLine();
    setemail(email);
    System.out.println("Enter pass: ");
    String pass=s.nextLine();
    setpass(pass);
    System.out.println("Enter confirmpass: ");
    String confirmpass=s.nextLine();
    setcofirmpass(confirmpass);
   
}
}
