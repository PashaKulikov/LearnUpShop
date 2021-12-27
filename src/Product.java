public class Product implements Comparable<Product> {
    private String name;
    private  int vendorCode;

    @Override
    public int compareTo(Product o) {
        return name.compareTo(o.getName());
    }


    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", vendorCode=" + vendorCode +
                '}';
    }

    public Product(String name, int vendorCode) {
        this.name = name;
        this.vendorCode = vendorCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVendorCode() {
        return vendorCode;
    }

    public void setVendorCode(int vendorCode) {
        this.vendorCode = vendorCode;
    }
}
