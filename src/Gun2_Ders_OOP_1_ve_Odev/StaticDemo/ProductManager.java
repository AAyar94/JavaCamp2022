package Gun2_Ders_OOP_1_ve_Odev.StaticDemo;

public class ProductManager {
    public void add(Product product) {

        ProductValidator productValidator = new ProductValidator();
        if (productValidator.isValid(product)) {
            System.out.println("Eklendi");
        } else {
            System.out.println("Eklenmedi");
        }
    }
}
