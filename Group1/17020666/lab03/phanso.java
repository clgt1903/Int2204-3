package com.tuan3.java;

public class phanso {
	private int tso,mso;
	public int x,y;

	public void setTso(int tso)
	{
		this.tso=tso;
	}
	public void setMso(int mso)
	{
		this.mso=mso;
	}
	public int getTso()
	{
		return this.tso;
	}
	public int getMso()
	{
		return this.mso;
	}
	public phanso(int tso,int mso) {
		this.tso = tso;
		this.mso = mso;
	}
	public void cong(phanso s1) {
	
		tso=this.tso*s1.getMso()+s1.getTso()*this.mso;
	    mso=this.mso*s1.getMso();
		phanso ps=new phanso(tso,mso);
		ps.inphanso();
		System.out.println(ps.getTso()+"/"+ps.getMso());
		

	}
	public void tru(phanso s1) {
		tso=this.tso*s1.getMso()-s1.getTso()*this.mso;
		mso=this.mso*s1.getMso();
		phanso ps=new phanso(tso,mso);
		ps.inphanso();
		System.out.println(ps.getTso()+"/"+ps.getMso());
	}
	public void nhan(phanso s1)
	{
	
		tso=this.tso*s1.getTso();
		mso=this.mso*s1.getMso();
		phanso ps= new phanso(tso,mso);
		ps.inphanso();
		System.out.println(ps.getTso()+"/"+ps.getMso());
	}
	public void chia(phanso s1)
	{
		
		tso=this.tso*s1.getMso();
		mso=this.mso*s1.getTso();
		phanso ps = new phanso(tso,mso);
		ps.inphanso();
		System.out.println(ps.getTso()+"/"+ps.getMso());
	}
	public int ucln(int x,int y)
	{
		int x_,y_;
		if(x>y) {
			x_=x;
			y_=y;
		}
		else {
			x_=y;
			y_=x;
		}
		while(x_%y_!=0) {
			int du=x_%y_;
			x_=y_;
			y_=du;
		}
		return y_;
	}
	public boolean equals(phanso ps1)
	{
		if((this.tso*ps1.getMso()-this.mso*ps1.getTso())==0) return true;
		else return false;
	}
	public void inphanso()
	{
		int gcd=ucln(getMso(),getTso());
		this .setTso(this.getTso()/gcd);
		this.setMso(this.getMso()/gcd);
	}
} 






