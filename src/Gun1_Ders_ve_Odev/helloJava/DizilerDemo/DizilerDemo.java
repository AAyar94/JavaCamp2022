package Gun1_Ders_ve_Odev.helloJava.DizilerDemo;

public class DizilerDemo {
    public static void main(String[] args){
        String ogrenci1= "Adem";
        String ogrenci2= "Ayşe";
        String ogrenci3= "Mustafa";
        String ogrenci4= "Fatih";


        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println(ogrenci4);

        System.out.println("////////////////////////////////////////");

        String[] ogrenciler = new String[3];
        ogrenciler[0] = "Adem";
        ogrenciler[1] = "Ayşe";
        ogrenciler[2] = "Mustafa";

        for (int i=0;i<ogrenciler.length;i++){
            System.out.println(ogrenciler[i]);
        }
        for (String ogrenci : ogrenciler) {
            System.out.println("for-each : " + ogrenci);

        }

    }
}
