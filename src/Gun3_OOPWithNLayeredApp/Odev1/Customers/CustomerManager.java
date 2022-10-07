package Gun3_OOPWithNLayeredApp.Odev1.Customers;

import Gun3_OOPWithNLayeredApp.Odev1.Credits.ICreditManager;

public class CustomerManager {
    private Customer _customer;
    private ICreditManager _creditManager;
    public CustomerManager(Customer customer,ICreditManager creditManager){
        _customer = customer;
        _creditManager = creditManager;
    }
    public void Save(Customer customer){

        //System.out.println(_customer.name + " müsteri kaydedildi.");
    }

    public void Delete(){
        //System.out.println(_customer.name + " Müşteri silindi.");
    }

    public void GiveCredit(){
        _creditManager.calculate();
        System.out.println("Kredi verildi");
    }
}
