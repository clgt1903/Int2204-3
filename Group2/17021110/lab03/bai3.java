/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

/**
 *
 * @author Dell
 */


 class Student {
	
    // TODO: khai báo các thu?c tính cho Student
	private
	String name;
	String id;
	String group;
	String emai;
    // TODO: khai báo các phuong th?c getter, setter cho Student
	public String getName(){
		return name;
	}
	public String getID(){
		return id;
	}
	public String getGroup(){
		return group;
	}
	public String getEmai(){
		return emai;
	}
	public void setName(String n){
		name = n;
	}
	public void setID(String n){
		id = n;
	}
	public void setGroup(String n){
		group = n;
	}
	public void setEmai(String n){
		emai = n;
	}
  
        
}

  class tongthong {
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
 class quyensach {
    private String name, loaiSach, soTrang;

    public quyensach(String name, String loaiSach, String soTrang) {
        this.name = name;
        this.loaiSach = loaiSach;
        this.soTrang = soTrang;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLoaiSach() {
        return loaiSach;
    }

    public void setLoaiSach(String loaiSach) {
        this.loaiSach = loaiSach;
    }

    public String getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(String soTrang) {
        this.soTrang = soTrang;
    }
    
}
    class cat
   {
       private String mau;
       private String ten;
       private String gioitinh;
       public String getMau()
       {
           return mau;
           
       }
       public void setMau(String mau)
       {
           this.mau=mau;
           
       }
         public String getTen()
       {
           return ten;
           
       }
       public void setTen(String ten)
       {
           this.ten=ten;
           
       }
         public String getGioitinh()
       {
           return gioitinh;
           
       }
       public void setGioitinh(String gioitinh)
       {
           this.gioitinh=gioitinh;
           
       }
   }
    class bird
   {
       private String mau;
       private String ten;
       private String gioitinh;
       public String getMau()
       {
           return mau;
           
       }
       public void setMau(String mau)
       {
           this.mau=mau;
           
       }
         public String getTen()
       {
           return ten;
           
       }
       public void setTen(String ten)
       {
           this.ten=ten;
           
       }
         public String getGioitinh()
       {
           return gioitinh;
           
       }
       public void setGioitinh(String gioitinh)
       {
           this.gioitinh=gioitinh;
           
       }
   }
  class oto {
    private String tenXe, soLuong, giaXe, namSanXuat;

    public oto(String tenXe, String soLuong, String giaXe, String namSanXuat) {
        this.tenXe = tenXe;
        this.soLuong = soLuong;
        this.giaXe = giaXe;
        this.namSanXuat = namSanXuat;
    }

    public String getTenXe() {
        return tenXe;
    }

    public void setTenXe(String tenXe) {
        this.tenXe = tenXe;
    }

    public String getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(String soLuong) {
        this.soLuong = soLuong;
    }

    public String getGiaXe() {
        return giaXe;
    }

    public void setGiaXe(String giaXe) {
        this.giaXe = giaXe;
    }

    public String getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(String namSanXuat) {
        this.namSanXuat = namSanXuat;
    }
    
}
class xemay {
    private String tenXe, namSanXuat, hangxeString;

    public xemay(String tenXe, String namSanXuat, String hangxeString) {
        this.tenXe = tenXe;
        this.namSanXuat = namSanXuat;
        this.hangxeString = hangxeString;
    }

    public String getTenXe() {
        return tenXe;
    }

    public void setTenXe(String tenXe) {
        this.tenXe = tenXe;
    }

    public String getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(String namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public String getHangxeString() {
        return hangxeString;
    }

    public void setHangxeString(String hangxeString) {
        this.hangxeString = hangxeString;
    }
    
}
         class monkey
   {
       private String mau;
       private String ten;
       private String gioitinh;
       public String getMau()
       {
           return mau;
           
       }
       public void setMau(String mau)
       {
           this.mau=mau;
           
       }
         public String getTen()
       {
           return ten;
           
       }
       public void setTen(String ten)
       {
           this.ten=ten;
           
       }
         public String getGioitinh()
       {
           return gioitinh;
           
       }
       public void setGioitinh(String gioitinh)
       {
           this.gioitinh=gioitinh;
           
       }
   }
               class snake
   {
       private String mau;
       private String ten;
       private String gioitinh;
       public String getMau()
       {
           return mau;
           
       }
       public void setMau(String mau)
       {
           this.mau=mau;
           
       }
         public String getTen()
       {
           return ten;
           
       }
       public void setTen(String ten)
       {
           this.ten=ten;
           
       }
         public String getGioitinh()
       {
           return gioitinh;
           
       }
       public void setGioitinh(String gioitinh)
       {
           this.gioitinh=gioitinh;
           
       }
   }
public class Bai3 {

 
    public static void main(String[] args) {
        cat d= new cat();
        d.setTen("tran tuan");
        d.setGioitinh("duc");
        d.setMau("den");
        
        System.out.println(d.getTen());
        
    }
    
}