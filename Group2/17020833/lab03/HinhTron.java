package amine.com;

public class HinhTron {
	private double banKinh;
	private double PI=3.14;
	public HinhTron()
	{
		this.banKinh =5.7;
	}
	public HinhTron (double banKinh)
	{
		this.banKinh =banKinh;
	}
	public double getBanKinh()
	{
		return this.banKinh;
	}
	public void setBanKinh(double banKinh)
	{
		this.banKinh =banKinh;
	}
	public double chuVi (double banKinh)
	{
		return 2*PI*this.banKinh;
	}
	public double dienTich (double banKinh)
	{
		return PI*this.banKinh*this.banKinh;
	}
}
