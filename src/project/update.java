/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

/**
 *
 * @author Danyar Group
 */
public class update extends edentity {
 private int oldID; 
      public void setID(int oldID){
      this.oldID=oldID;
  }
   public int getID(){
       return oldID;
   } 
   public void input(){
       super.input();
       System.out.println("Old ID: ");
       int ID=i.nextInt();
       setID(ID);
       output();
     
   }
   public void output(){
      
       super.output();
       System.out.println("Old ID: "+getID());
   }
 
}
