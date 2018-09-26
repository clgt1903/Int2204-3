package lab3;

public class cogiao {
    private String ten;
    private int tuoi;
    private String chucvu;

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

    public String getcv(){
        return chucvu;
    }
    public void setcv(String chucvu){
        this.chucvu = chucvu;
    }

    public void Add(String name, int tuoi, String cv)
    {
        this.ten = name;
        this.tuoi = tuoi;
        this.chucvu = cv;
    }

}
