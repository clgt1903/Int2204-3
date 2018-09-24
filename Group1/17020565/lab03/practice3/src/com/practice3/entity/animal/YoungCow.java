package com.practice3.entity.animal;

public class YoungCow extends Animal {
    @Override
    public void Speak() {
        System.out.println("Mooo...Mooo!");
    }

    public void eatGrass(double grass){
        this.mass += grass/20;
    }
}
