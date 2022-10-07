package Gun3_OOPWithNLayeredApp.business;

import Gun3_OOPWithNLayeredApp.core.logging.Logger;
import Gun3_OOPWithNLayeredApp.dataAccess.ProductDao;
import Gun3_OOPWithNLayeredApp.entities.Product;


import java.util.List;

public class ProductManager {

    private ProductDao productDao;
    private Logger[] loggers;

    public ProductManager(ProductDao productDao,Logger[] loggers) {
        this.productDao = productDao;
        this.loggers =loggers;
            }

    public void add(Product product) throws Exception {
        //business rules section
        if(product.getUnitPrice()<10){
            throw new Exception("Ürün fiyatı 10'dan küçük olamaz.");
        }

        //HibernateProductDao productDao = new HibernateProductDao();
        //Bu yöntem de yazılımı Hibernate bağımlı hale getirir.

        //ProductDao productDao = new JdbcProductDao();
        //interface kendini imlement eden sınıfların

        //bir katman başka bir katmanın clasını kullanıyorken sadece interface üzerinden erişim kurmalıdır.
        productDao.add(product);

        for(Logger logger: loggers){
            logger.log(product.getName());
        }

    }
}
