package day08_ifElseStatement;

import java.util.Scanner;

public class C03_SayiKontrol {

    public static void main(String[] args) {
        ////Soru 6) Kullanicidan iki sayi isteyin, sayilarin ikisi de pozitif ise sayilarin toplamini yazdirin,
        ////sayilarin ikisi de negative ise sayilarin carpimini yazdirin, sayilarin ikisi farkli
        ////isaretlere sahipse "farkli isaretlerde sayilarla islem yapamazsin" yazdirin,
        ////sayilardan sifira esit olan varsa "sifir carpmaya gore yutan elemandir" yazdirin.
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz"); // 1 mesaj 2 farkli girdi
        double sayi1= scan.nextDouble();
        double sayi2= scan.nextDouble();

        if(sayi1>0 && sayi2>0){
            System.out.println("girdiginiz iki sayi da pozitiv old toplami="+(sayi1+sayi2));


        }else if (sayi1<0 && sayi2<0){
            System.out.println("girdiginiz iki sayi da neg old toplami="+(sayi1*sayi2));


        }else if (sayi1*sayi2<0){
            System.out.println("farkli isaretlerde sayilarla islem yapamazsin");


        }else{
            System.out.println("sayilardan sifir varsa sifir yutan elemandir");
        }



    }
}
