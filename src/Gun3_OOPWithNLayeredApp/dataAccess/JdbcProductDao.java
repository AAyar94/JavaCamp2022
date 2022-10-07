package Gun3_OOPWithNLayeredApp.dataAccess;

import Gun3_OOPWithNLayeredApp.entities.Product;


public class JdbcProductDao implements ProductDao{
        public void add(Product product){
                //Sadece db erişim kodları yazılır.SQL ogrenilecek!
                System.out.println("JDBC ile veritabanına eklendi.");

        }
}