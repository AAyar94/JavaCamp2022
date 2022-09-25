package Gun2_Ders_OOP_1_ve_Odev.PolymorphismDemo;

public class Main {
    public static void main(String[] args){
    /*    BaseLogger[] loggers = new BaseLogger[]{new FileLogger(),new EmailLogger(),new DatabaseLogger(),new ConsoleLogger()};


        for (BaseLogger logger:loggers){
            logger.Log("Log Mesajı");*/


        CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
        customerManager.add();
        }
    }

