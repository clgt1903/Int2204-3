package com.practice3.entity.supplies;

public class Laptop extends Supplies {
    private String chip;

    public Laptop() {
        this.name = "Laptop";
    }

    public String getChip() {
        return chip;
    }

    public void setChip(String chip) {
        this.chip = chip;
    }

    @Override
    public void getInfo() {
        System.out.println("Ten may: "+this.name+"| Ten chip: "+this.chip+"| Gia: "+this.cost);
    }

    public boolean isHighTachChip(){
        if(this.chip.equals("I5") || this.chip.equals("I7")) return true;
        else return false;
    }
}
