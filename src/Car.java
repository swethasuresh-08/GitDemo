public class Car {
    private int price;
    private int engineSize;
    private int maxSpeed;

    public Car(int price,int engineSize,int maxSpeed)
    {
        this.price=price;
        this.engineSize=engineSize;
        this.maxSpeed=maxSpeed;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public void setEngineSize(int engineSize) {
        this.engineSize = engineSize;
    }

    public int getPrice() {
        return price;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
    public int getEngineSize() {
        return engineSize;
    }

    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                "maxSpeed="+ maxSpeed +
                ", engineSize=" + engineSize +
                '}';
    }
}
