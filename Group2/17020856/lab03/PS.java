import java.util.Scanner;
public class PS {
    private int ts, ms;
    public PS(int ts, int  ms){
        this.ts = ts;
        this.ms = ms;
    }
    public int getTs(){
        return ts;
    }
    public void setTs(int ts){
        this.ts = ts;
    }
    public int getMs(){
        return ms;
    }
    public void setMs(int ms){
        this.ms = ms;
    }
    public int ucln(int a, int b){
        if (a == b)
            return a;
        else if (a > b)
            return ucln(a - b, b);
        else
            return ucln(a, b - a);
    }
    public void toiGianPS(){
        int i = ucln(Math.abs(this.getTs()), Math.abs(this.getMs()));
        this.setTs(this.getTs() / i);
        this.setMs(this.getMs() / i);
    }
    public void congPS(PS ps){
        int tu = this.getTs() * ps.getMs() + this.getMs() * ps.getTs();
        int mau = this.getMs() * ps.getMs();
        PS tongPS = new PS(tu, mau);
        tongPS.toiGianPS();
        if(mau < 0){
            System.out.println("Tong 2 phan so: " + tongPS.ts + "/" + tongPS.ms*(-1));
        }
        else
            System.out.println("Tong 2 phan so: " + tongPS.ts + "/" + tongPS.ms);
    }
    public  void truPS(PS ps){
        int tu = this.getTs() * ps.getMs() - this.getMs() * ps.getTs();
        int mau = this.getMs() * ps.getMs();
        PS hieuPS = new PS(tu, mau);
        if ( tu == 0)
            System.out.println("Hieu 2 phan so: " + 0);
        else {
            hieuPS.toiGianPS();
            System.out.println("Hieu 2 phan so: " + hieuPS.ts + "/" + hieuPS.ms);
        }
    }
    // tinh tich 2 phan so
    public void nhanPS (PS ps){
        int tu = this.getTs() * ps.getTs();
        int mau = this.getMs() * ps.getMs();
        PS tichPS = new PS(tu, mau);
        tichPS.toiGianPS();
        if ( tu == 0)
            System.out.println("Tich 2 phan so: " + 0);
        else if (tu < 0 && mau < 0) {
            System.out.println("Tich 2 phan so: " + tichPS.ts*(-1) + "/" + tichPS.ms*(-1));
        }
        else
            System.out.println("Tich 2 phan so: " + tichPS.ts + "/" + tichPS.ms);
    }
    // tinh thuong 2 phan so
    public void chiaPS (PS ps){
        int tu = this.getTs() * ps.getMs();
        int mau = this.getMs() * ps.getTs();
        PS thuongPS = new PS(tu, mau);

        thuongPS.toiGianPS();
        System.out.println("Thuong 2 phan so: " + thuongPS.ts + "/" + thuongPS.ms);
    }
    public  boolean equals(Object obj){
        if(obj instanceof PS) {
            PS ps = (PS)obj;
            if(this.getTs()*ps.getMs()== this.getMs()*ps.getTs()){
                return true;
            }
            else {
                return false;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t1, m1, t2, m2;
        t1 = scanner.nextInt();
        m1 = scanner.nextInt();
        t2 = scanner.nextInt();
        m2 = scanner.nextInt();
        PS ps1 = new PS(t1, m1);
        PS ps2 = new PS(t2, m2);
        ps1.congPS(ps2);
        ps1.truPS(ps2);
        ps1.nhanPS(ps2);
        ps1.chiaPS(ps2);
        System.out.println(ps1.equals(ps2));

    }
}
