package amine.com;

public class HinhChuNhat {
	private float chieuDai;
	private float chieuRong;
	public HinhChuNhat()
	{
		this.chieuDai =15;
		this.chieuRong =10;
		
	}
	public HinhChuNhat (float chieuDai,float chieuRong)
	{
		this.chieuDai =chieuDai;
		this.chieuRong =chieuRong;
	}
	public float getChieuDai (float chieuDai)
	{
		return this.chieuDai;
	}
	public float getChieuRong (float chieuRong)
	{
		return this.chieuRong;
	}
	public void setChieuDai(float chieuDai)
	{
		this.chieuDai =chieuDai;
	}
	public void setChieuRong(float chieuRong)
	{
		this.chieuRong =chieuRong;
	}
	public float dienTich (float chieuDai,float chieuRong)
	{
		return this.chieuDai*this.chieuRong;
	}
	public float chuVi(float chieuDai,float chieuRong)
	{
		return (this.chieuDai+this.chieuRong)*2;
	}
}
