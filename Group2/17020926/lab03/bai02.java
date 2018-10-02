package lab03;
import java.util.Scanner;
public class bai02 {
    public static void main(String[] agrs){

        PS ps1 = new PS();
        PS ps2 = new PS();
        Scanner sc = new Scanner(System.in);
        ps1.setTs(sc.nextInt()) ;
        ps1.setMs(sc.nextInt()) ;
        ps2.setTs(sc.nextInt()) ;
        ps2.setMs(sc.nextInt()) ;
        System.out.println("Phan so thu  1: " + ps1.getPs());
        System.out.println("Phan so thu  2: " + ps2.getPs());
        System.out.println("Tong hai phan so: " + ps1.sum(ps1,ps2).getPs());
        System.out.println("Hieu hai phan so: " + ps1.subtract(ps1,ps2).getPs());
        System.out.println("Tich hai phan so: " + ps1.multi(ps1,ps2).getPs());
        System.out.println("Phep chia hai phan so: " + ps1.div(ps1,ps2).getPs());
        System.out.println("Phan so 1 bang phan so 2: " + ps1.equals(ps2));
    }
}
