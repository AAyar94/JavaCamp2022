package Gun2_Ders_OOP_1_ve_Odev.AbstractDemo;

public class SqlServerBaseDatabaseManager extends BaseDatabaseManager {
    @Override
    public void getData() {
        System.out.println("Veri getirildi : SQL");
    }
}
