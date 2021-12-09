import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListMini {
    static List<Product> prd = new ArrayList<>();
public static void main(String[] args) {

        prd.add(new Product(1,"Soap",1,60));
        prd.add(new Product(2,"Shampoo",1,80));
        prd.add(new Product(3,"Pencil",1,5));
        prd.add(new Product(4,"Pen",1,10));
        prd.add(new Product(5,"Toothbrush",1,30));
        int ch;
        do{
        System.out.println("Product List");

        System.out.println("Menu");
        System.out.println("1.Create Product");
        System.out.println("2.search Product");
        System.out.println("3.update the product");
            System.out.println("4.Delete the product");
            System.out.println("5.Display the product");
        System.out.println("6.Exit");
        Scanner sc = new Scanner(System.in);
        ch = sc.nextInt();
        switch (ch) {
            case 1:
                createProd();
                break;
            case 2:
                int id;
                System.out.println("Enter the id you want to search");
                id = sc.nextInt();
                searchProd(id);
                break;
            case 3:
                updateProd();
                System.out.println("Updated successfully...");
                break;
            case 4:
                System.out.println("Enter the id you want to delete");
                id = sc.nextInt();
                removeProd(id);
                System.out.println("Product removed successfully...");
                break;
            case 5:
                System.out.println(prd);
                break;
            case 6:
                System.out.println("Program ends....");
                System.exit(0);
                break;



        }
    }while(ch != -1);
System.out.println("Program ends");
}



    private static void createProd() {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter product id");
        int prodId = sc.nextInt();



        System.out.println("Enter product name");
        String prodName = sc.next();



        System.out.println("Enter the quantity");
        int qty = sc.nextInt();



        System.out.println("Enter the price");
        int price = sc.nextInt();



        Product newProd = new Product(prodId,prodName,qty,price);



        prd.add(newProd);
    }



    private static void searchProd(int id) {
        for (int index = 0; index <prd.size(); index++) {
            Product prod = prd.get(index);
            if(prod.getId()==id)
                System.out.println(prod);
        }



    }



    private static void updateProd() {
    Scanner sc= new Scanner(System.in);
        System.out.println("Enter product id");
        int prodId = sc.nextInt();



        System.out.println("Enter product name");
        String prodName = sc.next();



        System.out.println("Enter the quantity");
        int qty = sc.nextInt();



        System.out.println("Enter the price");
        int price = sc.nextInt();
        for(int i = 0;i<prd.size();i++){
            Product p = prd.get(i);
            if(p.getId()==prodId){
                p.setProduct_name(prodName);
                p.setQty(qty);
                p.setPrice(price);



            }
        }
    }
    private static void removeProd(int id ){
        for(int i = 0; i < prd.size();i++){
            Product prod = prd.get(i);
            if(prod.getId()==id){
                prd.remove(prod);
                System.out.println("Product removed...");
            }


        }



    }
}







