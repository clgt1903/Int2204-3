import java.util.Scanner;
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

    static UCLN gcd = new UCLN();

    public void ToigianPS() {
        int i = gcd.ucln(getTu(), getMau());
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
    public boolean equals(Object obj)
    {
        if(obj instanceof PhanSo)
        {
            PhanSo other=(PhanSo)obj;
            if(other.getTu()*this.getMau()==other.getMau()*this.getTu())
                return true;
            return false;
        }
        return false;
    }
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int tu1,mau1,tu2,mau2;
        tu1=input.nextInt();
        mau1=input.nextInt();
        tu2=input.nextInt();
        mau2=input.nextInt();
        PhanSo s1 = new PhanSo(tu1, mau1);
        PhanSo s2 = new PhanSo(tu2, mau2);
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