package day07_ifElseStatement;

import java.util.Locale;
import java.util.Scanner;

public class C05_IfElseHaftaninGunleri {

    public static void main(String[] args) {
        //kullanicdan gün ismi al hafta ici veya sonuyazdir
        //string icin equal met kullan

        //pazar veya c tesi ise===haftasonu
        //p tesi sali carsampa pers cuma ==hafta ici



        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Gün Ismini Yaziniz");
        String gunIsmi= scan.next().toUpperCase();

        if (gunIsmi.equals("PAZAR") || gunIsmi.equals("CUMARTESI")) {

            System.out.println("girdiginiz gun haftasonu");
        } else {
            System.out.println("girdiginiz gun haftaici");
        }




        }

        }




