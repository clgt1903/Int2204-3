package anmi.com;

public class TestPhanSo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PhanSo ps1 = new PhanSo( -1,24);
		PhanSo ps2 = new PhanSo (5,-24);
		PhanSo ps = new PhanSo();
		ps =(ps1.Cong(ps2)).toiGian();
		System.out.println("Tổng của 2 phân số là :");
		ps.hienThi();
		PhanSo ps3 = new PhanSo();
		ps3 =(ps1.Tru(ps2)).toiGian();
		System.out.println("Hiệu của 2 phân số là :");
		ps3.hienThi();
		PhanSo ps4 = new PhanSo();
		ps4 =(ps1.Nhan(ps2)).toiGian();
		System.out.println("Tích của 2 phân số là :");
		ps4.hienThi();
		PhanSo ps5 = new PhanSo();
		ps5 =(ps1.Chia(ps2)).toiGian();
		System.out.println("Thương của 2 phân số là :");
		ps5.hienThi();
		if (ps1.equals(ps2))
			System.out.println("Hai phân số bằng nhau");
		else 
			System.out.println("Hai phân số không bằng nhau");
		
	}

}
