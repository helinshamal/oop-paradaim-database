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
      create c1=new create();
      admin ad=new admin();
            System.out.println("1-Admin\n2-user");
            int ch=input.nextInt();
            if(ch==1){
               ad.display();
            }
if(ch==2){
      System.out.println("Whate Do you want?\n"
              + "1-Create\n2-update");
      int choose=input.nextInt();
      switch(choose){
          case 1:
              c1.display();
              break;
          case 2:
              up.display();
      }}
      
  }  
}
