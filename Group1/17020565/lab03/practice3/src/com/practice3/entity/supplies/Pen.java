package com.practice3.entity.supplies;

public class Pen extends  Supplies {
    private double lenght;
    private String color;

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void getInfo() {
        System.out.println("mau: "+this.color+" giá: "+this.cost+" do dai: "+this.lenght);
    }

    public boolean isExpensive(){
        if(this.cost > 20000) return true;
        else return false;
    }
}
