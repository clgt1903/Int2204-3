package amine.com;

public class ThoiGian {
	private int gio ;
	private int phut;
	private int giay ;
	public ThoiGian()
	{
		
	}
	public ThoiGian(int gio ,int phut ,int giay )
	{
		this.gio = gio ;
		this.phut = phut ;
		this.giay = giay ;
	}
	public int getGio()
	{
		return this.gio;
	}
	public int getPhut()
	{
		return this.phut;
	}
	public int getGiay()
	{
		return this.giay;
	}
	public void setGio(int gio)
	{
		this.gio = gio;
	}
	public void setPhut(int phut )
	{
		this.phut = phut;
	}
	public void setGiay (int giay)
	{
		this.giay =giay;
	}
}
