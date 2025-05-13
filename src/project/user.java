/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

/**
 *
 * @author Danyar Group
 */
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class user extends edentity {
    Scanner i=new Scanner(System.in);
    private String fullname;
    private String email;
    private String username;
  private String pass; 
  public void setfullname( String fullname){
    this.fullname=fullname;
  }
  public void setemail(String email){
      this.email=email;
  }
  public String getfullname(){
      return fullname;
  }
  public String getemail(){
      return email;}
  
  public void setusername( String username){
    this.username=username;
  }
  public void setpass(String pass){
      this.pass=pass;
  }
  public String getusername(){
      return username;
  }
  public String pass(){
      return pass;
  }
  public void inputsign(){
      
      System.out.println("full name: ");
      String name=i.next();
      setfullname(name);
      System.out.println("username: ");
      String n=i.next();
      setname(n);
      System.out.println("Email: ");
      String e=i.next();
      setemail(e);
      System.out.println("Password: ");
      String p=i.next();
      setpass(p);
     
      
  }
  public void hh(){
       System.out.println("");
      super.displayAvailableSlots(appointmentSlots, today, dateFormatter);
  }
  public void inputlogin(){
      System.out.println("username: ");
      String n=i.next();
      setname(n);
      System.out.println("Password: ");
      String p=i.next();
      setpass(p);
      
       }

    
  
    
}
