package day07_ifElseStatement;

import java.util.Scanner;

public class odev2Musluman {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir gun giriniz");
        String gunIsmi=scan.next().toLowerCase();
        if (gunIsmi.equals("cuma")){
            System.out.println("muslumanlar ıcın kutsal gun");
        }else if (gunIsmi.equals("cumartesi")){
            System.out.println("yahudiler ıcın kutsal gun");
        }else if(gunIsmi.equals("pazar")) {
            System.out.println("hristiyanlar ıcın kutsal gun");
        }else {
            System.out.println("hatali giris");
        }
    }
}
