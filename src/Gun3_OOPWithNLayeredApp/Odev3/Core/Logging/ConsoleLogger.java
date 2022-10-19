package Gun3_OOPWithNLayeredApp.Odev3.Core.Logging;

public class ConsoleLogger implements ILogging{
    @Override
    public void log() {
        System.out.println("Console a loglandı");
    }
}
