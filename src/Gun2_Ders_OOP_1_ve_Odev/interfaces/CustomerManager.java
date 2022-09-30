package Gun2_Ders_OOP_1_ve_Odev.interfaces;

public class CustomerManager {
    private ICustomerDal customerDal;

    public CustomerManager(ICustomerDal customerDal){
        this.customerDal = customerDal;

    }



    public void add(){
        // İş kodları yazılır.
        customerDal.add();
    }
}
