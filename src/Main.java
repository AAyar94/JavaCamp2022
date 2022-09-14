public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        //değişken isimleri camelCase ile yazılır(ilk kelimenin baş harfi küçük devam eden kelimelerin baş harfi büyük yazılır
        String ortaMetin = "İlginizi Çekebilir";
        String altMetin = "Vade süresi";

        System.out.println(ortaMetin);

        Integer vade = 12;
        Double dolarDun = 18.25;
        Double dolarBugun = 18.25;

        boolean dolarDustuMu = false;

        String okYonu = "";

        if (dolarBugun<dolarDun){
            okYonu = "down.svg";
            System.out.println(okYonu);
        } else if (dolarBugun>dolarDun) {
            okYonu = "up.svg";
            System.out.println(okYonu);
        }
        else {
            okYonu = "equal.svg";
            System.out.println(okYonu);
        }
    }
}