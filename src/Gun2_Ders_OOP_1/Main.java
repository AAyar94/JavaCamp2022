package Gun2_Ders_OOP_1;

public class Main {
    public static void main(String[] args){

        Product product1 = new Product();
        product1.setName("Delonghi Kahve Makinesi");
        product1.setDiscount(7);
        product1.setUnitPrice(7500);
        product1.setImageUrl("image1.jpg");
        product1.setUnitInStock(3);

        Product product2= new Product();
        product2.setName("Smeg Kahve Makinesi");
        product2.setDiscount(3);
        product2.setUnitPrice(4500);
        product2.setImageUrl("image2.jpg");
        product2.setUnitInStock(2);

        Product product3 = new Product();
        product3.setName("Kitchen Aid Kahve Makinesi");
        product3.setDiscount(5);
        product3.setUnitPrice(6500);
        product3.setImageUrl("image3.jpg");
        product3.setUnitInStock(5);

        Product[] products = {product1,product2,product3};

        System.out.println("<ul>");

        for (Product product: products) {
            System.out.println("<li>" + product.getName() + "</li>");
        }
        System.out.println("</ul>");



        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setPhone("05111111");
        individualCustomer.setCustomerNumber("12345");
        individualCustomer.setFirstName("Adem");
        individualCustomer.setLastName("Ayar");

        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setPhone("08501111111");
        corporateCustomer.setCustomerNumber("54862");
        corporateCustomer.setCompanyName("Java");
        corporateCustomer.setTaxNumber("1234567890");

        Customer[] customers = {individualCustomer,corporateCustomer};

    }

}
