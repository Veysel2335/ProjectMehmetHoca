package day38_inheritance_overriding;

public class Isci extends Personel{
    public String statu = "Isci";
    public String haklar = "Isciler kidem alir";
    public String ikramiye="Isciler yilda 1 ikramiye alir";

    public void mesai() {
        System.out.println("Tum isciler  haftalik 40 saat calisir");
    }

    public void maasHesapla() {
        System.out.println("Isciler 30 gun *8 saat*111 euro=" + (30 * 8 * 11) + "euro maas alir");
    }

}