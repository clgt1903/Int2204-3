

public class Ps {

    private int ts, ms;
    public Ps(){
        this.ts = 1;
        this.ms = 1;
    }
    public Ps(int t, int m){
        int a = t, b = m;
        while(a != 0){
            int d = a;
            a = b%a;
            b = d;
        }
        this.ts = t/b;
        this.ms = m/b;
    }
    public int getts(){
        return ts;
    }
    public int getms(){
        return ms;
    }
    public Ps add(Ps ps1){
        Ps ps2 = new Ps(ts*ps1.getms() + ms*ps1.getts(), ms*ps1.getms());
        return ps2;
    }
    
    public Ps subtract(Ps ps1){
        Ps ps2 = new Ps(ts*ps1.getms() - ms*ps1.getts(), ms*ps1.getms());
        return ps2;
    }
    
    public Ps product(Ps ps1){
        Ps ps2 = new Ps(ts*ps1.getts(), ms*ps1.getms());
        return ps2;
    }
    
    public Ps division(Ps ps1){
        Ps ps2 = new Ps(ts*ps1.getms(), ms*ps1.getts());
        return ps2;
    }
    public boolean equals(Ps obj){
        Ps ps1 = new Ps(ts, ms);
        Ps ps2 = new Ps(obj.getts(), obj.getms());
        return (ps1.getts() == ps2.getts()
                && ps1.getms() == ps2.getms());
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Ps ps1 = new Ps(3, 7);
        Ps ps2 = new Ps(9, 11);
        Ps ps3 = ps1.add(ps2);
        System.out.printf("%d %d\n", ps3.getts(), ps3.getms());
        Ps ps5 = ps1.product(ps2);
        System.out.printf("%d %d\n", ps5.getts(), ps5.getms());
        Ps ps4 = ps1.subtract(ps2);
        System.out.printf("%d %d\n", ps4.getts(), ps4.getms());
        Ps ps7 = new Ps(-ps4.getts(), -ps4.getms());
        System.out.printf("%d %d\n", ps7.getts(), ps7.getms());
        Ps ps6 = ps1.division(ps2);
        System.out.printf("%d %d\n", ps6.getts(), ps6.getms());
    }
    
}