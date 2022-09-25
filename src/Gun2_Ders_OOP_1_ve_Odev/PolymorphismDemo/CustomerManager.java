package Gun2_Ders_OOP_1_ve_Odev.PolymorphismDemo;

import java.util.logging.Logger;

public class CustomerManager {
    private BaseLogger logger;

    public CustomerManager(BaseLogger logger){
        this.logger = logger;
    }
    public void add(){


        System.out.println("Müşteri Eklendi");
        this.logger= logger;
        /*DatabaseLogger logger =new DatabaseLogger();

        logger.Log("Log mesaji");*/

        //Bagımlı sistemlerde görülür.
    }

}
