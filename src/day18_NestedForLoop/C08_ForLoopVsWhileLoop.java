package day18_NestedForLoop;

import java.util.Scanner;

public class C08_ForLoopVsWhileLoop {
    public static void main(String[] args) {
        //kullanicidan toplamak isgtedigi sayilari alip
        //kullanici 0 basana kadar devam edin.0 a basinca girdigi tüm sayilarin toplamini yazdirin


        Scanner scan=new Scanner(System.in);
        int sayi=0;
        int toplam=0;
        for (int i = 1; i <100000 ; i++) {
            System.out.println("lutfen bir sayi giriniz");
            sayi=scan.nextInt();
            if (sayi==0){
                break;
            }else {
                toplam+=sayi;
            }
            System.out.println(toplam);

        }

        //while ile yapimi

        // basl bitisnet  durumlarda for loop daha iyi.ama belli degilse whilekullan mntkli
        sayi=1;
        toplam=0;

        while (sayi!=0){
            System.out.println("lutfen bir sayi giriniz");
            sayi=scan.nextInt();
            toplam+=sayi;
        }
        System.out.println(toplam);
    }
}
