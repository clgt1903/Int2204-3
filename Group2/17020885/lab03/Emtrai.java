/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cau3;

/**
 *
 * @author Dell
 */
public class Emtrai {
     String Name;
    int Age;
    String Nghenghiep;

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getNghenghiep() {
        return Nghenghiep;
    }

    public void setNghenghiep(String Nghenghiep) {
        this.Nghenghiep = Nghenghiep;
    }
    public String getinfo()
    {   return "ten :" +Name +".\ntuoi: " +Age+ ".\nNghe nghiep:"+Nghenghiep; 
    }
    public Emtrai(){
}
}
