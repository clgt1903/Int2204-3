package com.practice3.entity.supplies;

public class Book extends Supplies {
    private int  length;
    private int width;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public void getInfo() {
        System.out.println("Ten sach: "+this.name+"| Gia sach: "+this.cost+"| Kich co: "+this.length+" "+this.width);
    }

    public boolean isCost(){
        if(this.cost > 200000) return true;
        else return false;
    }
}
