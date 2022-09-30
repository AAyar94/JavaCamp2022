package Gun2_Ders_OOP_1_ve_Odev.StaticDemo;

public class ProductManager {

    public void add(Product product) {
        if (ProductValidator.isValid(product)) {
            System.out.println("Ürün eklendi.");
        } else {
            System.out.println("Ürün eklenemedi.");
        }

        ProductValidator validator = new ProductValidator();
        validator.birsey();
    }

}
