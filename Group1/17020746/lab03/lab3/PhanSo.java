package lab3;

public class PhanSo {
    public static void main(String[] args) {
        PS ps1 = new PS();
        PS ps2 = new PS();
        ps1.Add(5, 4);
        ps2.Add(10, 8);
        PhanSo check = new PhanSo();
        check.CongPS(ps1, ps2);
        check.TruPS(ps1, ps2);
        check.NhanPS(ps1, ps2);
        check.ChiaPS(ps1, ps2);
        System.out.println("So sánh 2 phân số: ");
        if (ps1.equals(ps2))
            System.out.println("2 phân số bằng nhau");
        else
            System.out.println("2 phân số khác nhau");
    }

    //Phương thức cộng 2 phân số
    public void CongPS(PS s1, PS s2) {
        PS check = new PS();
        int t, m, tu, mau;
        t = s1.getts() * s2.getms() + s1.getms() * s2.getts();
        m = s1.getms() * s2.getms();
        tu = t / check.UCLNN(t, m);
        mau = m / check.UCLNN(t, m);
        if (t == 0)
            System.out.println(s1.getts() + "/" + s1.getms() + " + " + s2.getts() + "/" + s2.getms() + " = " + t);
        else if (mau == 1)
            System.out.println(s1.getts() + "/" + s1.getms() + " + " + s2.getts() + "/" + s2.getms() + " = " + tu);
        else if (mau < 0 || tu < 0)
            System.out.println(s1.getts() + "/" + s1.getms() + " + " + s2.getts() + "/" + s2.getms() + " = " + Math.abs(tu) * -1 + "/" + Math.abs(mau));
        else
            System.out.println(s1.getts() + "/" + s1.getms() + " + " + s2.getts() + "/" + s2.getms() + " = " + tu + "/" + mau);
    }

    //Trừ 2 phân số
    public void TruPS(PS s1, PS s2) {
        int t, m, tu, mau;
        PS check = new PS();
        t = s1.getts() * s2.getms() - s1.getms() * s2.getts();
        m = s1.getms() * s2.getms();
        tu = t / check.UCLNN(t, m);
        mau = m / check.UCLNN(t, m);
        if (t == 0)
            System.out.println(s1.getts() + "/" + s1.getms() + " - " + s2.getts() + "/" + s2.getms() + " = " + t);
        else if (mau == 1)
            System.out.println(s1.getts() + "/" + s1.getms() + " - " + s2.getts() + "/" + s2.getms() + " = " + tu);
        else if (mau < 0 || tu < 0)
            System.out.println(s1.getts() + "/" + s1.getms() + " - " + s2.getts() + "/" + s2.getms() + " = " + Math.abs(tu) * -1 + "/" + Math.abs(mau));
        else
            System.out.println(s1.getts() + "/" + s1.getms() + " - " + s2.getts() + "/" + s2.getms() + " = " + tu + "/" + mau);
    }

    //Nhân 2 phân số
    public void NhanPS(PS s1, PS s2) {
        int t, m, tu, mau;
        PS check = new PS();
        t = s1.getts() * s2.getts();
        m = s1.getms() * s2.getms();
        tu = t / check.UCLNN(t, m);
        mau = m / check.UCLNN(t, m);
        if (t == 0)
            System.out.println(s1.getts() + "/" + s1.getms() + " x " + s2.getts() + "/" + s2.getms() + " = " + t);
        else if (mau == 1)
            System.out.println(s1.getts() + "/" + s1.getms() + " x " + s2.getts() + "/" + s2.getms() + " = " + tu);
        else if (mau < 0 || tu < 0)
            System.out.println(s1.getts() + "/" + s1.getms() + " x " + s2.getts() + "/" + s2.getms() + " = " + Math.abs(tu) * -1 + "/" + Math.abs(mau));
        else
            System.out.println(s1.getts() + "/" + s1.getms() + " x " + s2.getts() + "/" + s2.getms() + " = " + tu + "/" + mau);
    }

    //Chia 2 phân số
    public void ChiaPS(PS s1, PS s2) {
        int t, m, tu, mau;
        PS check = new PS();
        t = s1.getts() * s2.getms();
        m = s1.getms() * s2.getts();
        tu = t / check.UCLNN(t, m);
        mau = m / check.UCLNN(t, m);
        if (t == 0)
            System.out.println(s1.getts() + "/" + s1.getms() + " : " + s2.getts() + "/" + s2.getms() + " = " + t);
        else if (mau == 1)
            System.out.println(s1.getts() + "/" + s1.getms() + " : " + s2.getts() + "/" + s2.getms() + " = " + tu);
        else if (mau < 0 || tu < 0)
            System.out.println(s1.getts() + "/" + s1.getms() + " : " + s2.getts() + "/" + s2.getms() + " = " + Math.abs(tu) * -1 + "/" + Math.abs(mau));
        else
            System.out.println(s1.getts() + "/" + s1.getms() + " : " + s2.getts() + "/" + s2.getms() + " = " + tu + "/" + mau);
    }
}


