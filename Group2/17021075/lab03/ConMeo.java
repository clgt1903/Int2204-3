package ConMeo;

public class ConMeo
{
    private String maulong; // màu lông
    private String loaimeo; // loại mèo
    public void setMaulong(String maulong)
    {
        this.maulong=maulong;
    }
    public String getmaulong()
    {
        return maulong;
    }
    public void setloaimeo(String loaimeo)
    {
        this.loaimeo=loaimeo;
    }
    public String getloaimeo()
    {
        return loaimeo;
    }
}
class CaiBan
{
    private String kichthuoc;//dài*rộng*cao
    private String mau; // màu cái bàn
    public void setkichthuoc(String kichthuoc)
    {
        this.kichthuoc=kichthuoc;
    }
    public String getkichthuoc()
    {
        return kichthuoc;
    }
    public void setmau(String mau)
    {
        this.mau=mau;
    }
    public String getmau()
    {
        return mau;
    }
}
class GiaoVien //giáo viên
{
    private String monday;//môn dạy
    private String gioitinh; // giới tính
    public void setmonday(String monday)
    {
        this.monday=monday;
    }
    public String getmonday()
    {
        return monday;
    }
    public void setgioitinh(String gioitinh)
    {
        this.gioitinh=gioitinh;
    }
    public String getgioiinh()
    {
        return gioitinh;
    }
}
class CaiAo //Cái áo
{
    private String mau; //màu
    private String chatlieu; //chất liệu
    public void setmau(String mau)
    {
        this.mau=mau;
    }
    public String getmau()
    {
        return mau;
    }
    public void setchatlieu(String chatlieu)
    {
        this.chatlieu=chatlieu;
    }
    public String getchatlieu()
    {
        return chatlieu;
    }
}
class SinhVien //Sinh viên
{
    private String MSSV; 
    private String hoten; 
    public void setMSSV(String MSSV)
    {
        this.MSSV=MSSV;
    }
    public String getMSSV()
    {
        return MSSV;
    }
    public void sethoten(String hoten)
    {
        this.hoten=hoten;
    }
    public String gethoten()
    {
        return hoten;
    }
}
class DongHo //Cái đồng hồ
{
    private String nhanhieu; //nhãn hiệu
    private double giatien;
    public void setnhanhieu(String nhanhieu)
    {
        this.nhanhieu=nhanhieu;
    }
    public String getnhanhieu()
    {
        return nhanhieu;
    }
    public void setgiatien(double giatien)
    {
        this.giatien=giatien;
    }
    public double getgiatien()
    {
        return giatien;
    }
}
class XeDap //Cái xe đạp
{
    private String mausac; //màu sắc
    private double giatien;
    public void setmausac(String mausac)
    {
        this.mausac=mausac;
    }
    public String getmausac()
    {
        return mausac;
    }
    public void setgiatien(double giatien)
    {
        this.giatien=giatien;
    }
    public double getgiatien()
    {
        return giatien;
    }
}
class NgoiNha //Ngôi nhà
{
    private String mausac; //màu sắc
    private String kichthuoc; //dài*rộng*cao
    public void setmausac(String mausac)
    {
        this.mausac=mausac;
    }
    public String getmausac()
    {
        return mausac;
    }
    public void setkichthuoc(String kichthuoc)
    {
        this.kichthuoc=kichthuoc;
    }
    public String getkichthuoc()
    {
        return kichthuoc;
    }
}
class TongThong //Tổng thống
{
    private String gioitinh; //giới tính
    private int tuoi; //tuổi
    public void setgioitinh(String gioitinh)
    {
        this.gioitinh=gioitinh;
    }
    public String getgioitinh()
    {
        return gioitinh;
    }
    public void settuoi(int tuoi)
    {
        this.tuoi=tuoi;
    }
    public int gettuoi()
    {
        return tuoi;
    }
}
class TieuThuyet//Tiểu thuyết
{
    private String theloai; //thể loại
    private String tacgia; //tác giả
    public void settheloai(String theloai)
    {
        this.theloai=theloai;
    }
    public String gettheloai()
    {
        return theloai;
    }
    public void settacgia(String tacgia)
    {
        this.tacgia=tacgia;
    }
    public String gettacgia()
    {
        return tacgia;
    }
public static void main(String args[])
{
	System.out.println("Trang");
}
}