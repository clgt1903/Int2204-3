package amine.com;

public class SoThuc {
	private int phanThuc;
	private int phanAo;
	public SoThuc ()
	{
		this.phanThuc = 4;
		this.phanAo =2;
		
	}
	public SoThuc (int phanThuc,int phanAo)
	{
		this.phanThuc =phanThuc;
		this.phanAo = phanAo;
	}
	public int getPhanThuc ()
	{
		return this.phanThuc;
	}
	public int getPhanAo()
	{
		return this.phanAo;
	}
	public void setPhanThuc(int phanThuc)
	{
		this.phanThuc =phanThuc;
	}
	public void setPhanAo(int phanAo)
	{
		this.phanAo =phanAo;
	}
}
