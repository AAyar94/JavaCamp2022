package Gun2_Ders_OOP_1_ve_Odev.Methods;
public class Main {
    public static void main(String[] args) {
        sayiBulmaca();
        sayiBulmaca();
        sayiBulmaca();
    }

    public static void sayiBulmaca(){
        int[] sayilar = new int[]{1,2,5,7,9,0};
        int arananSayi = 7;
        boolean sayiVarMi = false;

        for (int sayi : sayilar){
            if (sayi == arananSayi){
                sayiVarMi = true;
                break;
            }
        }
        if (sayiVarMi){
            mesajVer("Sayi mevcuttur: " + arananSayi);
        }else {
            mesajVer("Sayi mevcut değildir: " + arananSayi);
        }
    }

    public static void mesajVer(String mesaj){
        System.out.println(mesaj);
    }
}
