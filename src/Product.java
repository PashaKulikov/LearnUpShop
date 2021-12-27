public class Product implements Comparable<Product> {
    private String name;
    private  int amount;

    @Override
    public int compareTo(Product o) {
        return name.compareTo(o.getName());
    }


    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", amount=" + amount +
                '}';
    }

    public Product(String name, int vendorCode) {
        this.name = name;
        this.amount = vendorCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVendorCode() {
        return amount;
    }

    public void setVendorCode(int vendorCode) {
        this.amount = vendorCode;
    }
}
