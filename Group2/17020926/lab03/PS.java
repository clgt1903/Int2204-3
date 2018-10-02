package lab03;

public class PS {
    private int ts,ms;

    public int getTs() {
        return ts;
    }

    public void setTs(int ts) {
        this.ts = ts;
    }

    public int getMs() {
        return ms;
    }

    public void setMs(int ms) {
        this.ms = ms;
    }
    //hien thi phan so
    public String getPs(){
        if(getTs() == 0)    return "0";
        return getTs() + "/" + getMs();
    }
    //phep cong hai phan so
    public PS sum(PS ps1, PS ps2){
        bai01 uc = new bai01();
        PS sum1 = new PS();
        int a,b;
        a = ps1.getTs()*ps2.getMs() + ps2.getTs()*ps1.getMs();
        b = ps1.getMs()*ps2.getMs();
        int k = uc.ucln(a,b);
        sum1.setTs(a/k);
        sum1.setMs(b/k);
        return sum1;
    }
    //phep tru hai phan so
    public PS subtract(PS ps1, PS ps2){
        bai01 uc = new bai01();
        PS sub1 = new PS();
        int a,b;
        a = ps1.getTs()*ps2.getMs() - ps2.getTs()*ps1.getMs();
        b = ps1.getMs()*ps2.getMs();
        if(a==0) return sub1;
        else{
            int k = uc.ucln(a,b);
            sub1.setTs(a/k);
            sub1.setMs(b/k);
            return sub1;
        }

    }
    //phep nhan hai phan so
    public PS multi(PS ps1, PS ps2){
        bai01 uc = new bai01();
        PS multi1 = new PS();
        int a,b;
        a = ps1.getTs()*ps2.getTs();
        b = ps1.getMs()*ps2.getMs();
        int k = uc.ucln(a,b);
        multi1.setTs(a/k);
        multi1.setMs(b/k);
        return multi1;
    }
    //phep chia hai phan so
    public PS div(PS ps1, PS ps2){
        bai01 uc = new bai01();
        PS div1 = new PS();
        int a,b;
        a = ps1.getTs()*ps2.getMs();
        b = ps1.getMs()*ps2.getTs();
        int k = uc.ucln(a,b);
        div1.setTs(a/k);
        div1.setMs(b/k);
        return div1;
    }
    //so sanh hai phan so
    public boolean equals(PS ps1) {
        if(ps1.getTs()*ms == ps1.getMs()*ts)    return true;
        else return false;
    }
}
