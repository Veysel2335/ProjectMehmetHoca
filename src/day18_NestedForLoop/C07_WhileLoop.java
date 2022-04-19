package day18_NestedForLoop;

import java.util.Scanner;

public class C07_WhileLoop {
    public static void main(String[] args) {
        //kullanicdan kac sayi toplamak istedigini alin
        //ve bu sayilari alin ve bu sayilarin toplamini ekrana yazdirin
        int sayiadedi=3;
        Scanner scan=new Scanner(System.in);
        int sayi=0;
        int toplam=0;


        for (int i = 1; i <=sayiadedi ; i++) {
            System.out.println("lutfen bir sayi giriniz");
            sayi=scan.nextInt();
            toplam+=sayi;

        }
        System.out.println("girilen "+sayiadedi+"sayinin toplami:"+toplam);


        //while ile yapalim

        sayi=0;
        toplam=0;
        int sayac=1;
        while (sayac<=sayiadedi){
            System.out.println("lutfen bir sayi giriniz");
            sayi=scan.nextInt();
            toplam+=sayi;
            sayac ++;

        }
        System.out.println("girilen "+sayiadedi+"sayinin toplami:"+toplam);
    }
}
