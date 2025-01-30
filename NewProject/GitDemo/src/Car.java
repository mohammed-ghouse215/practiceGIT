public class Car {
    private String name;
    private int price;
    private int engSize;
    public Car(String name, int price,int engSize) {
        this.name = name;
        this.price = price;
        this.engSize = engSize;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int getEngSize() {
        return engSize;
    }
    public void setEngSize(int engSize) {
        this.engSize = engSize;
    }
    @Override
    public String toString() {
        return "Car [name=" + name + ", price=" + price + ", engSize=" + engSize + "]";
    }
    
  
}
