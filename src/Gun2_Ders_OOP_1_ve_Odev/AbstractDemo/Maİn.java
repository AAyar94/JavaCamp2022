package Gun2_Ders_OOP_1_ve_Odev.AbstractDemo;

public class Maİn {
    public static void main(String[] args){

        CustomerManager customerManager = new CustomerManager();
        customerManager.databaseManager = new MySqlDatabaseManager();
        customerManager.getCustomers();

    }
}
