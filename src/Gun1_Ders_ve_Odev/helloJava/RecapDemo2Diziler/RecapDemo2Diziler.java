package Gun1_Ders_ve_Odev.helloJava.RecapDemo2Diziler;

public class RecapDemo2Diziler {
    public static void main(String[] args){
        double[] mylist = {1.2,6.3,4.3,5.6};
        double total = 0;
        double max =mylist[0];


        for (double number:mylist){
            if (max<number){
                max = number;
            }
            total=total+number;
            System.out.println(number);
        }
        System.out.println("Toplam: " + total);
        System.out.println("En büyük Sayı: " + max);
    }
}
