package day11_stringManipulations;

import java.util.Locale;
import java.util.Scanner;

public class C04_length {
    public static void main(String[] args) {

        //kullanicidan ismini alip basharfini ve son harfini Buyuk harflerle yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String isim= scan.nextLine();
        System.out.println("ilk Harf:"+isim.toUpperCase(Locale.forLanguageTag("tr")).charAt(0));
        System.out.println("son harf:"+isim.toUpperCase(Locale.forLanguageTag("tr")).charAt(isim.length()-1));

        String str1="";
        System.out.println(str1.length());//0
        String str2=null;
        System.out.println(str2);
        //System.out.println(str2.length());//calisirsa hata verir

        String str3;
        //System.out.println(str3);

    }
}
