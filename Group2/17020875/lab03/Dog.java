public class Dog{

    private String color;
    private String breed;
    private String name;
    private String food;

    /*phuong thuc set gia tri*/
    public void setColor(String color) {
        this.color = color;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFood(String food) {
        this.food = food;
    }
    /* phuong thuc get gia tr*/

    public String getColor() {
        return color;
    }

    public String getBreed() {
        return breed;
    }

    public String getName() {
        return name;
    }

    public String getFood() {
        return food;
    }

    public void bark()
    {
        System.out.println("Ruf Ruf");
    }
    public void eat()
    {
        
    }
    public void wag()
    {

    }
}