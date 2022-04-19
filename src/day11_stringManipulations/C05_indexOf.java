package day11_stringManipulations;

import java.util.Scanner;

public class C05_indexOf {
    public static void main(String[] args) {
        String str1="Java bir baska guzel valla cok guzel";
        //istersek char olarak verdigimiz bir harfin indexini bize dondurur
        System.out.println(str1.indexOf('J'));//0


        //istersek bir harf ya da metin olarak verdigimiz Stringin indexini dondurur
        System.out.println(str1.indexOf("l"));//19
        System.out.println(str1.length()-1);//
        System.out.println(str1.indexOf("aska"));//10
//ayni harften birden fazla varsa
        System.out.println(str1.indexOf("b"));//5 buldugu ilk dogru eslesmenin indexini verir

         System.out.println(str1.indexOf('b',5));//5
        //verilen strindeki 2.a harfinin indexini bulalim
        int ilkindex=str1.indexOf('a');//1
        System.out.println(str1.indexOf('a',ilkindex+1));//3

        //verilen strindeki 2.b harfinin indexini bulalim
        int ilkbindex =str1.indexOf('b');//5
        System.out.println(str1.indexOf('b',ilkbindex+1));//9

//20.index sonra guzel
        System.out.println(str1.indexOf("guzel",20));//31 2.guzel
//strinde olmayan bir harf aratsak
        System.out.println(str1.indexOf("y"));//y yok demesi lazim ama return type i index  -1//
        //yok demenin sayisal karsiligi olarak java -1 verir
//kullanicidan mail adresini isteyin @ isareti icermiyorsa gecersiz yazdir
        //iceriyorsa amil kabul eildi

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen malilinizi yazin");
        String mail= scan.next();
        if (mail.indexOf("@")==(-1)){
            System.out.println("gecersiz");

        }else {
            System.out.println("mailiniz kabul eildi");
        }

    }
}
