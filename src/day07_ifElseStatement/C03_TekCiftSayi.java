package day07_ifElseStatement;

import java.util.Scanner;

public class C03_TekCiftSayi {
    public static void main(String[] args) {
        //kullanicidan bir tam sayi al ve sayinin tek veya cift old yazdir

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen Bir tam sayi giriniz");

        int sayi=scan.nextInt();
        if (sayi%2==0){

            System.out.println("Girilen sayi cifttir");

        }
        if (sayi%2!=0){

            System.out.println("girilen sayi tek ");
        }
        //normalde bir sayi tektir veya cifttir.diger secenek yoktur//o zaman tek olmasi ve cift olmasini 2 ayri if ile degil if else ile tek statement yapmak daha kolay
        //if else ile cözüm

        if(sayi%2==0){
            System.out.println("girdiginiz sayi cift");
        }else {
            System.out.println("girdiginiz sayi tek");
        }


    }



}
