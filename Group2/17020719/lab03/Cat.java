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
public class Cat {
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
