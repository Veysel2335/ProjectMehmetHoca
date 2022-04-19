package day36_inheritance;

public class UstaBasi extends Isci {
    @Override
    public String toString() {
        return "UstaBasi{" +
                "isciStatu='" + isciStatu + '\'' +
                ", saatUcreti=" + saatUcreti +
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
        UstaBasi usbasi1=new UstaBasi();
        usbasi1.saatUcreti=15;
        usbasi1.isim="Murat";
        usbasi1.SoyIsim="Gokcek";
        usbasi1.maas= usbasi1.maasHesapla();
        usbasi1.statu="Isci";
        usbasi1.statu="ustabaci";
        System.out.println(usbasi1);

    }
}
