/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object;

/**
 *
 * @author 123456789
 */
public class Object {

    private String name;
    private String sex;
    private String age;
    private String job;
    private String country;
    
    //set va get ten
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    //set va get gioi tinh
    public void setSex(String sex){
        this.sex = sex;
    }
    public String getSex(){
        return sex;
    }
    //set va get tuoi
    public void setAge(String age){
        this.age = age;
    }
    public String getAge(){
        return age;
    }
    //set va get nghe nghiep
    public void setJob(String job){
        this.job = job;
    }
    public String getJob(){
        return job;
    }
    //set va get que quan
    public void setCountry(String country){
        this.country = country;
    }
    public String getCountry(){
        return country;
    }
    //khoi tao thong tin tung doi tuong
    public void setInfo(String oname,String osex,String oage,String ojob,String ocountry){
        this.name = oname;
        this.sex = osex;
        this.age = oage;
        this.job = ojob;
        this.country = ocountry;
    }
    //xuat thong tin cua doi tuong
    String getInfo(){
        return "Name : "+name+"\nSex : "+sex+"\nAge : "+age+"\nJob : "+job+"\nCountry : "+country+"\n\n";
    }
       
}

