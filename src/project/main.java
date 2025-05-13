/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;
import java.util.Scanner;
/**
 *
 * @author Danyar Group
 */
public class main {
    
  public static void main(String []args){
      Scanner input=new Scanner(System.in);
      
      update up=new update();
      userr c1=new userr();
      admin ad=new admin();
      user u=new user();
            System.out.println("1-Admin\n2-user");
            int ch=input.nextInt();
            if(ch==1){
               ad.input();
            }
if(ch==2){

              System.out.println("1-Login\n2-sign up");
              int c=input.nextInt();
              if(c==1){
               u.inputlogin();
              }
              else if(c==2){
                  u.inputsign();
              }
              c1.input1();
           
      }}
      
  }  

