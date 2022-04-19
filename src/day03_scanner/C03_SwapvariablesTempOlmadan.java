package day03_scanner;

import java.sql.SQLOutput;

public class C03_SwapvariablesTempOlmadan {

    ////verilen sayi 1 ve sayi2 variable degerlerini 3. bir variable kullanmadan degistiren swap program yaz  orn :sayi1:10 sayi2=20;
    //        //kod calistiktan sonra sayi1=20 sayi2=10
    public static void main(String[] args) {

        int sayi1=10;
        int sayi2=20;
        System.out.println ("Swap'dan önce sayi1:"+sayi1+",sayi2:"+sayi2);
        sayi1=sayi2;
        sayi2=10;
        sayi1=20;
        System.out.println("Swap'dan sonra sayi1:"+sayi1+",sayi2:"+sayi2);
    }


}

