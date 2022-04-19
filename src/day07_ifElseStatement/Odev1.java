package day07_ifElseStatement;

import java.util.Scanner;

public class Odev1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz");
        String gunIsmi = scan.next().toUpperCase();
        if (gunIsmi.equals("P")) {
            System.out.println("Girilen gun pazar ,pazartesi ,persembe");


        }else if (gunIsmi.equals("S")){
            System.out.println("Girilen gun sali");

        } else {
            System.out.println("hatali giris");
        }
    }
}