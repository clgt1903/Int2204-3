public class PS {
    private int tu;
    private int mau;

    public void set_PS(int tu, int mau){
        
        if ( mau == 0){
            System.out.println("PS bi loi");
        }
        this.tu = tu;
        this.mau = mau;
        rut_gon_PS();
        if(this.mau < 0){
            this.mau = -this.mau;
            this.tu = -this.tu;
        }
    }

    public void rut_gon_PS(){
        int tu = this.tu;
        if(tu < 0){
            tu = -tu;
        }
        int mau = this.mau;
        if(mau < 0){
            mau = -mau;
        }
        ucln ucln = new ucln();
        int x = ucln.get_ucln(tu, mau);  
        this.tu = this.tu/x;
        this.mau = this.mau/x;
    }

    public int get_tu(){
        return this.tu;
    }

    public int get_mau(){
        return this.mau;
    }

    public PS plus_PS(PS otherPs){
        PS plus = new PS();
        int tu = (otherPs.get_tu()*this.mau) + (this.tu*otherPs.get_mau());
        int mau = otherPs.get_mau()*this.mau;
        plus.set_PS(tu, mau);
        return plus;
    }

    public PS sub_PS(PS otherPs){
        PS sub = new PS();
        int tu = -(otherPs.get_tu()*this.mau) + (this.tu*otherPs.get_mau());
        int mau = otherPs.get_mau()*this.mau;
        sub.set_PS(tu, mau);
        return sub;
    }

    public PS multi_PS(PS otherPs) {
        PS multi = new PS();
        int tu = otherPs.get_tu()*this.tu;
        int mau =  otherPs.get_mau()*this.mau;
        multi.set_PS(tu, mau);
        return multi;
    }

    public PS divide_Ps(PS otherPs) {
        PS divide = new PS();
        
        int tu = otherPs.get_mau()*this.tu;
        int mau = otherPs.get_tu()*this.mau;
        divide.set_PS(tu, mau);
        return divide;
    }

    public boolean equals(Object object){
        if(object instanceof PS){
            PS otherPs = (PS)object;
            if (otherPs.get_mau() == this.mau && otherPs.get_tu() == this.tu) return true;
            else return false;
        } else return false;
    }

}