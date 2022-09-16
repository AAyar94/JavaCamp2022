package asalSayiMi;

import java.util.Scanner;

public class asalSayiMi {
    public static void main(String[] args){
        System.out.println("Lütfen Pozitif bir sayı giriniz : ");
        Scanner tara = new Scanner(System.in);
        int girilenSayi = tara.nextInt();

        boolean durum = true;
        for (int i = 2; i<girilenSayi;i++){
            if (girilenSayi %i ==0){
                durum=false;
                break;
            }
        }
        if (durum){
            System.out.println(girilenSayi + " asal bir sayıdır");
        }
        else {
            System.out.println(girilenSayi + " asal sayı değildir");
        }
    }
}
