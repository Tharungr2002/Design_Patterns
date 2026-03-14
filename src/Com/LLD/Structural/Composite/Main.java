package Com.LLD.Structural.Composite;

import java.util.ArrayList;
import java.util.List;

interface CartItem {
    void display();
    int getPrice();
}

class Product implements CartItem {
    private String name;
    private int price;

    Product(String name , int price) {
        this.name =name;
        this.price= price;
    }
    @Override
    public void display() {
        System.out.println("price " + price + "name :" + name);
    }
    @Override
    public int getPrice() {
        return this.price;
    }
}
class ProductBundle implements CartItem {
    List<CartItem> products;
    String bundleName;

    ProductBundle(String bundleName) {
        this.bundleName = bundleName;
        this.products = new ArrayList<>();
    }

    void addProduct(CartItem product) {
        products.add(product);
    }

    @Override
    public void display() {
        for(CartItem it : products) {
            it.display();
        }
    }
    @Override
    public int getPrice() {
        int tot =0;
        for(CartItem it : products) {
            tot += it.getPrice();
        }
        return tot;
    }

}


public class Main {
    public static void main(String[] args) {
        CartItem iphone = new Product("iphone 11", 50);     //product
        CartItem samsung = new Product("samsung", 50);
        CartItem nokia = new Product("nokia", 50);
        CartItem redmi = new Product("redmi 11", 50);

        ProductBundle pb = new ProductBundle("phone");        //productBundle
        pb.addProduct(samsung);
        pb.addProduct(iphone);
        pb.addProduct(nokia);

        ProductBundle pb2 = new ProductBundle("another phone");
        pb2.addProduct(redmi);                                                    //productBundle

        List<CartItem> cart = new ArrayList<>();
        cart.add(pb);
        cart.add(pb2);
        cart.add(iphone);
        int tot =0;
        for(CartItem it : cart) {
            tot += it.getPrice();
        }
        System.out.println(tot);

    }
}
