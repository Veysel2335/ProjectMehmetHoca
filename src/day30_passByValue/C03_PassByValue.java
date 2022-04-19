package day30_passByValue;

public class C03_PassByValue {
    public static void main(String[] args) {
        //java Pass By Value bir programlama dilidir
        //yani bir primitiv variable argument olarak bir meth yollarsaniz
        //java o variabli degil degerini (value) meth aktarir(pass)
        double etiketFiyati=100;
        yuzdeOnIndirimYap(etiketFiyati);
        yuzdeOnIndirimYap(etiketFiyati);
        System.out.println("iki indirimden sonra main method da etiket fiyati:"+etiketFiyati);
    }

    public static void yuzdeOnIndirimYap(double etiketFiyati) {
        etiketFiyati=etiketFiyati*0.90;

        System.out.println("Sizin icin %10 indirimli fiyatimiz:"+etiketFiyati);
    }
}
