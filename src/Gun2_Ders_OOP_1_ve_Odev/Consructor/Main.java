package Gun2_Ders_OOP_1_ve_Odev.Consructor;

public class Main {
    public static void main(String[] args){


        Product product = new Product(1,"Laptop","Asus Laptop", 3000.21,3,"siyah");

        Product product1 = new Product();

        product1.set_name("Laptop");
        product1.set_id(1);
        product1.set_description("Asus laptop");
        product1.set_price(5000);
        product1.setStockAmount(3);

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
