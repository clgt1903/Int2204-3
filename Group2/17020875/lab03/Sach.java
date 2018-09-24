public class Sach

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