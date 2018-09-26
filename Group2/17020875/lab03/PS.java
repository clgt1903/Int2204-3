package testchuongtrinh;

public class PS {
    private int tu;
    private int mau;
    /*ham set gia tri*/
    public void setTu(int tu) {
        this.tu = tu;
    }

    public void setMau(int mau) {
        this.mau = mau;
    }
    /* ham get gia tri*/
    public int getTu() {
        return tu;
    }

    public int getMau() {
        return mau;
    }

    /* constructor*/
    public PS(int tu, int mau)
    {
        this.tu = tu;
        this.mau = mau;
    }
    /*phuong thuc*/
    public int ucln(int a, int b)
    {
        if(b == 0)
            return a;
        return ucln(b, a%b);
    }
    public  void rutGonPS(PS s) {
        int max = 0;
        //check
        if (s.tu < 0 && s.mau < 0) {
            s.tu = Math.abs(s.tu);
            s.mau = Math.abs(s.mau);
        }
        if (s.mau < 0) {
            s.tu = -s.tu;
            s.mau = Math.abs(s.mau);
        }
        // rut gon
        int d = ucln(s.tu, s.mau);
        s.tu = s.tu / d;
        s.mau = s.mau / d;

        if(s.tu == 0)
        {
            System.out.println("0");
        }
        else if (Math.abs(s.tu) == Math.abs(s.mau)) {
            System.out.println(s.tu);
        } else {
            System.out.println(s.tu + "/" + s.mau);
        }
    }

    public  void congPS(PS s1, PS s2)
    {
        PS s = new PS(0, 0);

        s.tu = s1.tu * s2.mau + s2.tu * s1.mau;
        s.mau = s1.mau * s2.mau;

        s.rutGonPS(s);
    }
    public  void truPS(PS s1, PS s2)
    {
        PS s = new PS(0, 0);

        s.tu = s1.tu * s2.mau - s2.tu * s1.mau;
        s.mau = s1.mau * s2.mau;

        s.rutGonPS(s);

    }
    public  PS nhanPS(PS s1, PS s2)
    {
        PS s = new PS(0, 0);

        s.tu = s1.tu * s2.tu;
        s.mau = s1.mau * s2.mau;

        s.rutGonPS(s);
        return s;
    }
    public PS chiaPS(PS s1, PS s2)
    {

        PS s = new PS(0, 0);

        s.tu = s1.tu * s2.mau;
        s.mau = s1.mau * s2.tu;

        s.rutGonPS(s);
        return s;
    }
    public boolean equals(Object obj)
    {
        // kiem tra xem obj co thuoc lop PS hay k
        if(obj instanceof PS){

            PS abc = (PS)obj;
            // ktra
            int so1 = this.tu * abc.getMau();
            int so2 = this.mau * abc.getTu();

            return so1==so2;
        }
        else{
            return false;
        }
    }

    public static void main(String args[])
    {
        PS s1 = new PS(6, -5);
        PS s2 = new PS(-6, 5);

        if(s1.mau < 0)
        {
            s1.tu = -s1.tu;
            s1.mau = Math.abs(s1.mau);
        }
        if(s2.mau < 0)
        {
            s2.tu = -s2.tu;
            s2.mau =  Math.abs(s2.mau);
        }
        PS s  = new PS(0, 0);

        System.out.print("cong: ");
        s.congPS(s1, s2);
        System.out.print("tru: ");
        s.truPS(s1, s2);
        System.out.print("nhan: ");
        s.nhanPS(s1, s2);
        System.out.print("chia: ");
        s.chiaPS(s1, s2);

        System.out.println("So sanh hai phan so: " + s1.equals(s2));
    }
}
