package day07_ifElseStatement;

import java.util.Locale;
import java.util.Scanner;

public class C04_HaftaIciHaftaSonu {

    public static void main(String[] args) {
        //kullanicdan gün ismi al hafta ici veya sonuyazdir
        //string icin equal met kullan

        //pazar veya c tesi ise===haftasonu
        //p tesi sali carsampa pers cuma ==hafta ici

        //String case sensitivdir
        //yani pazar PAZAR ,PaZaR hepsi farkli kelimelerdir
        //bu durumda string met yardim alacaz

        Scanner  scan=new Scanner(System.in);
        System.out.println("Lütfen Gün Ismini Yaziniz");
        String gunIsmi=scan.next().toLowerCase();//line niye yazmadik cunku iki sismli gün yok //ne girilirse girilsin kücük harf verecek bize

        if (gunIsmi.equals("pazar") || gunIsmi.equals("cumartesi")) {

            System.out.println("girdiginiz gun haftasonu");
        }

        if (gunIsmi.equals("pazartesi") || gunIsmi.equals("sali") || gunIsmi.equals("Carsamba") || gunIsmi.equals("persembe") || gunIsmi.equals("Cuma")) {
            System.out.println("Girdiginiz gun haftaici");
        }





    }
}
