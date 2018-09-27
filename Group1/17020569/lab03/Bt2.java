package bt1;
import java.util.Scanner;
public class Bt2 {
    private int TS;
    private int MS;

    public void setTS (int n) {
        this.TS = n;
    }
    public int getTS () {
        return this.TS;
    }
    public void setMS(int m) {
        if (m == 0) {
            System.out.println("error");
            return ;
        }
        this.MS = m;
    }
    public int getMS() {
        return this.MS;
    }
    public void xuatra() {
        if (this.getMS()<0 ) {
            this.setTS(-this.getTS());
            this.setMS(-this.getMS());
        }
        if (this.getMS()== 1)
            System.out.println(this.getTS());
        else
        if (this.getTS() == 0 )
            System.out.println(this.getTS());
        else

            System.out.println(this.getTS() + " / "  + this.getMS());
    }
    public int UCN(int a, int b) {
        if (a<0) a = Math.abs(a);
        if (b < 0) b = Math.abs(b);
        if (a== 0) return b;
        else if (b == 0 ) return a;
        else {

            while (a!=b) {
                if (a > b) a = a - b;
                else b = b - a;
            }
            return a;
        }
    }
    public  Bt2 congPS(Bt2 ps1) {
        Bt2 ps = new Bt2();

        int ts = ps1.getTS() * this.getMS() + ps1.getMS() * this.getTS();
        int ms = ps1.getMS()*this.getMS();
        int temp = UCN(ts, ms);

        ps.setTS(ts/temp);
        ps.setMS(ms/temp);

        return ps;
    }

    public  Bt2 truPS( Bt2 ps2) {
        Bt2 ps = new Bt2();

        int ts = this.getTS() * ps2.getMS() - this.getMS() * ps2.getTS();
        int ms = this.getMS()*ps2.getMS();
        int temp = UCN(ts, ms);

        ps.setTS(ts/temp);
        ps.setMS(ms/temp);

        return ps;
    }
    public  Bt2 nhanPS(Bt2 ps1) {
        Bt2 ps = new Bt2();

        int ts = ps1.getTS() * this.getTS();
        int ms = ps1.getMS()*this.getMS();
        int temp = UCN(ts, ms);

        ps.setTS(ts/temp);
        ps.setMS(ms/temp);

        return ps;
    }
    public  Bt2 chiaPS( Bt2 ps2) {
        Bt2 ps = new Bt2();

        int ts = this.getTS() * ps2.getMS();
        int ms = this.getMS()*ps2.getTS();
        int temp = UCN(ts, ms);

        ps.setTS(ts/temp);
        ps.setMS(ms/temp);

        return ps;
    }
    public  boolean equals ( Object obj) {
        if(obj instanceof Bt2){
            Bt2 temp=(Bt2)obj;
            if ( this.getTS() * temp.getMS() - this.getMS() * temp.getTS() == 0) return true;
        }
        return false;
    }
    public static void main(String args[]) {
        Bt2 temp = new Bt2();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Bt2 ps1 = new Bt2();
        ps1.setTS(a);
        ps1.setMS(b);
        int c = sc.nextInt();
        int d = sc.nextInt();
        Bt2 ps2 = new Bt2();
        ps2.setTS(c);
        ps2.setMS(d);


        Bt2 ps0 = new Bt2();
        ps0= ps2.congPS(ps1);
        System.out.print("Tong: " );
        ps0.xuatra();
        System.out.println("");


        ps0= ps1. truPS(ps2);
        System.out.print("Hieu: " );
        ps0.xuatra();
        System.out.println("");


        ps0= ps1.nhanPS( ps2);
        System.out.print("Tich: " );
        ps0.xuatra();
        System.out.println("");

        if (ps2.getTS()== 0) {
            System.out.println("error");
        }
        else {
            ps0= ps1.chiaPS(ps1);
            System.out.print("Thuong: " );
            ps0.xuatra();
            System.out.println("");
        }

        if (ps1.equals (ps2) == true) {
            System.out.print("true" );
        }
        else
            System.out.print("false" );

    }
}