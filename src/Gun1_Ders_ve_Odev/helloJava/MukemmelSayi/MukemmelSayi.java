package Gun1_Ders_ve_Odev.helloJava.MukemmelSayi;


import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args){
        System.out.println("Pozitif bir doğal sayı giriniz : ");
        Scanner tara = new Scanner(System.in);
        int sayi = tara.nextInt();
        int toplam = 0;

        for (int i =1; i<sayi;i++){
            if (sayi % i == 0){
                toplam = toplam +i;
                System.out.println(toplam);
            }
        }

        if (sayi==toplam){
            System.out.println(sayi + "Mükemmel bir sayıdır.");
        }else {
            System.out.println(sayi + "mükemmel sayı değildir.");
        }
    }
}
