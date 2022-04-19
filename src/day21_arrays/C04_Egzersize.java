package day21_arrays;

import java.util.Scanner;

public class C04_Egzersize {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen kaydetmek istediginiz ogrencinin ismini giriniz");
        String[] isimler;
        isimler = new String[5];
        isimler[0] = scan.nextLine();
        System.out.println("Lutfen kaydetmek istediginiz ogrencinin soy ismini giriniz");
        String[] soyIsimler;
        soyIsimler = new String[5];
        soyIsimler[0] = scan.nextLine();
        for (int i = 1; i < 5; i++) {
            System.out.println("Lutfen diger ogrencinin ismini giriniz");
            isimler[i] = scan.nextLine();
            System.out.println("Lutfen diger ogrencinin soy ismini giriniz");
            soyIsimler[i] = scan.nextLine();

        }

        System.out.println("Sinif Listesi su sekildedir");


        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + "- " + isimler[i] + " " + soyIsimler[i]);

        }
    }
}