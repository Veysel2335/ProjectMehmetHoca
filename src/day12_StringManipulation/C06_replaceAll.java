package day12_StringManipulation;

import java.util.Scanner;

public class C06_replaceAll {
    public static void main(String[] args) {
        //kullanicidan isim soyisim al
        //butun harfleri * yap

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen adinizi soyadinizi giriniz");
        String isimSoyisim= scan.nextLine();
        System.out.println(isimSoyisim.replaceAll("\\S","*"));
    }
}
