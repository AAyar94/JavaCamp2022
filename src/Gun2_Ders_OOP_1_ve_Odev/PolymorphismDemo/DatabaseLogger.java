package Gun2_Ders_OOP_1_ve_Odev.PolymorphismDemo;

public class DatabaseLogger extends BaseLogger{
    public void log(String message){
        System.out.println("Logged to database " + message);
    }
}
