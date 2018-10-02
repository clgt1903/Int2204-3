 //package testchuongtrinh;
 
 public class Dog{
     private String color;
     private String breed;
     private String name;
     private String food;
     /*phuong thuc set gia tri*/
     public void setColor(String color) {
         this.color = color;
     }
 
     public void setBreed(String breed) {
         this.breed = breed;
     }
 
     public void setName(String name) {
         this.name = name;
     }
 
     public void setFood(String food) {
         this.food = food;
     }
     /* phuong thuc get gia tr*/
 
     public String getColor() {
         return color;
     }
 
     public String getBreed() {
         return breed;
     }
 
     public String getName() {
         return name;
     }
 
     public String getFood() {
         return food;
     }
     /*phuong thuc*/
     public void bark()
     {
         System.out.println("Ruf Ruf");
     }
     public void eat()
     {
 
     }
     public void wag()
     {
 
     }
 }
 public class student
 {
     /* thuoc tinh */
     private String name;
     private int old;
     private String id;
     private float mark;
     /* setter*/
     public void setName(String name) {
         this.name = name;
     }
 
     public void setOld(int old) {
         this.old = old;
     }
 
     public void setId(String id) {
         this.id = id;
     }
 
     public void setMark(float mark) {
         this.mark = mark;
     }
     /*getter*/
 
     public String getName() {
         return name;
     }
 
     public int getOld() {
         return old;
     }
 
     public String getId() {
         return id;
     }
 
     public float getMark() {
         return mark;
     }
     /*phuong thuc*/
     public void getInfo()
     {
         System.out.println("Ho va ten: " + name);
         System.out.println("tuoi: " + old);
         System.out.println("MSSV: " + id);
         System.out.println("Diem mon hoc: " + mark);
     }
 
 }
 public class Table
 {
     private float dai;
     private float rong;
     private String mau;
     /* pt set gia tri*/
     public void setDai(float dai) {
         this.dai = dai;
     }
 
     public void setRong(float rong) {
         this.rong = rong;
     }
 
     public void setMau(String mau) {
         this.mau = mau;
     }
     /*pt get gia tri*/
     public float getDai() {
         return dai;
     }
 
     public float getRong() {
         return rong;
     }
 
     public String getMau() {
         return mau;
     }
     /*pt*/
 
     public float getDientichBan()
     {
         float s;
         s = this.dai * this.rong;
         return s;
     }
 
 }
 public class car
 {
     /*thuoc tinh*/
     private String brand;
     private String color;
     private int cost;
     private float speed;
     /* setter */
     public void setBrand(String brand) {
         this.brand = brand;
     }
 
     public void setColor(String color) {
         this.color = color;
     }
 
     public void setCost(int cost) {
         this.cost = cost;
     }
 
     public void setSpeed(float speed) {
         this.speed = speed;
     }
     /*getter*/
     public String getBrand() {
         return brand;
     }
 
     public String getColor() {
         return color;
     }
 
     public int getCost() {
         return cost;
     }
 
     public float getSpeed() {
         return speed;
     }
 
     /* phuong thuc*/
     public void getInfoCar()
     {
         System.out.println("Brand of car: " + brand);
         System.out.println("Color of car: " + color);
         System.out.println("Cost of car: " + cost);
         System.out.println("Speed of car: " + speed);
     }
     public float CalWay()
     {
         float l = this.speed * 2;
         return l;
     }
 }
 
 public class employee
 {
     /*thuoc tinh*/
     private String name;
     private String id;
     private int salary;
     private int rate;
     /*setter*/
 
     public void setName(String name) {
         this.name = name;
     }
 
     public void setId(String id) {
         this.id = id;
     }
 
     public void setSalary(int salary) {
         this.salary = salary;
     }
 
     public void setRate(int rate) {
         this.rate = rate;
     }
     /*getter*/
 
     public String getName() {
         return name;
     }
 
     public String getId() {
         return id;
     }
 
     public int getSalary() {
         return salary;
     }
 
     public int getRate() {
         return rate;
     }
     /*phuong thuc*/
     public int totalSalary()
     {
         int i = salary * (rate + 1);
         return i;
     }
 }
 
 public class sach
 {
     private String name;
     private String tacgia;
     private String namXuatBan;
 
     public void setName(String name) {
         this.name = name;
     }
 
     public void setTacgia(String tacgia) {
         this.tacgia = tacgia;
     }
 
     public void setNamXuatBan(String namXuatBan) {
         this.namXuatBan = namXuatBan;
     }
 
     public String getName() {
         return name;
     }
 
     public String getTacgia() {
         return tacgia;
     }
 
     public String getNamXuatBan() {
         return namXuatBan;
     }
 
     public boolean checkyear()
     {
         if(this.namXuatBan == 2001)
             return true;
         else
             return false;
     }
 }
 public class hinhChuNhat
 {
     private int dai;
     private int rong;
 
     public void setDai(int dai) {
         this.dai = dai;
     }
 
     public void setRong(int rong) {
         this.rong = rong;
     }
 
     public int getDai() {
         return dai;
     }
 
     public int getRong() {
         return rong;
     }
 
     public int dienTich()
     {
         int s = dai * rong;
         return s;
     }
     public int chuVi()
     {
         int c = (dai + rong)/2;
         return c;
     }
 }
 
 public class hingVuong
 {
     int canh;
 
     public void setCanh(int canh) {
         this.canh = canh;
     }
 
     public int getCanh() {
         return canh;
     }
 
     public int dienTich()
     {
         return canh * canh;
     }
 }
 public class NgoiNha//  Ngôi nhà
 {
     private String mausac;  //màu sắc
     private String kichthuoc;  //*rộng*cao
     public void setmausac(String mausac)
     {
         this.mausac=mausac;
     }
     public String getmausac()
     {
         return mausac;
     }
     public void setkichthuoc(String kichthuoc)
     {
         this.kichthuoc=kichthuoc;
     }
     public String getkichthuoc()
     {
         return kichthuoc;
     }
 }
 public class DongHo  //Cái đồng hồ
 {
     private String nhanhieu;  //nhãn hiệu
     private double giatien;
     public void setnhanhieu(String nhanhieu)
     {
         this.nhanhieu=nhanhieu;
     }
     public String getnhanhieu()
     {
         return nhanhieu;
     }
     public void setgiatien(double giatien)
     {
         this.giatien=giatien;
     }
     public double getgiatien()
     {
         return giatien;
   }
}
