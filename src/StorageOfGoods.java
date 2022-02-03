import java.util.*;

public class StorageOfGoods {
    private Map<Integer, Product> storage = new HashMap<>();

    public Map<Integer, Product> getStorage() {
        return storage;
    }

    /*
       метод считает и сортирует остатки
        */
    public TreeSet<Product> countLeftovers(Map<Integer, Product> storage) {
        TreeSet<Product> productTreeSet = new TreeSet<>();
        for (Map.Entry<Integer, Product> entry : storage.entrySet()) {
            productTreeSet.add(entry.getValue());
        }

        return productTreeSet;
    }

         /*
       метод определяет товар по артиклу
        */
    public Product countByVendorCod(int vendorCod ){
       // System.out.println(storage.get(vendorCod));
        final Product valueOrDefault = storage.computeIfAbsent(vendorCod, key -> null);
        return valueOrDefault;
    }
}
