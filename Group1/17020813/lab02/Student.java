package week1;

public class Student {
    private String name,id,group,email;
    public void setName(String n){
        this.name=n;
    }
    public String getName(){
        return name;
    }
    public void setId(String n){
        this.id= n;
    }
    public String getId(){
        return id;
    }
    public void setGroup(String n){
        this.group= n;
    }
    public String getGroup(){
        return group;
    }
    public void setEmail(String n){
        this.email= n;
    }
    public String getEmail(){
        return email;
    }
	
    Student( ) {
        name="Student";
        id="000";
        email="uet@vnu.edu.vn";
        group="INT2204_3";

    }
    Student(String n, String sid, String em) {
        name=n;
        id=sid;
        email=em;
        group="INT2204_3";
    }

    Student(Student s) {
        name=s.getName();
        id=s.getId();
        group=s.getGroup();
        email=s.getEmail();
    }

    String getInfo() {
        System.out.println(name);
        System.out.println(id);
        System.out.println(group);
        System.out.println(email);
        return null;
    }
}