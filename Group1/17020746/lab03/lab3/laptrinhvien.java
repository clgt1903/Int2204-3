package lab3;

public class laptrinhvien {
    private String ten;
    private int tuoi;
    private String nlv;

    public String getten(){
        return ten;
    }
    public void setten(String ten){
        this.ten = ten;
    }

    public int gettuoi(){
        return tuoi;
    }
    public void settuoi(int tuoi){
        this.tuoi = tuoi;
    }

    public String getnlv(){
        return nlv;
    }
    public void setcv(String nlv){
        this.nlv = nlv;
    }

    public void Add(String name, int tuoi, String cv)
    {
        this.ten = name;
        this.tuoi = tuoi;
        this.nlv = cv;
    }
}
