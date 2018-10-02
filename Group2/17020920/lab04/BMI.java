package com.petehouston.maven.unittestsample;

public class BMI {
    public String HienThi_BMI(double kg,double m){
        double bmi = kg/(m*m);
        if(bmi<18.5){
            return "Thieu Can";
        }
        if(bmi>=18.5 && bmi<23){
            return "Binh Thuong";

        }
        if(bmi>=23 && bmi<25){
            return "Thua Can";

        }
        if(bmi>=25){
            return "Beo Phi";

        }
        return "";

    }
}
