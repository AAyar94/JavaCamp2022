package Gun2_Ders_OOP_1_ve_Odev.Overriding;

public class OgrenciKrediManager extends BaseKrediManager{
    public double hesapla(double tutar) {
        return tutar * 1.10;
    }
}
