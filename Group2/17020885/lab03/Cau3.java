/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cau3;

/**
 *
 * @author Administrator
 */
public class Cau3 {
    public static void main(String[] args) {
        Father Dad = new Father();
        Dad.setName("Tran quoc xuan");
        Dad.setNgheNghiep("Tu do");
        Dad.setAge(50);
        Dad.setContent("Dam dang");
        System.out.println(Dad.getinfo());
        
        Mother Mom = new Mother();
        Mom.setName("Dao Viet Ha");
        Mom.setNgheNghiep("Giao vien");
        Mom.setAge(46);
        Mom.setContent("Nau an rat ngon");
        System.out.println(Mom.getinfo());
        
        conmeo meo = new conmeo();
        meo.setName("Mimi");
        meo.setAge(5);
        meo.setMaulong("Tam the");
        meo.setCongdung("Bat chuot ,an vung");
        System.out.println(meo.getinfo());
        
        Giaovien Gv = new Giaovien();
        Gv.setName("Nguyen thu ha");
        Gv.setAge(40);
        Gv.setGiangvienmon("toan");
        Gv.setTrinhdohocvan("Tien si");
        System.out.println(Gv.getinfo());
       
        Laptrinhvien ltv = new Laptrinhvien();
        ltv.setMatdanh("hacker No.1");
        ltv.setAge(20);
        ltv.setChucvu("master coder");
        ltv.setCongviec("hacker");
        System.out.println(ltv.getinfo());
        
        Bacsi Bs = new Bacsi();
        Bs.setName("Tran Tran");
        Bs.setAge(58);
        Bs.setChucvu("giam doc ");
        Bs.setNganhchinh("Bac si phau thuat");
        System.out.println(Bs.getinfo());
        
        CASI cs = new CASI();
        cs.setName("Son tung MTP");
        cs.setAge(25);
        cs.setTheloai("POP music");
        cs.setThanhTuu("Nhieu thanh tuy");
        System.out.println(cs.getinfo());
        
        maytinh mt=new maytinh();
        mt.setHedieuhanh("Win 10");
        mt.setNamsanxuat(2017);
        mt.setTen("dell i7");
        System.out.println(mt.getinfo());
        
        Emtrai et=new Emtrai();
        et.setName("Tran Duc Minh");
        et.setAge(10);
        et.setNghenghiep("Hoc sinh");
        System.out.println(et.getinfo());
        
        Concho cc=new Concho();
        cc.setName("Thuyet");
        cc.setAge(19);
        cc.setCongdung("Sua");
        cc.setMaulong("Den");
        System.out.println("\n"+cc.getinfo());
}
}
