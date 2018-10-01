
import static java.lang.Math.abs;

public class PhanSo {
    private int tu,
            mau;

    public PhanSo(int tu, int mau) {
        this.tu = tu;
        this.mau = mau;
    }

    public void setTu(int tu) {
        this.tu = tu;
    }

    public int getTu() {
        return this.tu;
    }

    public void setMau(int mau) {
        this.mau = mau;
    }

    public int getMau() {
        return this.mau;
    }

  public static int UCLN(int a,int b)
    {       a=abs(a); 
            b=abs(b);            
            if (a==0 ||b==0)
                return a+b;
            while (a!=b)
            {
                if(a>b)
                    a=a-b;
                else
                    b=b-a;
            }
            return a;
    }
    public void ToigianPS() {
        int i = UCLN(getTu(), getMau());
        this.setTu(this.getTu() / i);
        this.setMau(this.getMau() / i);
    }

    public void CongPS(PhanSo a) {
        int tuso = (a.getTu()) * (this.getMau()) + (a.getMau()) * (this.getTu());
        int mauso = (a.getMau()) * (this.getMau());
        PhanSo c = new PhanSo(tuso, mauso);
        c.ToigianPS();
        System.out.println("Cộng 2 Phân Số: " + c.getTu() + "/" + c.getMau());
    }

    public void TruPS(PhanSo a) {
        int tuso = ((this.getTu()) * (a.getMau())) - ((this.getMau()) * (a.getTu()));
        int mauso = (a.getMau()) * (this.getMau());
        PhanSo c = new PhanSo(tuso, mauso);
        c.ToigianPS();
        System.out.println("Trừ 2 phân số: " + c.getTu() + "/" + c.getMau());
    }

    public void NhanPS(PhanSo a) {
        int tuso = (a.getTu()) * (this.getTu());
        int mauso = (a.getMau()) * (this.getMau());
        PhanSo c = new PhanSo(tuso, mauso);
        c.ToigianPS();
        System.out.println("Nhân 2 phân số: " + c.getTu() + "/" + c.getMau());
    }

    public void ChiaPS(PhanSo a)
    {
        int tuso = this.getTu() * a.getMau();
        int mauso = this.getMau() * a.getTu();
        PhanSo c = new PhanSo(tuso, mauso);
        c.ToigianPS();
        System.out.println("Chia 2 phân số: " + c.getTu() + "/" + c.getMau());
    }
    public boolean equals(Object a)
    {   
        if(a instanceof PhanSo){
            if (((PhanSo)a).tu*this.mau==((PhanSo) a).mau*this.tu){
               
                    return true;
                
            }
        }
        return false;
    }
    public static void main(String[] args)
    {
        PhanSo s1 = new PhanSo(2, 16);
        PhanSo s2 = new PhanSo(1, 8);
        s1.CongPS(s2);
        s1.TruPS(s2);
        s1.NhanPS(s2);
        s2.ChiaPS(s2);
        if(s1.equals(s2))
            System.out.println("2 phân số bằng nhau");
        else
            System.out.println("2 số không bằng nhau");
    }
}