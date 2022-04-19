package day03_scanner;

import java.util.Scanner;

public class C04_Scanner {

    public static void main(String[] args) {

        //Scanner kullanmak icin 3 adim;
        // bir scanner olustur
        Scanner scan = new Scanner(System.in);
        //ikinci kullanicidan istedigimiz degeri girmesi icin aciklayici bir bilgi yazdir
        System.out.println(("Lutfen isminizi giriniz"));

        //3.adim kullanicinin girdigi degeri uygun variabke olustur kaydet
       // String kullaniciIsmi= scan.next();   //yazdigimiz ilk degeri aliriz
        String kullaniciIsmi=scan.nextLine();  //satirsonuna kadar girilen tüm degerleri alir
        System.out.println("Kullanicinin girdigi isim:"+kullaniciIsmi);



    }
}
