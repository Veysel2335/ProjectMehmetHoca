package day38_inheritance_overriding;

public class UstaBasi extends Isci {
    public String statu = "Ustabasi";
    public String haklar = "Ustabasi haftada 1 gun ekstra tatili vardir";
public String izin="Tum personel yilda 4 hafta izin kullanabilir";
    public void mesai() {
        System.out.println("Ariza varsa usta ekstra ucret almadan calisir");
    }

    public void maasHesapla() {
        System.out.println("ustabasi 30 gun *8 saat*12 euro=" + (30 * 8 * 12) + "euro maas alir");
    }

    public static void main(String[] args) {
        //icinde oldugumuz classdan klasik haliyle bor obje olusturursak o obje ile cagirdigimiz variabl ve methodlarda java once
        //icinde bulundugumuz clasa bakar .aradigimiz class uyesi icinde old class da varsa bize onu getirir
        //yoksa;parent classlara bakar ilk buldugunu getirir
        UstaBasi yasin=new UstaBasi();
        System.out.println(yasin.statu);//Ustabasi
        System.out.println(yasin.haklar);//"Ustabasi haftada 1 gun ekstra tatili vardir";

        System.out.println(yasin.ikramiye);//Isciler yilda 1 ikramiye alir
        System.out.println(yasin.izin);//Tum personel yilda 4 hafta izin kullanabilir
        yasin.maasHesapla();
        yasin.mesai();
        //eger isci olarak ozelliklerini gormek istersek
        Isci ahmet=new UstaBasi();
        System.out.println(ahmet.statu);//Isci
        System.out.println(ahmet.haklar);//isciler kidem tazm alir
        System.out.println(ahmet.ikramiye);//"Isciler yilda 1 ikramiye alir";
        System.out.println(((UstaBasi) ahmet).izin);//Tum personel yilda 4 hafta izin kullanabilir
ahmet.maasHesapla();
ahmet.mesai();
//bir objeyi hangi clastan tanimlarsaniz o klasa ait ozelliklre sahip olur

Personel adem=new UstaBasi();

        System.out.println(adem.statu);//Isci
        System.out.println(adem.haklar);//turm pers esit haklara sahip
      //  System.out.println(adem.ikramiye);//cte verir
        System.out.println(((UstaBasi) adem).izin);//Tum personel yilda 4 hafta izin kullanabilir
adem.maasHesapla();
adem.mesai();

    }
}