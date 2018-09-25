package amine.com;

public class HinhVuong {
	private double canh;
	public HinhVuong()
	{
		this.canh =5.7;
	}
	public HinhVuong (double canh)
	{
		this.canh =canh;
	}
	public double getCanh()
	{
		return this.canh;
	}
	public void setCanh(double canh)
	{
		this.canh =canh ;
	}
	public double chuVi (double canh)
	{
		return 4*this.canh;
	}
	public double dienTich (double canh)
	{
		return this.canh *this.canh;
	}

}
