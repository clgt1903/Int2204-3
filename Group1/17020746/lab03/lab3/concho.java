package lab3;

public class concho {
    private String ten;
    private int tuoi;
    private String loai;

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

    public String getloai(){
        return loai;
    }
    public void setloai(String loai){
        this.loai = loai;
    }

    public void Add(String name, int tuoi, String cv)
    {
        this.ten = name;
        this.tuoi = tuoi;
        this.loai = cv;
    }
}
