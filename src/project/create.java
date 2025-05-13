/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;


public class create extends edentity {
    
   private int IDtaskara;
     
   public void settaskara(int IDtaskara){
     this.IDtaskara=IDtaskara;  
   }   
   public int getIDtaskara(){
       return IDtaskara;
   } 
   public void input(){
      super.input();
       System.out.println("ID identity: ");
       String Idid=i.next();
        System.out.println("Birthday: ");
      String birth=i.next();
       setbirth(birth);
         System.out.println("blood type: ");
      String b=i.next();
       setblood(b);
output();
       
      
   }
   public void output(){
       super.output();
       System.out.println("ID identity: "+getIDtaskara());
       System.out.println("name: "+getname());
              System.out.println("email: "+getemail());
                System.out.println("Phone Number: "+getnumber());
                       System.out.println("Birthday: "+getbirth());
       System.out.println("blood type: "+getblood());



   }
}
