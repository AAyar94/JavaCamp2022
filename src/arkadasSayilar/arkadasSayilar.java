package arkadasSayilar;

import java.util.Scanner;

public class arkadasSayilar {
    public static void main(String[] args){
        System.out.println("Birinci Sayıyı Giriniz : ");
        Scanner tara = new Scanner(System.in);
        int sayi1 = tara.nextInt();
        System.out.println("İkinci Sayiyi Giriniz : ");
        int sayi2 = tara.nextInt();
        int toplam1 = 0;
        int toplam2= 0;

        for (int i=1;i<sayi1;i++){
            if (sayi1 %i ==0){
                toplam1= toplam1+i;
            }
        }

        for (int j=1;j<sayi2;j++){
            if (sayi2 %j ==0){
                toplam2=toplam2+j;
            }
        }

        if (toplam1==sayi2 && toplam2==sayi1){
            System.out.println(sayi1 + " ve " + sayi2 +" kardeş sayılardır.");
        }else {
            System.out.println(sayi1 + " ve " + sayi2 + " kardeş sayı değildir.");
        }

    }
}
