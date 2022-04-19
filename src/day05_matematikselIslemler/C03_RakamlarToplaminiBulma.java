package day05_matematikselIslemler;

import java.util.Scanner;

public class C03_RakamlarToplaminiBulma {
    public static void main(String[] args) {
        //kullanicidan aldiginiz dört basamakli bir sayinin basamak toplamini bulunuz
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 4 basamakli bir sayi giriniz");
        int sayi=scan.nextInt();


        int rakam=0;
        int rakamlarToplami=0;  //sayi örnek 7532
        rakam=sayi%10;// 2
        rakamlarToplami+=rakam;//2
        sayi/=10;//753
        //2.adim sayi=2rt=2 sayi 753

        rakam=sayi%10;//3
        rakamlarToplami+=rakam;//5
        sayi/=10;//75


        //3.adim r=3 rt=5 sayi=75
        rakam=sayi%10;//5
        rakamlarToplami+=rakam;//10
        sayi/=10;//7

        rakam=sayi%10;//7
        rakamlarToplami+=rakam;//17
        sayi/=10;//0

        System.out.println("girdiginiz sayinin rakamlar toplami"+rakamlarToplami);




    }

}
