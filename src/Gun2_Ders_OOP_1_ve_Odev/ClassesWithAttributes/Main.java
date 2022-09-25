package Gun2_Ders_OOP_1_ve_Odev.ClassesWithAttributes;

public class Main {
    public static void main(String[] args){

        Product product = new Product();

        product.set_name("Laptop");
        product.set_id(1);
        product.set_description("Asus laptop");
        product.set_price(5000);
        product.setStockAmount(3);

        System.out.println(product.get_kod());


        ProductManager productManager = new ProductManager();
        productManager.Add(product);

        System.out.println(product.get_name());


        /*productManager.Add2(1,"","",2,200);
        productManager.Add2(1,"","",2,200);
        productManager.Add2(1,"","",2,200);
        productManager.Add2(1,"","",2,200);
        productManager.Add2(1,"","",2,200);*/

    }
}
