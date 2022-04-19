package day36_inheritance;

public class Memur extends Muhasebe{
    @Override
    public String toString() {
        return "Memur{" +
                "saatUcreti=" + saatUcreti +
                ", statu='" + statu + '\'' +
                ", maas=" + maas +
                ", personelNo=" + personelNo +
                ", isim='" + isim + '\'' +
                ", SoyIsim='" + SoyIsim + '\'' +
                ", Adresm='" + Adresm + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Memur memur1=new Memur();
        //memur1 obj memur classinin obj olmasina ragmen inharit ettigi muhasebe ve onunda parenti olan personel
        //classlarindaki tum datalari alabilir

        //taamini pers clasindan aldik
        memur1.personelNo=1001;
        memur1.isim="Ahmet";
        memur1.SoyIsim="Tepecik";
        memur1.Adresm="Ankara";
        memur1.tel="0232255";

        //muhasabedeb aliyrz
        memur1.saatUcreti=10;
        memur1.maas= memur1.maasHesapla();
        memur1.statu="Memur";
        System.out.println(memur1);

        Memur memur2=new Memur();
        memur2.personelNo=1002;
        memur2.saatUcreti=10;
        memur2.maas= memur2.maasHesapla();
        System.out.println(memur2);
        //atamadiklarimiz null veya karaket olarak gelir



    }

}
