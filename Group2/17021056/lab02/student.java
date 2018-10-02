
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahuhu;

/**
 *
 * @author Administrator
 */
public class student {
    private String name ;
    private String id;
    private String group;
    private String email;

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getId() {
        return id;
    }

    public String getGroup() {
        return group;
    }

    public String getEmail() {
        return email;
    }
    public String getinfo()
    {   return "ten sinh vien:" +name +"\nma sinh vien: " +id+ "\nnhom hoc:"+ group+"\nemail:"+email; 
    }

    public student() {
       
    }
     public student(String name, String id, String email) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.group = "INT2204";
    }
     public void student(student s) {
        this.name = s.name;
        this.id = s.id;
        this.email = s.email;
        this.group = s.group;
     }

}
