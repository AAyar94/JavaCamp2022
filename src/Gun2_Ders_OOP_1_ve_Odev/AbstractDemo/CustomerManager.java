package Gun2_Ders_OOP_1_ve_Odev.AbstractDemo;

public class CustomerManager {

    BaseDatabaseManager databaseManager;

    public void getCustomers(){
        databaseManager.getData();
    }
}
