package Gun2_Ders_OOP_1_ve_Odev.Overriding;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){

        BaseKrediManager[] krediManagers = new BaseKrediManager[]
                {new OgrentmenKrediManager(), new TarımKrediManager(), new OgrenciKrediManager()};


        for (BaseKrediManager krediManager :krediManagers){
            System.out.println(krediManager.hesapla(1000));
        }

    }
}
