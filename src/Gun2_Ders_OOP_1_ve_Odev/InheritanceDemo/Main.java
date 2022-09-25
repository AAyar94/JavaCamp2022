package Gun2_Ders_OOP_1_ve_Odev.InheritanceDemo;

public class Main {
    public static void main(String[] args){
        KrediUI krediUI = new KrediUI();
        krediUI.KrediHesapla(new OgrentmenKrediManager());

        krediUI.KrediHesapla(new AskerKrediManageer());

        krediUI.KrediHesapla(new TarımKrediManager());
    }
}
