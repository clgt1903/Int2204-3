class conmeo
    {
        private String ten;
        private String giong;
        private String mauLong;

        public String getMauLong() {
            return mauLong;
        }

        public void setMauLong(String mauLong) {
            this.mauLong = mauLong;
        }

        public String getTen() {
            return ten;
        }

        public void setTen(String ten) {
            this.ten = ten;
        }

        public String getGiong() {
            return giong;
        }

        public void setGiong(String giong) {
            this.giong = giong;
        }

        public conmeo(){

        }
    }
public class bai3 {
    public static void main(String[] args) {
        conmeo meo = new conmeo();
        meo.setTen("thomas");
        meo.setGiong("Duc");
        meo.setMauLong("Xam");
        System.out.println("Ten: "+meo.getTen());
        System.out.println("Giong: " + meo.getGiong());
        System.out.println("Mau long: " + meo.getMauLong());
    }

}