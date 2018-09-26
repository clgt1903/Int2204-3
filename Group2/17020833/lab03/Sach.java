package amine.com;

public class Sach {
	private String maSach;
	private String tenSach;
	private int namXuatBan;
	private String tacGia;
	private double gia ;
	public Sach()
	{
		this.maSach ="I769";
		this.tenSach ="Tháng năm rực rỡ";
		this.namXuatBan =2000;
		this.tacGia ="Hoàng Vân";
		this.gia =100000;
		
	}
	public Sach (String maSach ,String tenSach ,int namXuatBan ,String tacGia ,double  gia )
	{
		this.maSach =maSach;
		this.tenSach =tenSach;
		this.namXuatBan =namXuatBan;
		this.tacGia =tacGia;
		this.gia = gia ;
	}
	public String getMaSach()
	{
		return this.maSach;
	}
	public String getTenSach()
	{
		return this.tenSach;
	}
	public int getNamXuatBan()
	{
		return this.namXuatBan;
	}
	public String getTacGia()
	{
		return this.tacGia;
	}
	public double getGia()
	{
		return this.gia;
	}
	public void setMaSach( String maSach)
	{
		this.maSach =maSach;
	}
	public void setTenSach( String tenSach)
	{
		this.tenSach =tenSach;
	}
	public void setNamXuatBan( int namXuatBan)
	{
		this.namXuatBan =namXuatBan;
	}
	public void setTacGia( String tacGia)
	{
		this.tacGia =tacGia;
	}
	public void setGia( double gia)
	{
		this.gia =gia;
	}
}
