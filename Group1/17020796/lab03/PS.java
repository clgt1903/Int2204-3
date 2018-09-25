import java.util.*;

public class PS {
	private int tuSo;
	private int mauSo;

	public PS(int tuSo, int mauSo) {
		super();
		this.tuSo = tuSo;
		this.mauSo = mauSo;
	}
        
	public int getTuSo() {
		return tuSo;
	}

	public void setTuSo(int tuSo) {
		this.tuSo = tuSo;
	}

	public int getMauSo() {
		return mauSo;
	}

	public void setMauSo(int mauSo) {
		this.mauSo = mauSo;
	}

	public static int UCLN(int a, int b){
        if(b==0){
            return a;
        }
        else{
            return UCLN(b,a % b);
        }
    }

	// rut gon
	public void RutGon() {
		int i = UCLN(this.getTuSo(), this.getMauSo());
		this.setTuSo(this.getTuSo() / i);
		this.setMauSo(this.getMauSo() / i);
	}
	//phep cong
	public void Cong(PS ps) {
		int ts = this.getTuSo() * ps.getMauSo() + ps.getTuSo() * this.getMauSo();
		int ms = this.getMauSo() * ps.getMauSo();
		PS phansocong = new PS(ts, ms);
		phansocong.RutGon();
		System.out.println("Tong bang = " + phansocong.tuSo + "/" + phansocong.mauSo+ "\n-----------------");
	}
	//phep tru
	public void Tru(PS ps) {
		int ts = this.getTuSo() * ps.getMauSo() - ps.getTuSo() * this.getMauSo();
		int ms = this.getMauSo() * ps.getMauSo();
		PS phansotru = new PS(ts, ms);
		phansotru.RutGon();
		if(phansotru.tuSo ==0){
			System.out.println("Hieu bang = 0\n-----------------");
		}
		else{
			System.out.println("Hieu bang = " + phansotru.tuSo + "/" + phansotru.mauSo+ "\n-----------------");
		}
	}
		
	//phep nhan
	public void Nhan(PS ps) {
		int ts = this.getTuSo() * ps.getTuSo();
		int ms = this.getMauSo() * ps.getMauSo();
		PS phansonhan = new PS(ts, ms);
		phansonhan.RutGon();
		System.out.println("Tich bang= " + phansonhan.tuSo + "/" + phansonhan.mauSo+ "\n-----------------");
	}

	public void Chia(PS ps) {
		int ts = this.getTuSo() * ps.getMauSo();
		int ms = this.getMauSo() * ps.getTuSo();
		PS phansochia = new PS(ts, ms);
		phansochia.RutGon();
		if(phansochia.tuSo==1&&phansochia.mauSo==1){
			System.out.println("Thuong = 1\n-----------------");
		}
		else{
			System.out.println("Thuong bang = " + phansochia.tuSo + "/" + phansochia.mauSo + "\n-----------------");
		}
	}
	// so sanh 2 phan so

	public boolean equals(Object obj)
    {
        if (obj instanceof PS)
        {
           PS other = (PS) obj;
           if (this.tuSo * other.mauSo == other.tuSo * this.mauSo)
           {
           	  System.out.println("Hai phan so bang nhau");
              return true;
           }
           else {
           	System.out.println("Hai phan so khong bang nhau");
               return false;
           }
    	}
    	else{
    		System.out.println("Hai phan so khong bang nhau");
    		return false;
    	}
        
    }


	public static void main(String[] args) {
		// nhap vao 2 phan so

		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap tu 1 :");
		int ts1 = scanner.nextInt();
		System.out.print("Nhap mau 1 :");
		int ms1 = scanner.nextInt();
		System.out.print("Nhap tu 2 :");
		int ts2 = scanner.nextInt();
		System.out.print("Nhap mau 2 :");
		int ms2 = scanner.nextInt();
		System.out.println("\n\n");
		PS ps1 = new PS(ts1, ms1);
		PS ps2 = new PS(ts2, ms2);

		// kiem tra phan so nhap vao
		if (ms1 == 0 && ms2 == 0) {
			System.out.println("Mau khong hop le vi co mau bang 0");
		} else {
			// thuc hien cac phep toan
		
			ps1.RutGon();
			ps2.RutGon();
			System.out.println("Hai phan so sau khi rut gon la : " + ps1.getTuSo() + "/" + ps1.getMauSo() + " va " + ps2.getTuSo() + "/"+ ps2.getMauSo()+ "\n-----------------");
			ps1.Cong(ps2);
			ps1.Tru(ps2);
			ps1.Nhan(ps2);
			ps1.Chia(ps2);
			ps1.equals(ps2);
		}

	}
}