package Gun2_Ders_OOP_1_ve_Odev.StaticDemo;

public class ProductValidator {
    public boolean isValid(Product product){
        if(product.price>0 && !product.name.isEmpty()){
            return true;
        }else {
            return false;
        }
    }
}
