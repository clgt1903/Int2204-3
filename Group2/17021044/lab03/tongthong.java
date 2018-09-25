
import javax.print.DocFlavor;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class tongthong {
    private String  name, tenQuocGia, mauDa;
    private int tuoi, namNhiemKi;

    public tongthong(String name, String tenQuocGia, String mauDa, int tuoi, int namNhiemKi) {
        this.name = name;
        this.tenQuocGia = tenQuocGia;
        this.mauDa = mauDa;
        this.tuoi = tuoi;
        this.namNhiemKi = namNhiemKi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTenQuocGia() {
        return tenQuocGia;
    }

    public void setTenQuocGia(String tenQuocGia) {
        this.tenQuocGia = tenQuocGia;
    }

    public String getMauDa() {
        return mauDa;
    }

    public void setMauDa(String mauDa) {
        this.mauDa = mauDa;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public int getNamNhiemKi() {
        return namNhiemKi;
    }

    public void setNamNhiemKi(int namNhiemKi) {
        this.namNhiemKi = namNhiemKi;
    }
    
}
