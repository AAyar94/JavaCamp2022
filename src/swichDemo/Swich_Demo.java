package swichDemo;

public class Swich_Demo {
    public static void main(String[] args){
        char grade = 'C';

        switch (grade){
            case 'A':
                System.out.println("Mükemmel: Geçtiniz");
                break;
            case 'b':
                System.out.println("Çok güzel: Geçtiniz");
                break;
            case 'C':
                System.out.println("İyi:Gectiniz");
                break;
            case 'D':
                System.out.println("Fena degil:Geçtiniz");
                break;
            case 'F':
                System.out.println("Malesef Kaldınız");
                break;
            default:
                System.out.println("Geçersiz not girdiniz");

        }
    }
}
