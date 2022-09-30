package Gun2_Ders_OOP_1_ve_Odev.AbstractClasses;

public abstract class GameCalculator {

    //Overide edilmek zorundadır.
    public abstract void hesapla();

    //override edilemez.Son hali buradaki gibidir.
    public final void gameOver(){
        System.out.println("Game Over!");
    }
}
