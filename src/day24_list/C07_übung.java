package day24_list;

import java.util.ArrayList;
import java.util.List;

public class C07_übung {
    public static void main(String[] args) {
        //  1) Elemanlari A, C, E, ve F olan bir String ArrayList olusturup ekrana yazdiriniz.
//indexsiz add() methodunu kullanarak, B’yi ekleyiniz. index’li add() methodunu kullanarak,
// L’yi 1 numarali index’e ekleyiniz. ArrayList’i ekrana yazdiriniz, list goyle olmali; A, L, C, E, F, B.
        List<String> harfler = new ArrayList<>();
        harfler.add("A");
        harfler.add("C");
        harfler.add("E");
        harfler.add("F");
        harfler.add("B");
        harfler.add(1, "L");
        System.out.println(harfler);//[A, L, C, E, F, B]
        // //set() methodu kullanarak, E’yi D yapiniz. ArrayList’i ekrana yazdiriniz, list goyle olmali; A, L, C, D, F, B.
        // 4) remove() methodu kullanarak, F’yi siliniz. ArrayList’i ekrana yazdiriniz, list goyle olmali; A, L, C, D, B.
        harfler.set(3, "D");

        System.out.println(harfler);//[A, L, C, D, F, B]
        boolean sonuc = harfler.remove("F");
        if (sonuc == true) {
            System.out.println("istediginiz harf silindi");
        }
        System.out.println(harfler);//[A, L, C, D, B]
        //5) sort() methodu kullanarak, elemanlari alfabetik siraya diziniz. ArrayList’i ekrana yazdiriniz, list goyle olmali; A, B, C, D, L.


        // 6) contains() methodu kullanarak, L’nin list’de var oldugunu ve M’nin list’de var olmadigini dogrulayiniz.
        boolean sonuc2 = harfler.contains("L");
        if (sonuc2 == true) {
            System.out.println("aradiginiz sonuc listede mevcut");
        } else {
            System.out.println("aradiginiz deger listede degil");
        }
        sonuc2 = harfler.contains("M");
        if (sonuc2 == true) {
            System.out.println("aradiginiz sonuc listede mevcut");
        } else {
            System.out.println("aradiginiz deger listede degil");

            // 7) size() methodu kullanarak, list’in kag eleman oldugunu ekrana yazdiriniz.
            // 8) clear() methodu kullanarak, list’deki tum elemanlari siliniz. 9) isEmpty() methodu kullanarak, list’deki tum elemanlarin silindigini dogrulayiniz

        }
    }
}