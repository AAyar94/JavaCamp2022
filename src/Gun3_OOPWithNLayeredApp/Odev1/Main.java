package Gun3_OOPWithNLayeredApp.Odev1;


import Gun3_OOPWithNLayeredApp.Odev1.Credits.TeacherCreditManager;
import Gun3_OOPWithNLayeredApp.Odev1.Customers.Customer;
import Gun3_OOPWithNLayeredApp.Odev1.Customers.CustomerManager;

public class Main {
    public static void main(String[] args) {
        /*Odev1.Credits.CreditManager creditManager = new Odev1.Credits.CreditManager();
        creditManager.calculate();
        creditManager.save();

        Odev1.Persons.Customer customer = new Odev1.Persons.Customer();
        customer.setId(1);
        customer.name="Adem";
        customer.lastName="Ayar";
        customer.nationalIdentity="1234567890";
        customer.city="Ankara";

        Odev1.Persons.CustomerManager manager = new Odev1.Persons.CustomerManager(customer);
        manager.Save(customer);
        manager.Delete();

        Odev1.Persons.Company company = new Odev1.Persons.Company();
        company.taxNumber="12345";
        company.companyName="ABCDE";
        company.setId(123456);

        Odev1.Persons.CustomerManager manager1 = new Odev1.Persons.CustomerManager(new Odev1.Persons.Person());

        Odev1.Persons.Person person = new Odev1.Persons.Person();
        person.name="Xkisisi";
        person.nationalIdentity="ABC";

        Odev1.Persons.Customer c1 = new Odev1.Persons.Customer();
        Odev1.Persons.Customer c2 = new Odev1.Persons.Person();
        Odev1.Persons.Customer c3 = new Odev1.Persons.Company();    */

        //Odev1.Persons.CustomerManager manager = new Odev1.Persons.CustomerManager(new Odev1.Persons.Customer(),new Odev1.Credits.MilitaryCreditManager());
        CustomerManager manager = new CustomerManager(new Customer(),new TeacherCreditManager());

        manager.GiveCredit();
    }
}