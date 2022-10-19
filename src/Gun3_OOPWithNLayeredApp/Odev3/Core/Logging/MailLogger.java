package Gun3_OOPWithNLayeredApp.Odev3.Core.Logging;

public class MailLogger implements ILogging{
    @Override
    public void log() {
        System.out.println("Mail ile loglandı");
    }
}
