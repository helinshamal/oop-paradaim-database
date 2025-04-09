/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;
import java.util.Scanner;

public class admin extends edentity {
    private int ID=1234;
    private String pass;
    public void setID(int ID){
        this.ID=ID;
    }
    public int getID(){
        return ID;
    } 
    public void setpass(String pass){
        this.pass=pass;
    }
    public String getpass(){
        return pass;
    } 
    
    public void display(){
        Scanner input=new Scanner(System.in);
        
        
           setname("rueia abas");
           setemail("rueiaabas@gmail.com");
       setnumber(07702373263);
           setID(ID);
            System.out.println("ID: "+getID()+"\nname:"+getID()+"\nemail: "+getemail()+
                    "number: "+getnumber());
            
        
        
        
    }
}
