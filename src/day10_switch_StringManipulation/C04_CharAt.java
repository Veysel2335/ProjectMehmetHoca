package day10_switch_StringManipulation;

public class C04_CharAt {
    public static void main(String[] args) {
        //String de herhangi bir karakteri almak istedigimizde
        //o harfin indexini kullanarak
        // str.charAt(istenenIndex)yazabiliriz

        String str="Java Cok Guzel";
        //J yi yazdiralim
        System.out.println(str.charAt(0));

        // g yi yazdrimak
        System.out.println(str.charAt(9));

        //va yazdiralim
        System.out.println(str.charAt(2)+str.charAt(3));// aski degerleri girilir va
        //cOK yazdiralim
        System.out.println(str.toLowerCase().charAt(5));//Ok yazdir
        //son karakteri yazdir string de 14 harf var,son harfin indeksi 14-1
        System.out.println(str.charAt(14-1));//uzunluk-1

        //eger uzunlugu index olarak girersek
       // System.out.println(str.charAt(14)); girersek aralik disinda olur ve calismaz


    }
}
