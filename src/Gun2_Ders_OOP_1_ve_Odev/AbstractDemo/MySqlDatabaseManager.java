package Gun2_Ders_OOP_1_ve_Odev.AbstractDemo;

public class MySqlDatabaseManager extends BaseDatabaseManager{
    @Override
    public void getData() {
        System.out.println("Veri getirildi : MySQL");
    }
}
