package Gun3_OOPWithNLayeredApp.dataAccess;

import Gun3_OOPWithNLayeredApp.entities.Product;


public interface ProductDao {
    void add(Product product);
    //Interfaceler sadece method imzasını barındırabilir.
    //implement içeren classlar buradaki methotları içermek zorundadır.

}
