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
   public void display(){
       
       setID(436364);
       setname("helin shamal");
       setbirth("12_1_2005");
       setemail("helinshamal@gmail.com");
       setnumber(07702373263);
       setblood("AB+");
       System.out.println("Update edentity");
    System.out.println("fullname:"+getname()+"\n"
   + "BirthDay: "+getbirth()+"\nBlood: "+getblood()
    +"\noldID: "+getID()+
  "\nemail: "+getemail()+"\nnumber: "+getnumber()
    );   
   }
 
}
