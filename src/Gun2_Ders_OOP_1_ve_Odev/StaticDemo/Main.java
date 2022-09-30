package Gun2_Ders_OOP_1_ve_Odev.StaticDemo;

public class Main {
    public static void main(String[] args){

        ProductManager manager = new ProductManager();
        Product product = new Product();
        product.name="Mause";
        product.price=10;

        manager.add(product);

        DatabaseHelper.Crud.delete();
        DatabaseHelper.Connection.createConnection();
    }
}
