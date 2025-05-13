/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

public class admin extends edentity {
    private int ID;
    private String pass;
    public void setID(int ID){
        this.ID=ID;
    }
    public void setpass(String pass){
        this.pass=pass;
    }
    
    public int getID(){
        return ID;
    } 
    public String getpass(){
        return pass;
    }
    
    public void input(){
      
           System.out.println("ID: ");
           int ID=i.nextInt();
           setID(ID);
          System.out.println("pass: ");
          String pass=i.next();
          setpass(pass);
      output();
    }
    public void output(){
        System.out.println("ID: "+getID());
        System.out.println("pass: "+getpass());
    }
}
