public class Employee
{
    /*thuoc tinh*/
    private String name;
    private String id;
    private int salary;
    private int rate;
    /*setter*/

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }
    /*getter*/

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }

    public int getRate() {
        return rate;
    }
    /*phuong thuc*/
    public int totalSalary
    {
        int i = salary * (rate + 1);
        return i;
    }
}