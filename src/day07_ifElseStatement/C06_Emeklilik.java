package day07_ifElseStatement;

import java.util.Scanner;

public class C06_Emeklilik {

    public static void main(String[] args) {
        //kullanicidan yas iste 65 veya daha büyükw3 emekli

        //7765 den kucukse emekli olamazsin

       Scanner scan=new Scanner(System.in);
        System.out.println("lutfen yasinizi giriniz");
        int yas= scan.nextInt();

        if (yas>=65){

            System.out.println("emekli olablirsin");

        } else {
            System.out.println("emekli olamazsin");
            System.out.println(65-yas+"sene daha calismalisini");
        }
    }
}
