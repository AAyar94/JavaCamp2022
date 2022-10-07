package Gun3_OOPWithNLayeredApp.Odev1.Credits;

public abstract class BaseCreditManager implements ICreditManager {
    public abstract void calculate();

    public void save(){
        System.out.println("Kaydedildi.");
    }

}
