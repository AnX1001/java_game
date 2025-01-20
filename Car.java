public class Car {
    private int speed;
    private String color;
    public String name;

    public Car(int speed, String color, String name) {
        this.speed = speed;
        this.color = color;
        this.name = name;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;

    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void printCarInfo() {
        System.out.println("This car's brand is " + this.name + ", it has the color " + this.color
                + ", and it can go up to " + this.speed + " km/h.");
    }
}
