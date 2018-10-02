import java.util.Scanner;

public class lab03 { 
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        fibonacci fib = new fibonacci();
        ucln test = new ucln();

        System.out.println("fib cua 5 la:"+fib.fibonacci_of_n(5));
        System.out.println("ucln cua 15 va -5 la"+test.get_ucln(15, -5));
        System.out.println("Nhap 2 phan so cua ban: ");
        int tu1 = scanner.nextInt();
        int mau1 = scanner.nextInt();
        int tu2 = scanner.nextInt();
        int mau2 = scanner.nextInt();
        PS phan_so1 = new PS();
        PS phan_so2 = new PS();
        phan_so1.set_PS(tu1, mau1);
        phan_so2.set_PS(tu2, mau2);
        PS cong = new PS();
        PS tru = new PS();
        PS nhan = new PS();
        PS chia = new PS();
        cong = phan_so1.plus_PS(phan_so2);
        tru = phan_so1.sub_PS(phan_so2);
        nhan = phan_so1.multi_PS(phan_so2);
        chia = phan_so1.divide_Ps(phan_so2);
        if(phan_so1.equals(phan_so2)) System.out.println("bang nhau");
        else  System.out.println("khac nhau");
        
        System.out.println(chia.get_tu() + "/" + chia.get_mau());
    
    }
}