package lap3;
/**
 * 
 * @author Nguyễn Kim Hùng
 *
 */
public class LAP3 {
	public	int ucln(int num1,int num2) {
		/**
		 * ucln dung de tim uoc chung lon nhat cua 2 so
		 * @param num1 bieu thi so thu nhat
		 * @param num2 bieu thi so thu 2
		 * @return tra ve ucln cua 2 so
		 */
		if(num1<0) num1=Math.abs(num1);
		if(num2<0) num2=Math.abs(num2);
		if(num1!=0&&num2!=0)
			while(num1!=num2) {
				if(num1>num2) num1-=num2;
				else
					num2-=num1;
		}
		return num1;
	}
	
	public static void main(String [] args) {
		LAP3 m=new LAP3();
		PS a=new PS(1,2);
		PS b=new PS(10,20);
		PS c=a.Multi(b);
		if(a.equals(b)) System.out.println("bang nhau");
		else System.out.println("khong bang nhau");
		System.out.println(c.getTu()+" "+c.getMau());
		int d=-45;
		int e=75;
		int tem=m.ucln(d,e);
		System.out.println(tem+""+d/tem);
		fibo f=new fibo();
		System.out.println(f.FiboN(10));
	}
		
	

}
