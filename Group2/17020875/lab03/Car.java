public class Car
{
    /*thuoc tinh*/
    private String brand;
    private String color;
    private int cost;
    private float speed;
    /* setter */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }
    /*getter*/
    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public int getCost() {
        return cost;
    }

    public float getSpeed() {
        return speed;
    }

    /* phuong thuc*/
    public void getInfoCar()
    {
        System.out.println("Brand of car: " + brand);
        System.out.println("Color of car: " + color);
        System.out.println("Cost of car: " + cost);
        System.out.println("Speed of car: " + speed);
    }
    public float CalWay()
    {
        float l = this.speed * 2;
        return l;
    }
}
