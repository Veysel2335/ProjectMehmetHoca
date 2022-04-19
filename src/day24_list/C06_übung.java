package day24_list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C06_übung {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        List<String> isimListesi=new ArrayList<>();
        List<String> soyIsimListesi=new ArrayList<>();
        List<Integer> numaraListesi=new ArrayList<>();
        List<Integer> notListesi=new ArrayList<>();

        for (int i = 0; i <3 ; i++) {
            System.out.println("Lutfen ogrenci ismini giriniz");
            String isim= scan.next();
            isimListesi.add(i,isim);
            System.out.println("");

            System.out.println("Lutfen ogrencinin soy ismini giriniz");
            String soyIsim= scan.next();
            soyIsimListesi.add(i,soyIsim);
            System.out.println("");

            System.out.println("Lutfen ogrenci numarasini giriniz");
            int numara=scan.nextInt();
            numaraListesi.add(i,numara);
            System.out.println("");

            System.out.println("Lutfen ogrenci notunu giriniz");
            int not=scan.nextInt();
            notListesi.add(i,not);
            System.out.println("");

        }
        System.out.println("Ogrenci not listesi");
        for (int i = 0; i <3 ; i++) {
            System.out.println(+numaraListesi.get(i)+
                    " "+isimListesi.get(i)+" "+soyIsimListesi.get(i)+" "+notListesi.get(i));

        }

    }
}
