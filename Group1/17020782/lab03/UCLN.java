

package lab03;

import java.util.Scanner;

 class UCLN {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int a,b;
	a=input.nextInt();
	b=input.nextInt();
	int c=a;
	while(b!=0)
	{
		c=a%b;
		a=b;
		b=c;
	}
	System.out.println(a);
}

}
  class Fibo {
	 public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);
	 int a,b;
	 a=input.nextInt();
	 b=0;
	 int c=1,d=0;
	 if(a==0)
	 {
	 System.out.println(b);
	 return ;
	 }
	 if(a==1)
	 {
	 System.out.println(c);
	 return ;
	 }
	 for(int i=0;i<a-2;i++)
	 {
	 d=b+c;
	 b=c;
	 c=d;
	 }
	 System.out.println(d);

	 }
	 }
 class PS {

	 public int TS;
	 public int MS;

	 public PS(int TS, int MS) {
	 this.TS = TS;
	 this.MS = MS;
	 }

	 public void setTS(int TS) {
	 this.TS = TS;
	 }

	 public void setMS(int MS) {
	 this.MS = MS;
	 }

	 public int getTS() {
	 return TS;
	 }

	 public int getMS() {
	 return MS;
	 }

	 public void toigian() {
	 int a = this.getTS();
	 int b = this.getMS();
	 int c = a;
	 while (b != 0) {
	 c = a % b;
	 a = b;
	 b = c;
	 }
	 this.setTS(this.getTS() / a);
	 this.setMS(this.getMS() / a);

	 }

	 public void congPS(PS s1) {
	 int tu = this.getTS() * s1.getMS() + this.getMS() * s1.getTS();
	 int mau = this.getMS() * s1.getMS();

	 PS ketqua = new PS(tu, mau);
	 ketqua.toigian();
	 System.out.println("Tong hai phân s? = " + ketqua.TS + "/" + ketqua.MS);
	 }

	 public void truPS(PS s1) {
	 int tu = this.getTS() * s1.getMS() - this.getMS() * s1.getTS();
	 int mau = this.getMS() * s1.getMS();
	 PS ketqua = new PS(tu, mau);
	 ketqua.toigian();
	 System.out.println("Hieu hai phân s? = " + ketqua.TS + "/" + ketqua.MS);
	 }

	 public void nhanPS(PS s1) {
	 int tu = this.getTS() * s1.getTS();
	 int mau = this.getMS() * s1.getMS();
	 PS ketqua = new PS(tu, mau);
	 ketqua.toigian();
	 System.out.println("Tich hai phân s? = " + ketqua.TS + "/" + ketqua.MS);
	 }

	 public void chiaPS(PS s1) {
	 int tu = this.getTS() * s1.getMS();
	 int mau = this.getMS() * s1.getTS();
	 PS ketqua = new PS(tu, mau);
	 ketqua.toigian();
	 System.out.println("Thuong hai phân s? = " + ketqua.TS + "/" + ketqua.MS);
	 }

	 public boolean equals(Object obj) {
	 if (obj instanceof PS) {
	 PS other = (PS) obj;
	 if (this.TS * other.MS == other.TS * this.MS) {
	 return true;
	 } else {
	 return false;
	 }
	 }
	 return false;
	 }


	 }

