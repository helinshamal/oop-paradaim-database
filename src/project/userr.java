/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Danyar Group
 */
public class userr extends user {
    private int ID;
  private String birthday;
  private int phonenumber;
  private String blood;
  public void setID(int ID){
      this.ID=ID;
      String[][][] appointmentSlots = new String[3][8][2];
      for (int day = 0; day < appointmentSlots.length; day++) {
            for (int hour = 0; hour < appointmentSlots[day].length; hour++) {
                for (int slot = 0; slot < appointmentSlots[day][hour].length; slot++) {
                    appointmentSlots[day][hour][slot] = "Available";
                }}}
              LocalDate today = LocalDate.now();
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd (EEEE)");

            
  }
   public int getid(){
       return ID;
   } 
   public void setbirth(String birthday){
      this.birthday=birthday;
  }
   public String getbirth(){
       return birthday;
   } 
    public void setnumber(int phonenumber){
      this.phonenumber=phonenumber;
  }
   public int getnumber(){
       return phonenumber;
   } 
    
    public void setblood(String blood){
      this.blood=blood;
  }
   public String getblood(){
       return blood;
   } 
   public void input(){
      
      System.out.println("choose: ");
      int choose=i.nextInt();
      if(choose==1){
          input1();
      }
      else if(choose==2){
       input2();
   }
      
  }
   public void input1(){
       System.out.println("full name: ");
       String f=i.next();
       setfullname(f);
       System.out.println("ID taskara: ");
       int ID=i.nextInt();
       setID(ID);
       System.out.println("phone number: ");
       int n=i.nextInt();
       setnumber(n);
       System.out.println("birthday: ");
       String birth=i.next();
       setbirth(birth);
       System.out.println("blood type: ");
       String b=i.next();
       setblood(b);
      
       
      
       output1();
       
   
   }
   public void input2(){
        System.out.println("full name: ");
       String f=i.next();
       setfullname(f);
       System.out.println("old ID : ");
       int ID=i.nextInt();
       setID(ID);
       System.out.println("phone number: ");
       int n=i.nextInt();
       setnumber(n);
       super.hh();
     
       output2();
       
       
   }
   public void output1(){
       
       System.out.println("full name: "+getfullname());
              System.out.println("ID taskara : "+getid());
                     System.out.println("phone number: "+getnumber());
       System.out.println("birthday: "+getbirth());
              System.out.println("blood type: "+getblood());



   }
   public void output2(){
       System.out.println("full name: "+getfullname());
              System.out.println("ID taskara : "+getid());
                     System.out.println("phone number: "+getnumber());
      
   }
}