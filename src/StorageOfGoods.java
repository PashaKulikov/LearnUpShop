import java.util.*;

public class StorageOfGoods {
    Map<Integer, Product> storage = new HashMap<>();

    public ArrayList<Product> countLeftovers(Map<Integer, Product> storage) {
        ArrayList<Product> productArrayList = new ArrayList<>();
        for (Map.Entry<Integer, Product> entry : storage.entrySet()) {
            productArrayList.add(entry.getValue());
        }
        Collections.sort(productArrayList);
        return productArrayList;
    }
}
