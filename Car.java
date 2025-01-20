class Car {
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
        System.out.println("This car" + this.name + "has the color" + this.color + "has the speed of" + this.speed);
    }
}