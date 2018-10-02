package lap3;
class Diem{
	private float Toan,Ly,Hoa;
	public void setToan(float num) {
		Toan=num;
	}
	public void setLy(float num) {
		Ly=num;
	}
	public void setHoa(float num) {
		Hoa=num;
	}
	public float getToan() {
		return Toan;
	}
	public float getLy() {
		return Ly;
	}
	public float getHoa() {
		return Hoa;
	}
	public void printInf() {
		System.out.println("Toan:"+Toan+" Ly:"+Ly+" Hoa:"+Hoa);
		
	}
}
class Hocsinh {
	private  String ten;
	private Diem diem;
	private float TB;
	public void setTen(String name) {
		ten=name;
	}
	public String getTen() {
		return ten;
	}
	public void setDiem(float a,float b,float c) {
		diem.setToan(a);
		diem.setLy(b);
		diem.setHoa(c);
	}
	public Diem getDiem() {
		return diem;
	}
	public void setTB() {
		TB=diem.getToan()+diem.getLy()+diem.getHoa();
		TB/=3;
	}
	
	public float getTB() {
		return TB;
	}
	public void printInf() {
		System.out.println(ten);
		diem.printInf();
		System.out.println("TB:"+TB);
	}
}
class Congnhan{
	private int SoCong,Ngaycong;
	private long luong;
	private String Ten;
	public Congnhan(String name,int socong,int ngaycong) {
		Ten=name;
		SoCong=socong;
		Ngaycong=ngaycong;
		
	}
	public void setTen(String name) {
		Ten=name;
	}
	public String getTen() {
		return Ten;
	}
	
	public void setSoCong(int num) {
		SoCong=num;
	}
	public int getSoCong() {
		return SoCong;
	}
	public void setNgaycong(int num) {
		Ngaycong=num;
	}
	public int getNgaycong() {
		return Ngaycong;
	}
	public void setLuong() {
		luong=SoCong*Ngaycong;
	}
	public long getLuong() {
		return luong;
	}
	
}
class Conmeo{
	private int age;
	private float weight;
	public void setAge(int num) {
		age=num;
	}
	public int getAge() {
		return age;
	}
	public void setWeight(float num) {
		weight=num;
	}
	public float getWeight() {
		return weight;
	}
	}
class ketoan{
	private int nhap,xuat;
	private long tiennhap,tienban;
	public int  getNhap() {
		return nhap;
	}
	public void setNhap(int num) {
		nhap=num;
	}
	public int  getXuat() {
		return xuat;
	}
	public void setXuat(int num) {
		xuat=num;
	}
	public long getTiennhap() {
		return tiennhap;
	}
	public void setTiennhap(long num) {
		tiennhap=num;
	}
	public long  getTienban() {
		return tienban;
	}
	public void setTienban(long num) {
		tienban=num;
	}
	
}
class baohiem{
	private long luong;
	private float phantram,tien;
	public void setLuong(long num) {
		luong=num;
	}
	public long getLuong() {
		return luong;
	}
	public void setPhantram(float num) {
		phantram=num;
	}
	public float getPhantram() {
		return phantram;
	}
	public void setTien() {
		tien=luong*phantram/100;
	}
	public float getTien() {
		return tien;
	}
	
}
class lichthi{
	private  String gioT,gioL,gioH;
	public String getGioT() {
		return gioT;
	}
	public void setGioT(String gio) {
		gioT=gio;
	}
	public String getGioL() {
		return gioL;
	}
	public void setGioL(String gio) {
		gioL=gio;
	}
	public String getGioH() {
		return gioH;
	}
	public void setGioH(String gio) {
		gioH=gio;
	}
	}
class ngaynghi{
	private int n;
	private String a="";
	public void setN(int n) {
		this.n=n;
	}
	public int getN() {
		return n;
	}
	public void setA(String a) {
		this.a=a;
		
	}
	public String getA(){
		return a;
}
}
class phieudiemdanh{
	private boolean vang;
	private String tenvang;
	public void setVang(boolean a) {
		vang=a;
		}
	public boolean getVang() {
		return vang;
	}
	public void setTenvang(String a) {
		tenvang=a;
		}
	public String getTenvang() {
		return tenvang;
	}

}
class TienTK{
	private long luong,tieu,tietkiem;
	public long getLuong() {
		return luong;
	}
	public void setLuong(long num) {
		luong=num;
	}
	public long getTieu() {
		return tieu;
	}
	public void setTieu(long num) {
		tieu=num;
	}
	public long getTietkiem() {
		return tietkiem;
	}
	public void setLuong() {
		tietkiem=luong-tieu;
	}
	
}

