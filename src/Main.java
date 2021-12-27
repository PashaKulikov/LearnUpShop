public class Main {
    public static void main(String[] args) {
        Product one = new Product("one", 1);
        Product two = new Product("two", 2);
        Product three = new Product("aaa", 3);

        StorageOfGoods st = new StorageOfGoods();


        st.storage.put(1, one);
        st.storage.put(2, two);
        st.storage.put(3, three);

        System.out.println(st.storage.get(2));
        System.out.println(st.countLeftovers(st.storage));




    }
}
