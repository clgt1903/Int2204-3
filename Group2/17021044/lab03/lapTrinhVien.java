/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class lapTrinhVien {
    private String ten, queQuan, tenNgonNgu;
    private int tuoi, namKinhNghiem;

    public lapTrinhVien(String ten, String queQuan, String tenNgonNgu, int tuoi, int namKinhNghiem) {
        this.ten = ten;
        this.queQuan = queQuan;
        this.tenNgonNgu = tenNgonNgu;
        this.tuoi = tuoi;
        this.namKinhNghiem = namKinhNghiem;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public String getTenNgonNgu() {
        return tenNgonNgu;
    }

    public void setTenNgonNgu(String tenNgonNgu) {
        this.tenNgonNgu = tenNgonNgu;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public int getNamKinhNghiem() {
        return namKinhNghiem;
    }

    public void setNamKinhNghiem(int namKinhNghiem) {
        this.namKinhNghiem = namKinhNghiem;
    }
    
}
