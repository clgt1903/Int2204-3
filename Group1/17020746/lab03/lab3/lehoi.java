package lab3;

public class lehoi {
    private String ten;
    private String date;
    private String chucvu;

    public String getten(){
        return ten;
    }
    public void setten(String ten){
        this.ten = ten;
    }

    public String getdate(){
        return date;
    }
    public void setdate(String date){
        this.date = date;
    }

    public String getcv(){
        return chucvu;
    }
    public void setcv(String chucvu){
        this.chucvu = chucvu;
    }

    public void Add(String name, String tuoi, String cv)
    {
        this.ten = name;
        this.date = tuoi;
        this.chucvu = cv;
    }
}
