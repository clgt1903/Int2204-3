/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thang
 */
public class Student {
     private  String name ;
     private  String mssv;
     private  String group;
     private  String email;

    public void setName(String name) {
        this.name = name;
    }

    public void setMssv(String mssv) {
        this.mssv = mssv;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getMssv() {
        return mssv;
    }

    public String getGroup() {
        return group;
    }

    public String getEmail() {
        return email;
    }

  
    
     String getInfo(){
         return name + " " +mssv+" " + group +" "+ email;
        
    }
     public void Student(){
         name = "Student";
         mssv = "000";
         group = "INT";
         email = "@edu";
        
     }
      public void Student(String n, String sid, String em){
         this.name = n;
         this.mssv = sid;
         this.group = "INT";
         this.email = em;
        
     }
       public void Student(Student n){
         this.name = n.name;
         this.mssv = n.mssv;
         this.group = n.group;
         this.email = n.email;
        
     }
    
}
