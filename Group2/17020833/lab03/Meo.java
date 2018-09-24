package amine.com;

public class Meo 
{
	private String giongMeo;
	private String kichThuoc ;
	private int tuoi;
	private String mauSac;
	public Meo()
	{
		this.giongMeo = "Mun";
		this.kichThuoc  ="Small";
		this.tuoi =5;
		this.mauSac = "Ðen ";
	}
	public Meo(String giongMeo ,String kichThuoc ,int tuoi ,String mauSac)
	{
		this.giongMeo = giongMeo;
		this.kichThuoc =kichThuoc;
		this.tuoi = tuoi;
		this.mauSac =mauSac;
	}
	public String getGiongMeo()
	{
		return this.giongMeo;
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
	public void setGiongMeo(String giongMeo)
	{
		this.giongMeo =giongMeo;
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
	public void tiengKeu ()
	{
		System.out.println("Meo meo");
	}
}
