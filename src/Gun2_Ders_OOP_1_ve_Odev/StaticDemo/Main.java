package Gun2_Ders_OOP_1_ve_Odev.StaticDemo;

public class Main {
    public static void main(String[] args){

        ProductManager manager = new ProductManager();
        Product product = new Product();
        product.price=10;
        product.name="Mause";

        manager.add(product);
    }
}
