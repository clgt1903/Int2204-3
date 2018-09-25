package amine.com;

public class Cho {
	private String giongCho;
	private String kichThuoc ;
	private int tuoi;
	private String mauSac;
	public Cho()
	{
		this.giongCho = "Maltese";
		this.kichThuoc  ="Small";
		this.tuoi =5;
		this.mauSac = "Ðen ";
	}
	public Cho(String giongCho ,String kichThuoc ,int tuoi ,String mauSac)
	{
		this.giongCho = giongCho;
		this.kichThuoc =kichThuoc;
		this.tuoi = tuoi;
		this.mauSac =mauSac;
	}
	public String getGiongCho()
	{
		return this.giongCho;
	}
	public String getKichThuoc()
	{
		return this.kichThuoc;
	}
	public int getTuoi()
	{
		return this.tuoi;
	}
	public String getMauSac()
	{
		return this.mauSac;
	}
	public void setGiongCho(String giongCho)
	{
		this.giongCho =giongCho;
	}
	public void setKichThuoc(String kichThuoc )
	{
		this.kichThuoc = kichThuoc ;
	}
	public void setTuoi (int tuoi)
	{
		this.tuoi = tuoi;;
	}
	public void setMauSac(String mauSac)
	{
		this.mauSac =mauSac;
	}
	public  void tiengKeu ()
	{
		System.out.println("Go go");
	}
}
