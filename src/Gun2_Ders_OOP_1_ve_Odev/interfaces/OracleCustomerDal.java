package Gun2_Ders_OOP_1_ve_Odev.interfaces;

public class OracleCustomerDal implements ICustomerDal{
    @Override
    public void add() {
        System.out.println("Oracle'a müşteri eklendi");
    }
}
