package lap3;
class PS {
	private int tu=1,mau=1;
	public int getTu() {
		return tu;
	}
	public int getMau() {
		return mau;
	}
	public void setTu(int tu) {
		this.tu=tu;
	}
	public void setMau(int mau) {
		this.mau=mau;
	}
	public PS(int tu,int mau) {
		this.tu=tu;
		this.mau=mau;
	}
	public PS add(PS b) {
		/**
		 * add la ham dung de cong 2 kieu PS
		 * @param b la PS duoc cong them vao PS hien tai
		 * @return tra ve ket qua phep cong 2 PS
		 */
		LAP3 a=new LAP3();
		PS c=new PS(1,1);
		c.tu=this.tu*b.mau+b.tu*this.mau;
		c.mau=this.mau*b.mau;
		if(c.tu==0) return c;
		int d=a.ucln(c.getTu(),c.getMau());
		c.tu=c.tu/d;
		c.mau=c.mau/d;
		return c;
		
	}
	public PS Subtract(PS b) {
		/**
		 * Subtract la ham dung de tru 2 kieu PS
		 * @param b la PS tru vao PS hien tai
		 * @return tra ve ket qua phep tru 2 PS
		 */
		PS c=new PS(1,1);
		c.tu=this.tu*b.mau-b.tu*this.mau;
		c.mau=this.mau*b.mau;
		if(c.tu==0) return c;
		LAP3 a=new LAP3();
		int d=a.ucln(c.tu,c.mau);
		c.tu=c.tu/d;
		c.mau=c.mau/d;
		return c;
		
	}
	
	public PS Multi(PS b) {
		/**
		 * add la ham dung de cong 2 kieu PS
		 * @param b la PS duoc nhan  them vao PS hien tai
		 * @return tra ve ket qua phep nhan 2 PS
		 */
		PS c=new PS(1,1);
		c.tu=this.tu*b.tu;
		c.mau=this.mau*b.mau;
		if(c.tu==0) return c;
		LAP3 a=new LAP3();
		int d=a.ucln(c.tu,c.mau);
		c.tu=c.tu/d;
		c.mau=c.mau/d;
		return c;
		
	}
	public PS Share(PS b) {
		/**
		 * add la ham dung de cong 2 kieu PS
		 * @param b la PS bi chia vao PS hien tai
		 * @return tra ve ket qua phep chia 2 PS
		 */
		PS c=new PS(1,1);
		c.tu=this.tu*b.mau;
		c.mau=this.mau*b.tu;
		if(c.tu==0) return c;
		LAP3 a=new LAP3();
		int d=a.ucln(c.tu,c.mau);
		c.tu=c.tu/d;
		c.mau=c.mau/d;
		return c;
		
	}
	public boolean equals(Object obj){
        if(obj == null) return false;
        if(!(obj instanceof PS)) return false;
        PS b =(PS) obj;
        if((this.tu*b.mau)!=(this.mau*b.tu)) return false;
        
        return true;
        
    }
	

}
