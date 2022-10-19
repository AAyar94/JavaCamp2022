package Gun3_OOPWithNLayeredApp.Odev3.Core.Logging;

public class FileLogger implements ILogging{
    @Override
    public void log() {
        System.out.println("Dosyaya Loglandı");
    }
}
