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