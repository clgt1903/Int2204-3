package lab3;

public class PS {
    private int ts;
    private int ms;

    //Getter và setter
    public int getts(){
        return ts;
    }
    public void setts(int ts){
        this.ts = ts;
    }

    public int getms(){
        return ms;
    }
    public void setms(int ms){
        this.ms = ms;
    }

    public int UCLNN(int a, int b)
    {
        if(b == 0) return a; //Trường hợp suy biến
        else return UCLNN(b, a%b); //Trường hợp tổng quát
    }

    //So sánh 2 đối tượng
    @Override
    public boolean equals(Object obj) {
        if(obj == null)
            return false;
        if (getClass() != obj.getClass()) //Kiểm tra kiểu dữ liệu tuyền vào có phải PS không
            return false;
        PS other = (PS) obj; //Ép kiểu cho obj
        if(other.getts() == this.ts && other.getms() == this.ms){
            return true;
        } else {
            if((other.getts()/UCLNN(other.getts(), other.getms()) == this.ts/UCLNN(ts,ms))&&(other.getms()/UCLNN(other.getts(), other.getms()) == this.ms/UCLNN(ts,ms)))
            {
                return true;
            } else return false;

        }
    }

    public void Add(int tu, int mau)
    {
        this.ts = tu;
        this.ms = mau;
    }




}

