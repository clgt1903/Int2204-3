public class thu_vien_club{
    private String ten;
    private int tuoi;
    private String role;
    private String falculty;
    

    public void set_ten(String ten){
        this.ten = ten;
    }

    public void set_tuoi(int tuoi){
        this.tuoi = tuoi;
    }

    public void set_tuoi(String role){
        this.role = role;
    }

    public void set_faculty(String falculty){
        this.falculty = falculty;
    }

    public String get_ten() {
        return this.ten;
    }

    public int get_tuoi() {
        return this.tuoi;
    }
    
    public String get_role() {
        return this.role;
    }

    public String get_faculty() {
        return this.falculty;
    }
}