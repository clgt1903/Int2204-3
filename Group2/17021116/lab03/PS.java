/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ps;

/**
 *
 * @author 123456789
 */
public class PS {
    private int tuSo;
    private int mauSo;
    public PS(){};
    public PS(int tuSo, int mauSo){
        
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    public void setMauSo(int mauSo){
        this.mauSo = mauSo;
    }
    public int getMauSo(){
        return mauSo;
    }
    public void setTuSo(int tuSo){
        this.tuSo = tuSo;
    }
    public int getTuSo(){
        return tuSo;
    }
    
    
    public void congPS(PS a,PS b){
        int tu = a.tuSo*b.mauSo+a.mauSo*b.tuSo;
        int mau = a.mauSo*b.mauSo;
        PS tong = new PS(tu,mau);
        System.out.println(tong.tuSo+"/"+tong.mauSo);
    }
    public void truPS(PS a,PS b){
        int tu = a.tuSo*b.mauSo-a.mauSo*b.tuSo;
        int mau = a.mauSo*b.mauSo;
        PS hieu = new PS(tu,mau);
        System.out.println(hieu.tuSo+"/"+hieu.mauSo);
    }
    public void nhanPS(PS a,PS b){
        int tu = a.tuSo*b.tuSo;
        int mau = a.mauSo*b.mauSo;
        PS tich = new PS(tu,mau);
        System.out.println(tich.tuSo+"/"+tich.mauSo);
    }
    public void chiaPS(PS a, PS b){
        int tu = a.tuSo*b.mauSo;
        int mau = a.mauSo*b.tuSo;
        PS thuong = new PS(tu,mau);
        System.out.println(thuong.tuSo+"/"+thuong.mauSo);
    }
    public boolean equals(Object obj){
        if(obj == null) return false;
        if(!(obj instanceof PS)) return false;
        PS other =(PS) obj;
        if((this.tuSo/other.tuSo)!=(this.mauSo/other.mauSo)) return false;
        
        return true;
        
    }
    public static void main(String ags[]){
        PS pso = new PS();
        PS ps1 = new PS(1,5);
        PS ps2 = new PS(2,5);
        pso.congPS(ps1,ps2);
        pso.truPS(ps1,ps2);
        pso.nhanPS(ps1, ps2);
        pso.chiaPS(ps1, ps2);
        System.out.println(ps1.equals(ps2));
    }
}


