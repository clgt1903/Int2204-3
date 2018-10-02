/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object;

/**
 *
 * @author Admin
 */
class Dog{
    private int size;
    private String breed;
    private String name;
    private void bark(){
        System.out.println("Bark: " + "Ruff! Ruff!");
    }
    
    public int getSize(){
        return size;
    }
    public void setSize(int size){
        this.size = size;
    }
    
    public String getBreed(){
        return breed;
    }
    public void setBreed(String breed){
        this.breed = breed;
    }
    
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    
    public void getBark(){
        bark();
    }
    
    public void getInfor(){
        System.out.println("Size: " + size);
        System.out.println("Breed: " + breed);
        System.out.println("Name: " + name);
        getBark();
    }
}

class Cat{
    private int size;
    private String breed;
    private String name;
    private void bark(){
        System.out.println("Bark: " + "Meo!");
    }
    
    public int getSize(){
        return size;
    }
    public void setSize(int size){
        this.size = size;
    }
    
    public String getBreed(){
        return breed;
    }
    public void setBreed(String breed){
        this.breed = breed;
    }
    
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    
    public void getBark(){
        bark();
    }
    
    public void getInfor(){
        System.out.println("Size: " + size);
        System.out.println("Breed: " + breed);
        System.out.println("Name: " + name);
        getBark();
    }
}

class Class {
    private String name;
    private String subjectCode;
    private String credit;
    
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    
    public String getSubjectCode(){
        return subjectCode;
    }
    public void setSubjectCode(String subjectCode){
        this.subjectCode = subjectCode;
    }
    
    public String getCredit(){
        return credit;
    }
    public void setCredit(String credit){
        this.credit = credit;
    }
    
    public Class(String name, String subjectCode, String credit){
        this.name = name;
        this.subjectCode = subjectCode;
        this.credit = credit;
    }
    
    public String getInfor(){
        return "Name: " + name + "\nSubjectCode: " + subjectCode + "\nCredit: " + credit;
    }
}

class Car {
    private String brand;
    private String color;
    private int maxSpeed;
    private String getFuel;
    private void horn(){
        System.out.println("Beep!");
    }
    
    public String getBrand(){
        return brand;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    
    public int getMaxSpeed(){
        return maxSpeed;
    }
    public void setMaxSpeed(int maxSpeed){
        this.maxSpeed = maxSpeed;
    }
    
    public String getFuel(){
        return getFuel;
    }
    public void setFuel(String getFuel){
        this.getFuel = getFuel;
    }
    public void getInfor(){
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("MaxSpeed: " + maxSpeed);
        System.out.println("Fuel: " + getFuel);
        horn();
    }
}

class Pencil {
    private String brand;
    private String color;
    
    public String getBrand(){
        return brand;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    
    public void getInfor(){
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
    }
}

class President {
    private String name;
    private String nation;
    private int age;
    private int getHand;
    
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    
    public String getNation(){
        return nation;
    }
    public void setNation(String nation){
        this.nation = nation;
    }
    
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    
    public int getHand(){
        return getHand;
    }
    public void setHand(int getHand){
        this.getHand = getHand;
    }
}

class People {
    private String name;
    private int age ;
    private String email;
    private String job;
    
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    
    public String getJob(){
        return job;
    }
    public void setJob(String job){
        this.job = job;
    }
    
    public void getInfor(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
        System.out.println("Job: " + job);
    }
}

class Rectangle {
    private int length;
    private int width;
    private void calculateArea(){
        System.out.println("Area: " + length * width);
    }
    
    public int getLength(){
        return length;
    }
    public void setLength(int length){
        this.length = length;
    }
    
    public int getWidth(){
        return width;
    }
    public void setWidth(int width){
        this.width = width;
    }
    
    public void getCalculateArea(){
        calculateArea();
    }
}

class Student {
    private String name;
    private String id;
    private String group;
    private String email;
    
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }
    public String getGroup(){
        return group;
    }
    public void setGroup(String group){
        this.group = group;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    
    public String getInfor(){
        return "Name:" + name + "\nID:" + id +
                "\nGroup:" + group + "\nEmail:" + email; 
    }
}

class Teacher {
    private String name;
    private int age ;
    private String email;
    private String hisClass;
    
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    
    public String getHisClass(){
        return hisClass;
    }
    public void setHisClass(String hisClass){
        this.hisClass = hisClass;
    }
    
    public void getInfor(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
        System.out.println("His class: " + hisClass);
    }
}

public class Object {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dog dog = new Dog();
        dog.setSize(20);
        dog.setBreed("Husky");
        dog.setName("Bim");
        dog.getInfor();
        
        System.out.println("");
        
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(20);
        rectangle.setWidth(30);
        rectangle.getCalculateArea();
        
        System.out.println("");
        
        People people = new People();
        people.setName("Hanh");
        people.setAge(19);
        people.setEmail("lehonghanh.120@mail.com");
        people.setJob("Student");
        people.getInfor();
        
        System.out.println("");
        
        Car car = new Car();
        car.setBrand("Toyota");
        car.setColor("blue");
        car.setMaxSpeed(150);
        car.setFuel("Deisel");
        car.getInfor();
        
        System.out.println("");
        
        Class myclass = new Class("OPP", "INT2204", "3");
        System.out.println(myclass.getInfor());
        
        System.out.println("");
        
        Student st = new Student();
        st.setName("Hanh");
        st.setId("17020719");
        st.setGroup("K62-CE");
        st.setEmail("lehonghanh.120@gmail.com");
        System.out.println(st.getInfor());
    }
}

