public class PhanSo {
    int TuSo;
    int MauSo;
    public void setTuSo(int TuSo) {
        this.TuSo = TuSo;
    }
	public int getTuSo() {
        return TuSo;
    }
    public void setMauSo(int MauSo) {
        this.MauSo = MauSo;
    }
    public int getMauSo() {
        return MauSo;
    }
    public PhanSo(int TuSo, int MauSo)
    {
        this.TuSo = TuSo;
        this.MauSo = MauSo;
    }
    public  PhanSo RutGon(PhanSo s)
    {
		int min;
		if(Math.abs(s.TuSo) > Math.abs(s.MauSo))
			min= Math.abs(s.MauSo);
		else
			min = Math.abs(s.TuSo);
		for(int i = 1; i <= min; i++)
		{
			if(s.TuSo % i == 0 && s.MauSo % i == 0)
			{
				s.TuSo = s.TuSo / i;
				s.MauSo = s.MauSo / i;
			}
		}
		if((s.TuSo<0&&s.MauSo<0)||(s.TuSo>0&&s.MauSo<0))
		{
				s.TuSo=-s.TuSo;
				s.MauSo=-s.MauSo;
		}
		return s;
    }
    public  PhanSo Add(PhanSo s1, PhanSo s2)
    {
        PhanSo s = new PhanSo(0, 0);
        s.TuSo = s1.TuSo * s2.MauSo + s2.TuSo * s1.MauSo;
        s.MauSo = s1.MauSo * s2.MauSo;
        s = RutGon(s);
        return s;
    }
    public  PhanSo Subtract(PhanSo s1, PhanSo s2)
    {
        PhanSo s = new PhanSo(0, 0);
        s.TuSo = s1.TuSo * s2.MauSo - s2.TuSo * s1.MauSo;
        s.MauSo = s1.MauSo * s2.MauSo;
		s = RutGon(s);
        return s;
    }
    public  PhanSo Multiply(PhanSo s1, PhanSo s2)
    {
        PhanSo s = new PhanSo(0, 0);
        s.TuSo = s1.TuSo * s2.TuSo;
        s.MauSo = s1.MauSo * s2.MauSo;
        s = RutGon(s);
        return s;
    }
    public PhanSo Divide(PhanSo s1, PhanSo s2)
    {
        PhanSo s = new PhanSo(0, 0);
        s.TuSo = s1.TuSo * s2.MauSo;
        s.MauSo = s1.MauSo * s2.TuSo;
        s = RutGon(s);
        return s;
    }
	public boolean equals(Object obj){                                  //so sanh hai phan so

    if(obj instanceof PhanSo) {             //kiem tra xem obj co nam trong lop PS hay ko
        PhanSo other = (PhanSo) obj;
        if(other.getMauSo()*this.TuSo == other.getTuSo()*this.MauSo )           //dieu kien de 2 phan so bang nhau
            return true;
        else
            return false;
    }
    return false;                   //obj ko thuoc lop PS
}
    public static void main(String args[])
    {
        PhanSo s1 = new PhanSo(-6, 5);
        PhanSo s2 = new PhanSo(6, -5);

        PhanSo s  = new PhanSo(0, 0);
        s = s.Add(s1, s2);
		if(s.TuSo==0)
			System.out.println("Add: 0");
		else
			if(s.TuSo==s.MauSo)
				System.out.println("Add: 1");
			else
				System.out.println("Add: " + s.TuSo + "/" + s.MauSo);
        s = s.Subtract(s1, s2);
		if(s.TuSo==0)
			System.out.println("Subtract: 0");
		else
			if(s.TuSo==s.MauSo)
				System.out.println("Subtract: 1");
			else
				System.out.println("Subtract: " + s.TuSo + "/" + s.MauSo);
        s = s.Multiply(s1, s2);
		if(s.TuSo==0)
			System.out.println("Multiply: 0");
		else
			if(s.TuSo==s.MauSo)
				System.out.println("Multiply: 1");
			else
				System.out.println("Multiply: " + s.TuSo + "/" + s.MauSo);
        s = s.Divide(s1, s2);
		if(s.TuSo==0)
			System.out.println("Divide: 0");
		else
			if(s.TuSo==s.MauSo)
				System.out.println("Divide: 1");
			else
				System.out.println("Divide: " + s.TuSo + "/" + s.MauSo);
        System.out.println(s1.equals(s2));
    }
}