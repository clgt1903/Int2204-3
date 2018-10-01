

public class PS{
    private int tu;
    private int mau;
    public static void main(String[] args){
        PS test1 = new PS(6,-5);
        PS test2 = new PS(-6,5);
        if(test1.equals(test2)){
            System.out.println("==");
        }
        else{
            System.out.println("!=");
        }
        test1.printTest();
        test1.chia(test2);
        test1.printTest();
        

    }
    public PS(){
        this.tu=6;
        this.mau=7;
    }
    public PS(int tu, int mau){
        if(mau==0){
            System.out.println("Mau so khong hop le");
        }
        else{
            cau1 test = new cau1();
            int ucln = test.UCLN(tu, mau);
            this.setTu(tu/ucln);
            this.setMau(mau/ucln);
        }
        
    }
    public void printTest(){
        if(this.getMau()==0){
            System.out.println("Mau so khong hop le");
            return ;
        }
        if(this.getTu() % this.getMau() ==  0){
            System.out.println(this.getTu()/this.getMau());
        }
        else{
            System.out.println(this.getTu());
            System.out.println(this.getMau());
        }
    }
    public int getTu(){
        return this.tu;
    }
    public void setTu(int n){
        this.tu = n;
    }
    public int getMau(){
        return this.mau;
    }
    public void setMau(int n){
        this.mau = n;
    }

    public void cong(PS a){
        if(a.getMau()==0){
            System.out.println("Mau so khong hop le");
            return ;
        }
        int tu=0, mau=0, am=0;
        tu = a.getTu() * this.getMau() + a.getMau() * this.getTu();
        mau = a.getMau()*this.getMau();
        if(tu==0){
            System.out.println(tu);
            return ;
        }
        else{
            am = tu*mau;
        }
        if(tu<0){
            tu=-tu;
        }
        if(mau<0){
            mau=-mau;
        }
        cau1 test = new cau1();
        int ucln = test.UCLN(tu, mau);
        tu=tu/ucln;
        mau=mau/ucln;
        if(am<0){
            this.setTu(-tu);
        }
        else{
            this.setTu(tu);
        }
        this.setMau(mau);
        
    }

    public void tru(PS a){
        if(a.getMau()==0){
            System.out.println("Mau so khong hop le");
            return ;
        }
        int tu=0, mau=0, am=0;
        tu = -a.getTu() * this.getMau() + a.getMau() * this.getTu();
        mau = a.getMau()*this.getMau();
        if(tu==0){
            System.out.println(tu);
            return ;
        }
        else{
            am = tu*mau;
        }
        if(tu<0){
            tu=-tu;
        }
        if(mau<0){
            mau=-mau;
        }
        cau1 test = new cau1();
        int ucln = test.UCLN(tu, mau);
        tu=tu/ucln;
        mau=mau/ucln;
        if(am<0){
            this.setTu(-tu);
        }
        else{
            this.setTu(tu);
        }
        this.setMau(mau);
        
    }

    public void nhan(PS a){
        if(a.getMau()==0){
            System.out.println("Mau so khong hop le");
            return ;
        }
        int tu=0, mau=0, am=0;
        tu = this.getTu() * a.getTu();
        mau = a.getMau()*this.getMau();
        if(tu==0){
            System.out.println(tu);
            return ;
        }
        else{
            am = tu*mau;
        }
        if(tu<0){
            tu=-tu;
        }
        if(mau<0){
            mau=-mau;
        }
        cau1 test = new cau1();
        int ucln = test.UCLN(tu, mau);
        tu=tu/ucln;
        mau=mau/ucln;
        if(am<0){
            this.setTu(-tu);
        }
        else{
            this.setTu(tu);
        }
        this.setMau(mau); 
    }

    public void chia(PS a){
        if(a.getMau()==0 || a.getTu()==0){
            System.out.println("Mau so or Tu so khong hop le");
            return ;
        }
        int tu=0, mau=0, am=0;
        tu = this.getTu() * a.getMau();
        mau = a.getTu()*this.getMau();
        if(tu==0){
            System.out.println(tu);
            return ;
        }
        else{
            am = tu*mau;
        }
        if(tu<0){
            tu=-tu;
        }
        if(mau<0){
            mau=-mau;
        }
        cau1 test = new cau1();
        int ucln = test.UCLN(tu, mau);
        tu=tu/ucln;
        mau=mau/ucln;
        if(am<0){
            this.setTu(-tu);
        }
        else{
            this.setTu(tu);
        }
        this.setMau(mau); 
    }

    public boolean equals(Object a){
        if(a instanceof PS){
            PS other = (PS)a;
            other.printTest();
            int tu1 = other.getMau() * this.getTu();
            int tu2 =  other.getTu() * this.getMau();
            return tu1==tu2;
        }
        else{
            return false;
        }
    }
}