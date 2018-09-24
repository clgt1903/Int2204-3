public class Student
{
    /* thuoc tinh */
    private String name;
    private int old;
    private String id;
    private float mark;
    /* setter*/
    public void setName(String name) {
        this.name = name;
    }

    public void setOld(int old) {
        this.old = old;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }
    /*getter*/

    public String getName() {
        return name;
    }

    public int getOld() {
        return old;
    }

    public String getId() {
        return id;
    }

    public float getMark() {
        return mark;
    }
    /*phuong thuc*/
    public void getInfo()
    {
        System.out.println("Ho va ten: " + name);
        System.out.println("tuoi: " + old);
        System.out.println("MSSV: " + id);
        System.out.println("Diem mon hoc: " + mark);
    }

}
