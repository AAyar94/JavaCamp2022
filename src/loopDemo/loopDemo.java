package loopDemo;

public class loopDemo {
    public static void main(String[] args){
        //For Döngüsü
        for (int i = 0;i<10;i++){
            System.out.println(i);
        }
        System.out.println("For Döngüsü tamamlandı");

        int i = 1;

        while (i<10) {
            System.out.println(i);
            i++;
        }
        System.out.println("While Döngüsü tamamlandı");

        int a = -2;
        do {
            System.out.println(a);
            a+=2;
        }
        while (a<10);
        System.out.println("Do-While döngüsü tamamlandı");

    }

}
