import java.util.*;

public class StorageOfGoods {
    Map<Integer, Product> storage = new HashMap<>();

   /*
   метод считает и сортирует остатки
    */
    public ArrayList<Product> countLeftovers(Map<Integer, Product> storage) {
        ArrayList<Product> productArrayList = new ArrayList<>();
        for (Map.Entry<Integer, Product> entry : storage.entrySet()) {
            productArrayList.add(entry.getValue());
        }
        Collections.sort(productArrayList);
        return productArrayList;
    }

         /*
       метод определяет товар по артиклу
        */
    public void countByVendorCod(int vendorCod ){
       // System.out.println(storage.get(vendorCod));
        final Product valueOrDefault = storage.computeIfAbsent(vendorCod, key -> null);
        System.out.println(valueOrDefault);
    }
}
