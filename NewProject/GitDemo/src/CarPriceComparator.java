import java.util.Comparator;

public class CarPriceComparator implements Comparator<Car> {

    @Override
    public int compare(Car o1, Car o2) {
        // TODO Auto-generated method stub
        return o1.getPrice()-o2.getPrice();
    }

}
