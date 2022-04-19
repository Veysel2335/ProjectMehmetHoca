package day11_stringManipulations;

import java.util.Locale;

public class C01_ToLowerCaseToUpperCase {
    public static void main(String[] args) {
        String str="Java Guzeldir";
        //Biz string methodlari arka arkaya kullanabiliriz
        //mesela ikinci kelimenin ilk harfini kucuk olarak yazdiralim
       // str.charAt(5) // boyle yadigimizda sonuc artik string degil char olacaktir.
        //str de yapmak istedigimiz tum degiskenleri once yap sonra charAt met kullan
        System.out.println(str.toLowerCase().charAt(5));
        System.out.println(str.toUpperCase(Locale.forLanguageTag("tr")));// turkce karakterli yazdirdi local ile

    }
}
