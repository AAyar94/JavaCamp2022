package Gun2_Ders_OOP_1_ve_Odev.StaticDemo;

public class ProductValidator {
    static{
        System.out.println("Statik yapıcı blok çalıştı");

    }
    public ProductValidator(){
        System.out.println("Yepıcı blok Çalıştı");
    }

    public static boolean isValid(Product product){
        if(product.price>0 && !product.name.isEmpty())
        {
            return true;
        }else {
            return false;
        }
    }

    public void birsey(){

    }
    //inner class
    public static class baskaBirClass {
        public static void sil(){

        }
    }
}
