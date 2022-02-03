public class Main {
    public static void main(String[] args) {
        Product one = new Product("one", 1);
        Product two = new Product("two", 2);
        Product three = new Product("aaa", 3);

        StorageOfGoods st = new StorageOfGoods();


        st.getStorage().put(1, one);
        st.getStorage().put(2, two);
        st.getStorage().put(3, three);

        System.out.println(st.countLeftovers(st.getStorage()));
        System.out.println(st.countByVendorCod(2));
        System.out.println(st.countByVendorCod(1));




    }
}
