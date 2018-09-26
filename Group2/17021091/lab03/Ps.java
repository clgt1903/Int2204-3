public class Ps {

    private int ts, ms;
    public Ps(){
        this.ts = 1;
        this.ms = 1;
    }
    public void compact(){//ham rut gon phan so
        Project1 phu = new Project1();
        int b = phu.ucln(ts, ms);
        ts /= b;
        ms /= b;
    }
    public Ps(int t, int m){//ham khoi tao phan so voi tu so la t va mau so la m
        this.ts = t;
        this.ms = m;
    }
    public int getts(){//tra ve tu so
        return ts;
    }
    public int getms(){// tra ve mau so
        return ms;
    }
    public void setts(int ts){
        this.ts = ts;
    }
    public void setms(int ms){
        this.ms = ms;
    }
    public Ps add(Ps ps1){//ham cong hai phan so
        Ps ps2 = new Ps(ts*ps1.getms() + ms*ps1.getts(), ms*ps1.getms());
        ps2.compact();
        return ps2;
    }
    
    public Ps subtract(Ps ps1){//ham tru hai phan so
        Ps ps2 = new Ps(ts*ps1.getms() - ms*ps1.getts(), ms*ps1.getms());
        ps2.compact();
        return ps2;
    }
    
    public Ps product(Ps ps1){//ham nhan hai phan so
        Ps ps2 = new Ps(ts*ps1.getts(), ms*ps1.getms());
        ps2.compact();
        return ps2;
    }
    
    public Ps division(Ps ps1){//ham chia hai phan so
        Ps ps2 = new Ps(ts*ps1.getms(), ms*ps1.getts());
        ps2.compact();
        return ps2;
    }
    public boolean equals(Object obj){//so sanh hai phan so
        if(obj instanceof Ps){
            this.compact();
            Ps ps1 = (Ps) obj;
            ps1.compact();
        return (ts == ps1.getts()
                && ms == ps1.getms());
        }
        else
            return false;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Ps ps1 = new Ps(12, 18);
        Ps ps2 = new Ps(14, 15);
        Ps ps3 = ps1.add(ps2);
        System.out.printf("%d / %d\n", ps3.getts(), ps3.getms());
        ps3 = ps1.subtract(ps2);
        System.out.printf("%d / %d\n", ps3.getts(), ps3.getms());
        ps3 = ps1.product(ps2);
        System.out.printf("%d / %d\n", ps3.getts(), ps3.getms());
        ps3 = ps1.division(ps2);
        System.out.printf("%d / %d\n", ps3.getts(), ps3.getms());
        Ps ps4 = new Ps(12, -15);
        Ps ps5 = new Ps(-12, 15);
        System.out.println(ps4.equals(ps5));
    }
    
}
