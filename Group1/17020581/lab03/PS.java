package tuan3;

public class PS {
    int tuSo;
    int mauSo;
    PS(int tu, int mau)
    {
        this.tuSo = tu;
        this.mauSo = mau;
    }
    Tuan3 aaa = new Tuan3();
    public void Cong(PS ps2)
    {
        int tu = ps2.mauSo * this.tuSo + this.mauSo * ps2.tuSo;
        int mau = this.mauSo * ps2.mauSo;
        int a = aaa.UCLN(tu, mau);
        System.out.println ("Ket qua cua phep cong 2 phan so la : " + tu/a +"/" + mau/a);
    }
    public void Tru(PS ps2)
    {
        int tu = ps2.mauSo * this.tuSo - this.mauSo * ps2.tuSo;
        int mau = this.mauSo * ps2.mauSo;
        int a = aaa.UCLN(tu, mau);
        System.out.println ("Ket qua cua phep tru 2 phan so la : " + tu/a +"/" + mau/a);
    }
    public void Nhan(PS ps2)
    {
        int tu = this.tuSo * ps2.tuSo;
        int mau = this.mauSo * ps2.mauSo;
        int a = aaa.UCLN(tu, mau);
        System.out.println ("Ket qua cua phep nhan phan so la : " + tu/a +"/" + mau/a);
    }
    public void Chia(PS ps2)
    {
        int tu = this.tuSo * ps2.mauSo;
        int mau = this.mauSo * ps2.tuSo;
        int a = aaa.UCLN(tu, mau);
        System.out.println ("Ket qua cua phep chia phan so la : " + tu/a +"/" + mau/a);
    }
    public boolean equals(Object obj)
    {
        if (obj instanceof PS)
        {
           PS other = (PS) obj;
           if (this.tuSo * other.mauSo == other.tuSo * this.mauSo)
           {
           return true;
           }
           return false;
    }
        return false;
    }
    public static void main(String args[])
    {
        PS ps1 = new PS(2, 5);
        PS ps2 = new PS(3, 7);
        ps1.Chia(ps2);
        ps1.Cong(ps2);
        ps1.Nhan(ps2);
        ps1.Tru(ps2);
        if (ps1.equals(ps2))
        {
            System.out.println ("PS1 = PS2");
        }
        else {
             System.out.println ("PS1 != PS2");
        }
    }
    
}
