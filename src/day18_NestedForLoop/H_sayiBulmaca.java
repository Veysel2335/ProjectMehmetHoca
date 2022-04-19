package day18_NestedForLoop;

import java.util.Random;
import java.util.Scanner;

public class H_sayiBulmaca {
    //pc ye 1 ile 100 arasinda bir sayi tutturun

    // kullanicidan bu sayiyi tahmin etmesini iste
    //girilen her tahminda sayiyi büyüt veya kucult kullaniciya yol gosterin
    //kullanici sayiyi kac tahminde buldugunu kullaniciya yazdirin
    int baslangic=1;
    int bitis =100;

    public static void main(String[] args) {
        Random rnd=new Random();
        int sayi= rnd.nextInt(100);//100 den kucuk rastgele bir sayi olustur
        Scanner scan=new Scanner(System.in);
        int tahmin=0;
        int sayac=1;

        while (sayi!= tahmin){
            System.out.println("Lutfe bir sayi giriniz");
            tahmin= scan.nextInt();
            if (tahmin>sayi){
                System.out.println("Daha kucuk bir sayi soylemelsin");

            }else if (tahmin<sayi){
                System.out.println("Daha buyuk bir sayi soylemelsin");
            }
            sayac ++;

        }
        System.out.println("Tuttugum sayiyi "+sayac+" tahminde buldunuz");

    }

    }


