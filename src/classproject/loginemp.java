/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classproject;

/**
 *
 * @author Danyar Group
 */
public class loginemp extends superr {
    private int ID=1234;
    public void setID(int ID){
        this.ID=ID;
    }
    public int getID(){
       return ID;
    }
  public void signin(){
   System.out.println("Enter the ID: ");
    int ID=s.nextInt();
    setID(ID);
    System.out.println("Enter pass: ");
    String pass=s.next();
    setpass(pass); 
}   
  
}
