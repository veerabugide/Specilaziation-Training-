import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



public class ProductComp {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(2, "shampoo", 10, 150));
        products.add(new Product(1, "mobile", 10, 250));
        products.add(new Product(4, "laptops", 2, 80000));
        products.add(new Product(3, "books", 10, 450));
        System.out.println("Products : " + products);



        Comparator<Product> productNameComparator = new Comparator<Product>() {
            public int compare(Product p1, Product p2) {
                return p1.getProdName().compareTo(p2.getProdName());
            }
        };
        Collections.sort(products,productNameComparator);
        System.out.println("\nProducts (Sorted by Name) : " + products);
    }
};