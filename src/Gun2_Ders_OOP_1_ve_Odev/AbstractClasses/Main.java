package Gun2_Ders_OOP_1_ve_Odev.AbstractClasses;

public class Main {
    public static void main(String[] args){
        WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
        womanGameCalculator.hesapla();
        womanGameCalculator.gameOver();

        ManGameCalculator manGameCalculator = new ManGameCalculator();
        manGameCalculator.hesapla();
        manGameCalculator.gameOver();

        KidsGameCalculator kidsGameCalculator = new KidsGameCalculator();
        kidsGameCalculator.hesapla();
        kidsGameCalculator.gameOver();

        //abstract Class'lar newlenemez, newlendiği zaman Abstract Fonsiyonu ezmek gerekir.
        GameCalculator gameCalculator = new GameCalculator() {
            @Override
            public void hesapla() {
                System.out.println("New Hesapla");
            }
        };



    }
    GameCalculator gameCalculator1 = new WomanGameCalculator();

}
