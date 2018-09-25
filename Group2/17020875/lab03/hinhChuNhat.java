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
