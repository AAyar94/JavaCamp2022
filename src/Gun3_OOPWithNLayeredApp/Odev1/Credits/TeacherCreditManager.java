package Gun3_OOPWithNLayeredApp.Odev1.Credits;

public class TeacherCreditManager extends BaseCreditManager implements ICreditManager {
    @Override
    public void calculate() {
        System.out.println("Ögretmen kredisi hesaplandı.");
    }

    public void save(){
        System.out.println("Virtual takısı ,java da varsayılan olarak varmış,ben videoyu durdurup virtual ide de cıkmıyor diye bakmıştım.Öğrenmiş oldum.");
    }


}
