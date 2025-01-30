import java.util.Comparator;

public class BikePriceComparator implements Comparator<Bike>{
    @Override
    public int compare(Bike o1, Bike o2) {
        // TODO Auto-generated method stub
        return o1.getPrice()-o2.getPrice();
    }

}
