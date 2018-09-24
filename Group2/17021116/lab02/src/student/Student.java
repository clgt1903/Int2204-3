/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 * @author 123456789
 */
public class Student 
{
    private String name;
    private String id;
    private String group;
    private String email;
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    public void setId(String id){
        this.id = id;
    }
    
    public String getId(){
        return id;
    }
    
    public void setGroup(String group){
        this.group = group;
    }
    
    public String getGroup(){
        return group;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public String getEmail(){
        return email;
    }
    
    String getInfo(){
        return "name : "+name+"\nid : "+id+"\ngroup : "+group+"\nemail : "+email;
    }
    
    public Student(){
        name = "Student";
        id = "000";
        group = "K59CB";
        email = "uet@vnu.edu.vn";
    }
    
    public Student(String n, String sid, String em){
        name = n;
        id = sid;
        group = "K59CB";
        email = em;
    }
    
    public Student(Student s){
         this.name = s.name;
         this.id = s.id;
         this.group = s.group;
         this.email = s.email;  
    }
}



