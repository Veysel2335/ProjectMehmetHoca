package day14_stringManipulation;

import java.util.Locale;

public class c04_isimGizleme {
    public static void main(String[] args) {
        //Kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin ve asagidaki gibi yazdirin
        //        isim-soyisim : M***** B*******
        //        kart no : **** **** **** 1234

        String isim="Oguzhan";
        String soyisim="BALKAYA";
        String kKno="1234567890123456";

        String yeniIsim=isim.substring(0,1).toUpperCase()+
                         isim.substring(1).replaceAll("\\S","*");
        String yeniSoyisim=soyisim.substring(0,1).toUpperCase()+
                soyisim.substring(1).replaceAll("\\S","*");

        String yeniKkno="**** **** **** "+kKno.substring(12);

        System.out.println("isim-soyisim:"+yeniIsim+" "+yeniSoyisim +"kart no :"+yeniKkno);



    }
}
