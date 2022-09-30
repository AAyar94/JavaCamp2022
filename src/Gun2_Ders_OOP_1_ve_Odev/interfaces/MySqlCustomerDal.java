package Gun2_Ders_OOP_1_ve_Odev.interfaces;

public class MySqlCustomerDal implements ICustomerDal, IRepository{
    @Override
    public void add() {
        System.out.println("MySQL'e müşteri eklendi.");
    }
}
