package day42_exceptions;

import java.util.Scanner;

public class C03_IllegalArgumentException {
    public static void main(String[] args) {
        //kullanicidan yasini istexin.Kullanici yas olarak neg bir sayi ,0 veya,120 den buyuk sayi girerse
        //illegalargexp olusacak sekilde bir program ya^ziniz
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
        int yas= scan.nextInt();
        if (yas<=0 || yas>120){
           // System.out.println("lutfen gecerli bir yas giriniz");
            throw new IllegalArgumentException();

        }else {
            System.out.println("uygun yas girdiniz");
        }

    }
}
