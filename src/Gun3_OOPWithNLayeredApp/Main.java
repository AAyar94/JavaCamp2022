package Gun3_OOPWithNLayeredApp;

import Gun3_OOPWithNLayeredApp.business.ProductManager;
import Gun3_OOPWithNLayeredApp.core.logging.DatabaseLogger;
import Gun3_OOPWithNLayeredApp.core.logging.FileLogger;
import Gun3_OOPWithNLayeredApp.core.logging.Logger;
import Gun3_OOPWithNLayeredApp.core.logging.MailLogger;
import Gun3_OOPWithNLayeredApp.dataAccess.HibernateProductDao;
import Gun3_OOPWithNLayeredApp.entities.Product;


public class Main {
    public static void main(String[] args) throws Exception {
        Product product1 = new Product(1,"IPhone Xr",9999);

        Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};

        ProductManager productManager = new ProductManager(new HibernateProductDao(),loggers);
        productManager.add(product1);

    }
}
