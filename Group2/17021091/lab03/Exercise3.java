package exercise3;

/**
 *
 * @author Genius
 */
class monHoc{
    private String tenmon, mamon;
    private int nTinchi;
    private double diem;

    public String getTenmon() {
        return tenmon;
    }

    public void setTenmon(String tenmon) {
        this.tenmon = tenmon;
    }

    public String getMamon() {
        return mamon;
    }

    public void setMamon(String mamon) {
        this.mamon = mamon;
    }

    public monHoc(String tenmon, String mamon, int nTinchi, double diem) {
        this.tenmon = tenmon;
        this.mamon = mamon;
        this.nTinchi = nTinchi;
        this.diem = diem;
    }

    public int getnTinchi() {
        return nTinchi;
    }

    public void setnTinchi(int nTinchi) {
        this.nTinchi = nTinchi;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }
    
}
class sinhvien{
    private String tensv, mssv;
    private boolean gioitinh;//true la con trai false la con gai
    private int tuoi;

    public sinhvien(String tensv, String mssv, boolean gioitinh, int tuoi) {
        this.tensv = tensv;
        this.mssv = mssv;
        this.gioitinh = gioitinh;
        this.tuoi = tuoi;
    }

    public String getTensv() {
        return tensv;
    }

    public void setTensv(String tensv) {
        this.tensv = tensv;
    }

    public String getMssv() {
        return mssv;
    }

    public void setMssv(String mssv) {
        this.mssv = mssv;
    }

    public boolean isGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(boolean gioitinh) {
        this.gioitinh = gioitinh;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
}
class chieu{
    private double chieudai, chieurong;
    private String loaichieu;

    public chieu(double chieudai, double chieurong, String loaichieu) {
        this.chieudai = chieudai;
        this.chieurong = chieurong;
        this.loaichieu = loaichieu;
    }

    public double getChieudai() {
        return chieudai;
    }

    public void setChieudai(double chieudai) {
        this.chieudai = chieudai;
    }

    public double getChieurong() {
        return chieurong;
    }

    public void setChieurong(double chieurong) {
        this.chieurong = chieurong;
    }

    public String getLoaichieu() {
        return loaichieu;
    }

    public void setLoaichieu(String loaichieu) {
        this.loaichieu = loaichieu;
    }
    
}
class tongthong{
    private String ten, quocgia;
    private int tuoi;
    private boolean gioitinh;

    public tongthong(String ten, String quocgia, int tuoi, boolean gioitinh) {
        this.ten = ten;
        this.quocgia = quocgia;
        this.tuoi = tuoi;
        this.gioitinh = gioitinh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getQuocgia() {
        return quocgia;
    }

    public void setQuocgia(String quocgia) {
        this.quocgia = quocgia;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public boolean isGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(boolean gioitinh) {
        this.gioitinh = gioitinh;
    }
    
}
class dienthoai{
    private String ten, hedieuhanh;
    private int ram, pin, rom, tocdoCPU;

    public dienthoai(String ten, String hedieuhanh, int ram, int pin, int rom, int tocdoCPU) {
        this.ten = ten;
        this.hedieuhanh = hedieuhanh;
        this.ram = ram;
        this.pin = pin;
        this.rom = rom;
        this.tocdoCPU = tocdoCPU;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getHedieuhanh() {
        return hedieuhanh;
    }

    public void setHedieuhanh(String hedieuhanh) {
        this.hedieuhanh = hedieuhanh;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public int getRom() {
        return rom;
    }

    public void setRom(int rom) {
        this.rom = rom;
    }

    public int getTocdoCPU() {
        return tocdoCPU;
    }

    public void setTocdoCPU(int tocdoCPU) {
        this.tocdoCPU = tocdoCPU;
    }
   
}
class giangvien{
    private String name;
    private int tuoi;
    private boolean gioitinh;
    private monHoc m;

    public giangvien(String name, int tuoi, boolean gioitinh, monHoc m) {
        this.name = name;
        this.tuoi = tuoi;
        this.gioitinh = gioitinh;
        this.m = m;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public boolean isGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(boolean gioitinh) {
        this.gioitinh = gioitinh;
    }

    public monHoc getM() {
        return m;
    }

    public void setM(monHoc m) {
        this.m = m;
    }
}
class lophoc{
    private sinhvien loptruong, loppho, tenlop;
    private int sosinhvien;

    public lophoc(sinhvien loptruong, sinhvien loppho, sinhvien tenlop, int sosinhvien) {
        this.loptruong = loptruong;
        this.loppho = loppho;
        this.tenlop = tenlop;
        this.sosinhvien = sosinhvien;
    }

    public sinhvien getLoptruong() {
        return loptruong;
    }

    public void setLoptruong(sinhvien loptruong) {
        this.loptruong = loptruong;
    }

    public sinhvien getLoppho() {
        return loppho;
    }

    public void setLoppho(sinhvien loppho) {
        this.loppho = loppho;
    }

    public sinhvien getTenlop() {
        return tenlop;
    }

    public void setTenlop(sinhvien tenlop) {
        this.tenlop = tenlop;
    }

    public int getSosinhvien() {
        return sosinhvien;
    }

    public void setSosinhvien(int sosinhvien) {
        this.sosinhvien = sosinhvien;
    }   
}
class quan{
    private int size;
    String chatlieu, mausac;

    public quan(int size, String chatlieu, String mausac) {
        this.size = size;
        this.chatlieu = chatlieu;
        this.mausac = mausac;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getChatlieu() {
        return chatlieu;
    }

    public void setChatlieu(String chatlieu) {
        this.chatlieu = chatlieu;
    }

    public String getMausac() {
        return mausac;
    }

    public void setMausac(String mausac) {
        this.mausac = mausac;
    }
}
class chudog{
    String ten, maulong, quocgia, tiengsua;
    int tuoi;

    public chudog(String ten, String maulong, String quocgia, String tiengsua, int tuoi) {
        this.ten = ten;
        this.maulong = maulong;
        this.quocgia = quocgia;
        this.tiengsua = tiengsua;
        this.tuoi = tuoi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMaulong() {
        return maulong;
    }

    public void setMaulong(String maulong) {
        this.maulong = maulong;
    }

    public String getQuocgia() {
        return quocgia;
    }

    public void setQuocgia(String quocgia) {
        this.quocgia = quocgia;
    }

    public String getTiengsua() {
        return tiengsua;
    }

    public void setTiengsua(String tiengsua) {
        this.tiengsua = tiengsua;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
}
class conmeo{
    private String ten, maulong, giongmeo;
    private double cannang, chieudai;

    public conmeo(String ten, String maulong, String giongmeo, double cannang, double chieudai) {
        this.ten = ten;
        this.maulong = maulong;
        this.giongmeo = giongmeo;
        this.cannang = cannang;
        this.chieudai = chieudai;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMaulong() {
        return maulong;
    }

    public void setMaulong(String maulong) {
        this.maulong = maulong;
    }

    public String getGiongmeo() {
        return giongmeo;
    }

    public void setGiongmeo(String giongmeo) {
        this.giongmeo = giongmeo;
    }

    public double getCannang() {
        return cannang;
    }

    public void setCannang(double cannang) {
        this.cannang = cannang;
    }

    public double getChieudai() {
        return chieudai;
    }

    public void setChieudai(double chieudai) {
        this.chieudai = chieudai;
    }
    
}
public class Exercise3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        monHoc t = new monHoc("ctdlgt", "INT2204 3", 3, 5.5);
        sinhvien n = new sinhvien("Nguyen Van Truong", "17021091", true, 19);
    }
    
}
