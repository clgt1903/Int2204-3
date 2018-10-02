package lab3;

import java.util.Scanner;


public class PS {
	private int TS;
	private int MS;
	
	public void setTS (int n) {
		this.TS = n;
	}
	public int getTS () {
		return this.TS;
	}
	public void setMS(int m) {
		if (m == 0) {
			System.out.println("ERROR!");
			return ;
		}
		this.MS = m;
	}
	public int getMS() {
		return this.MS;
	}
	public void showPS() {
		if (this.getMS()<0 ) {
			this.setTS(-this.getTS());
			this.setMS(-this.getMS());
		}
		if (this.getMS()== 1)
			System.out.println(this.getTS());
		else 
			if (this.getTS() == 0 )
				System.out.println(this.getTS());
		else 
			
		System.out.println(this.getTS() + " / "  + this.getMS());
	}
	public  int UCN(int a, int b) {
		if (a<0) a = - a;
		if (b < 0) b = -b;
		if (a== 0) return b;
		else if (b == 0 ) return a;
		else {
				
			while (a!=b) {
				if (a > b) a = a - b;
				else b = b - a;
			}
			return a;
		}
		}
	public  PS congPS(PS ps1) {
		PS ps = new PS();
		
		int ts = ps1.getTS() * this.getMS() + ps1.getMS() * this.getTS();
		int ms = ps1.getMS()*this.getMS();
		int k = UCN(ts, ms);

		ps.setTS(ts/k);
		ps.setMS(ms/k);
		
		return ps;
	}
	
	public  PS truPS( PS ps2) {
		PS ps = new PS();
		
		int ts = this.getTS() * ps2.getMS() - this.getMS() * ps2.getTS();
		int ms = this.getMS()*ps2.getMS();
		int k = UCN(ts, ms);

		ps.setTS(ts/k);
		ps.setMS(ms/k);
		
		return ps;
	}
	public  PS nhanPS(PS ps1) {
		PS ps = new PS();
		
		int ts = ps1.getTS() * this.getTS();
		int ms = ps1.getMS()*this.getMS();
		int k = UCN(ts, ms);

		ps.setTS(ts/k);
		ps.setMS(ms/k);
		
		return ps;
	}
	public  PS chiaPS( PS ps2) {
		PS ps = new PS();
		
		int ts = this.getTS() * ps2.getMS();
		int ms = this.getMS()*ps2.getTS();
		int k = UCN(ts, ms);

		ps.setTS(ts/k);
		ps.setMS(ms/k);
		
		return ps;
	}
	public  boolean equals ( Object obj) {
		if (obj instanceof PS) {
		
			PS temp = (PS)  obj;
		if ( this.getTS() * temp.getMS() - this.getMS() * temp.getTS() == 0) return true;
		else return false;
	}
		else return false;
	}
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao phan so a/ b (a b) ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		PS ps1 = new PS();
		ps1.setTS(a);
		ps1.setMS(b);
		
		System.out.println("Nhap vao phan so c/ d (c d) ");
		int c = sc.nextInt();
		int d = sc.nextInt();
		PS ps2 = new PS();
		ps2.setTS(c);
		ps2.setMS(d);
		
		
		PS ps0 = new PS();
		ps0= ps2.congPS(ps1);
		System.out.print("Tong cua 2 PS: " );
		ps0.showPS();
		System.out.println("");

		
		ps0= ps1. truPS(ps2);
		System.out.print("Hieu cua 2 PS: " );
		ps0.showPS();
		System.out.println("");

		
		ps0= ps1.nhanPS( ps2);
		System.out.print("Tich cua 2 PS: " );
		ps0.showPS();
		System.out.println("");
		
		if (ps2.getTS()== 0) {
			System.out.println("Khong the chia!");
		}
		else {
		ps0= ps1.chiaPS(ps2);
		System.out.print("Thuong cua 2 PS: " );
		ps0.showPS();
		System.out.println("");
		}
		
		if (ps1.equals (ps2) == true) {
			System.out.print("2 phan so bang nhau!" );
		}
		else
			System.out.print("2 phan so khong bang nhau!" );

	}
}