package amine.com;

public class SinhVien {
	private String hoTen;
	private String lop;
	private float diemToan ;
	public SinhVien()
	{
		this.hoTen = "Nguyễn Văn An";
		this.lop ="9b";
		this.diemToan =10;
	}
	public SinhVien (String hoTen,String lop,float diemToan)
	{
		this.hoTen = hoTen;
		this.lop = lop;
		this.diemToan =diemToan;
	}
	public String getHoTen ()
	{
		return this.hoTen;
		
	}
	public String getLop()
	{
		return this.lop;
	}
	public float getDiemToan()
	{
		return this.diemToan;
	}
	public void setHoTen(String hoTen)
	{
		this.hoTen = hoTen ;
		
	}
	public void setLop(String lop)
	{
		this.lop = lop;
	}
	public void setDiemToan(float diemToan)
	{
		this.diemToan =diemToan;
	}
	
}
