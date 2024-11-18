package ArrayList_revision;

import java.util.Comparator;

public class ProductNameComparator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o2.name.compareTo(o1.name);
    }
}
