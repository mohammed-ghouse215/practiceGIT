import java.util.ArrayList;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Car c1 = new Car("BMW", 2000,220);
        Car c2 = new Car("LEXUS", 2500,230);
        Car c3 = new Car("MARUTI", 500,120);
        Car c4 = new Car("FERRARI", 5000,420);

        ArrayList<Car> cars = new ArrayList<>(Arrays.asList(c2,c1,c4,c3));
        cars.sort(new CarPriceComparator());
        
        System.out.println(cars);
        

    }
}
