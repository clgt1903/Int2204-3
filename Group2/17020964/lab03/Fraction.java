
package lab3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Toàn Tồi Tệ
 */
public class Fraction {
    private int Numerator;
    private int Denominator;

    public int getNumerator() {
        return Numerator;
    }

    public void setNumerator(int Numerator) {
        this.Numerator = Numerator;
    }

    public int getDenominator() {
        return Denominator;
    }

    public void setDenominator(int Denominator) {
        this.Denominator = Denominator;
    }

    public Fraction(int Numerator, int Denominator) {
        this.Numerator = Numerator;
        this.Denominator = Denominator;
    }
    public void Plus(Fraction Fr){// Cộng 2 phân số
        Fraction sum=new Fraction(0,0);
        sum.Numerator=Fr.getNumerator()*this.Denominator+Fr.getDenominator()*this.Numerator;
        sum.Denominator=Fr.getDenominator()*this.Numerator;
        simplify(sum);
        export(sum);
    }
    public void Minus(Fraction Fr){// Trừ 2 phân số
        Fraction brand=new Fraction(0,0);
        brand.Numerator=Fr.getNumerator()*this.Denominator-Fr.getDenominator()*this.Numerator;
        brand.Denominator=Fr.getDenominator()*this.Numerator;
        simplify(brand);
        export(brand);
    }
    public void Human(Fraction Fr){// Nhân 2 phân số
        Fraction Accomplishments=new Fraction(0,0);
        Accomplishments.Numerator=Fr.getNumerator()*this.Numerator;
        Accomplishments.Denominator=Fr.getDenominator()*this.Denominator;
        simplify(Accomplishments);
        export(Accomplishments);
    }
    public void Share(Fraction Fr){// Chia 2 phân số
        Fraction quotient=new Fraction(0,0);
        quotient.Numerator=Fr.Numerator*this.Denominator;
        quotient.Denominator=Fr.Denominator*this.Numerator;
        simplify(quotient);
        export(quotient);
    }
    @Override
    public boolean equals(Object obj) {//Hàm so sánh 2 phân số
        if(obj instanceof Fraction){
            Fraction other = (Fraction)obj;
            return other.getNumerator()*this.Denominator==other.getDenominator()*this.Numerator;
        }else return false;
       
    }
    public void export(Fraction Fr){// Xuất ra màn hình phân số
        System.out.print(Fr.Numerator);
        System.out.print("/");
        System.out.println(Fr.Denominator);               
    }
    public int gcDivisor(int a,int b){// Tính ước chung lớn nhất
        if(a<0)
            a=0-a;
        if(b<0)
            b=0-b;
        if(a==0||b==0)
        {
            //System.out.println(a+b);
            return a+b;
        }else while(a!=b)
        {
            if(a>b)
                a=a-b;
            else b=b-a;
        }
        return a;
             
    }
    public void simplify(Fraction Fr){//Tối giản phân số
        int n=gcDivisor(Fr.Denominator,Fr.Numerator );
        Fr.Denominator=Fr.Denominator/n;
        Fr.Numerator=Fr.Numerator/n;
    }
    
    
}
