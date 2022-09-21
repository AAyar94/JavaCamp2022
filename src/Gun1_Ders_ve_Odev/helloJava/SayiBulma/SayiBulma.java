package Gun1_Ders_ve_Odev.helloJava.SayiBulma;

public class SayiBulma {
    public static void main(String[] args){
        int[] sayilar = new int[]{1,2,5,7,9,0};
        int arananSayi = 14;
        boolean sayiVarMi = false;

        for (int i : sayilar){
            if (i == arananSayi){
                sayiVarMi = true;
                break;
            }
        }
        if (sayiVarMi==true){
            System.out.println("Aranan Sayı dizide mevcuttur.");
        }else {
            System.out.println("Aranan sayı dizide mevcut değildir");
        }
    }
}
