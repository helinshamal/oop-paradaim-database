/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;


public class create extends edentity {
    private int IDpass;
    private int IDtaskara;
     public void setIDpass(int IDpass){
      this.IDpass=IDpass;
  }
   public int getIDpass(){
       return IDpass;
   }
       public void setIDtaskara(int IDtaskara){
      this.IDtaskara=IDtaskara;
  }
   public int getIDtaskara(){
       return IDtaskara;
   } 
   public void display(){
       setIDpass(12345);
       setIDtaskara(436364);
       setname("helin shamal");
       setbirth("12_1_2005");
       setemail("helinshamal@gmail.com");
       setnumber(07702373263);
       setblood("AB+");
              System.out.println("Create edentity");

    System.out.println("fullname:"+getname()+"\n"
   + "BirthDay:"+getbirth()+"\nBlood"+getblood()
    +"\nIDpass: "+getIDpass()+
  "\nIDtaskara: "+getIDtaskara()+"\nemail:"+getemail()+"\nnumber:"+getnumber()
    );   
   }
}
