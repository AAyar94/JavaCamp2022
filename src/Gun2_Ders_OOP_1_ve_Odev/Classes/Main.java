package Gun2_Ders_OOP_1_ve_Odev.Classes;

public class Main{

    public static void main(String[] args){

        CustomerManager customerManager = new CustomerManager();

        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();


        int sayi1 =10;
        int sayi2=20;
        sayi2=sayi1;
        sayi1=30;

        System.out.println(sayi2);

        int[] sayilar1 = new int[]{1,3,5,6};
        int[] sayilar2 = new int[]{2,4,5,8};

        sayilar2=sayilar1;
        sayilar1[0]=10;
        System.out.println(sayilar2[0]);

    }


}


