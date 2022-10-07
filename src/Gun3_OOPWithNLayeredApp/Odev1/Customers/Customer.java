package Gun3_OOPWithNLayeredApp.Odev1.Customers;

public class Customer {
    public Customer(){
        System.out.println("Müsteri nesnesi başlatıldı.");
    }
    private int Id;
    public String name;
    public String lastName;
    public String nationalIdentity;

    public String city;



    //SOLID
    //S: SINGLE RESPONSIBILITY(tek sorumluluğu olan class


    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }
}
