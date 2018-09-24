/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object;

/**
 *
 * @author 123456789
 */
public class Run {
    public static void main(String ags[]){
        //Sinh vien
        Object student = new Object();
        student.setInfo("Dinh Van Tuyen", "Male", "19", "Student", "Hai Duong");
        //Bac si
        Object doctor = new Object();
        doctor.setInfo("Nguyen Minh Toan", "Male", "30", "Doctor", "Thai Binh");
        //Giao vien
        Object teacher = new Object();
        teacher.setInfo("Nguyen Thi Hien", "Female", "19", "Teacher", "Thanh Hoa");
        //Lap trinh vien
        Object dev = new Object();
        dev.setInfo("Dinh Dai Duong", "Female", "25", "DEV", "Ha Nam");
        //Lai taxi
        Object taxiDriver = new Object();
        taxiDriver.setInfo("Tran VAn Tuan", "Male", "30", "Taxi Driver", "Nam Dinh");
        //Ca si
        Object singer = new Object();
        singer.setInfo("Selena Gomez", "Female", "23", "Singer", "united Kingdom");
        //Dien vien
        Object acter = new Object();
        acter.setInfo("Nguyen Kim Hung", "Male", "40", "Acter", "Hai Duong");
        //Phi cong
        Object pilot = new Object();
        pilot.setInfo("Ha Quang Hung", "Male", "27", "Pilot", "bac Giang");
        //Con meo
        Object cat = new Object();
        cat.setInfo("Buw", "Male", "3", "Son in family", "Ha Noi");
        //Bao ve
        Object security = new Object();
        security.setInfo("Pham Van Huan", "Male", "35", "Security", "Hai Duong");
        
        System.out.print(student.getInfo()+doctor.getInfo()+teacher.getInfo()+dev.getInfo()+taxiDriver.getInfo()+singer.getInfo()+acter.getInfo()+pilot.getInfo()+cat.getInfo()+security.getInfo());
    }
    
}
