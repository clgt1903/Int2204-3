package amine.com;

public class NhanVien {
	private String ten;
	private int tuoi;
	private String diaChi;
	private double luong;
	private int soGioLam;
	public NhanVien()
	{
		this.ten ="Hoàng Kiến Quốc";
		this.tuoi =25;
		this.diaChi ="Hoàng Văn Thụ";
		this.luong =25000000;
		this.soGioLam =12;
		
		
	}
	public NhanVien(String ten ,int tuoi ,String diaChi,double luong,int soGioLam)
	{
		this.ten = ten;
		this.tuoi =tuoi;
		this.diaChi =diaChi;
		this.luong =luong;
		this.soGioLam =soGioLam;
		
		
	}
	public String getTen()
	{
		return this.ten;
	}
	public int getTuoi()
	{
		return this.tuoi;
	}
	public String getDiaChi()
	{
		return this.diaChi;
	}
	public double getLuong()
	{
		return this.luong;
	}
	public int getSoGioLam()
	{
		return this.soGioLam;
	}
	public void setTen (String ten)
	{
		this.ten =ten ;
	}
	public void setTuoi (int tuoi)
	{
		this.tuoi =tuoi ;
	}
	public void setDiaChi (String diaChi)
	{
		this.diaChi =diaChi ;
	}
	public void setLuong (double luong)
	{
		this.luong =luong ;
	}
	public void setSoGioLam (int soGioLam)
	{
		this.soGioLam =soGioLam;
	}
	
}
