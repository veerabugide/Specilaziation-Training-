import java.util.Objects;



public class Product {
    private int prodId;
    private String prodName;
    private int qty;
    private int price;



    public Product(int prodId, String prodName, int qty, int price) {
        this.prodId = prodId;
        this.prodName = prodName;
        this.qty = qty;
        this.price = price;
    }



    public int getProdId() {
        return prodId;
    }



    public void setProdId(int prodId) {
        this.prodId = prodId;
    }



    public String getProdName() {
        return prodName;
    }



    public void setProdName(String prodName) {
        this.prodName = prodName;
    }



    public int getQty() {
        return qty;
    }



    public void setQty(int qty) {
        this.qty = qty;
    }



    public int getPrice() {
        return price;
    }



    public void setPrice(int price) {
        this.price = price;
    }
    public int compareTo(Product newProduct) {
        return this.getProdId() - newProduct.getProdId();
    }
    // Two employees are equal if their IDs are equal
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return prodId == product.prodId;
    }



    @Override
    public int hashCode() {
        return Objects.hash(prodId);
    }



    @Override
    public String toString() {
        return "Product{" +
                "prodId=" + prodId +
                ", prodName='" + prodName + '\'' +
                ", qty=" + qty +
                ", price=" + price +
                '}';
    }
}