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
public class Rectangle {
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
