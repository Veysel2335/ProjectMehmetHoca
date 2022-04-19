package day04_dataCasting_Increament;

import java.util.Scanner;

public class C01_Scanner {
    public static void main(String[] args) {
        //Kullanicidan isim alip bas harfi yazdirma

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen Isminizi giriniz");
        char ilkHarf=scan.next().charAt(0); //charAt indexs metodu parametre olrk yazdigimiz index chari bize getirir
        System.out.println("Girdiginiz ismin ilk harfi:"+ilkHarf);
    }
}
