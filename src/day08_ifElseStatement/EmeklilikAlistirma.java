package day08_ifElseStatement;

import java.util.Scanner;

public class EmeklilikAlistirma {
    public static void main(String[] args) {
        //Eger calisan kadinsa 60 yasindan buyuk oldugunda emekli olabilir, calisan erkekse 65 yasindan buyukse emekli olabilir
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi yaziniz" + "\nKadin icin K \nErkek icin E harf giriniz");
        char cinsiyet = scan.next().toUpperCase().charAt(0);
        System.out.println("Lütfen yasinizi girin");
        double yas = scan.nextDouble();
        if (cinsiyet == 'K') {
            if (yas<0||yas>120){
                System.out.println("Lutfen girdiginiz yas degerini kontrol edin");
            }else if (yas<60){
                System.out.println("emekli olamaizsin\n daha "+(60-yas)+"yil calisman gerekir");
            }else {
                System.out.println("emekli olablirsin");
            }

        } else if (cinsiyet == 'E') {
            if (yas<0||yas>120){
                System.out.println("Lutfen girdiginiz yas degerini kontrol edin");

        }else if (yas<65){
                System.out.println("emekli olamaizsin\n daha "+(65-yas)+"yil calisman gerekir");

        }else {
                System.out.println("emekli olablirsin");
            }


    }else {
            System.out.println("Lutfen cinsiyet icin gecerli bir harf giriniz");
        }
    }


}
