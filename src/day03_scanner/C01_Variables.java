package day03_scanner;

import java.sql.SQLOutput;

public class C01_Variables {

    public static void main(String[] args) {
        //farkli 3 data turunde variable olutruan ve bunlari yazdirin
        String okulIsmi="Yildiz Koleji";
        System.out.println("Yildiz Koleji");

        char ilkHarf;
        ilkHarf = 'H';
        System.out.println(ilkHarf);//h

        int sayi1=10;
        int sayi2=20;
        System.out.println(sayi1+sayi2);//30

        String isim="Nezir";
        String SoyIsim="Yildiz";
        System.out.println("Isminiz :" + isim);
        System.out.println("SoyIsminiz:" + SoyIsim);


        //iki farkli tamsayi data turunde 2 variable olut ve topl yazdirin
        short sayi3=20;
        double sayi4=30;
        System.out.println("iki sayinin toplami:" +(sayi3+sayi4));//50


        //charda bir verable turu olut

        char ozelKarakter='#';
        System.out.println(ozelKarakter);
        //bir tam sayi bir de char olut ve gtopla
        int sayi5=20;
        char harf='a';
        System.out.println(sayi5+harf);//117
        // char data turunde degislkenler mat islemlerde kullanilirsa o char degerinin Ascii nosu kullanilir

        int sayi6='a'; //97

        System.out.println("Sayi");



    }
}
