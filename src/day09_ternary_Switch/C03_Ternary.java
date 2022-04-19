package day09_ternary_Switch;

public class C03_Ternary {
    public static void main(String[] args) {
        int sayi=140;
        //verilen sayinin 3 veya daha cok basaamkli olup olmadigini kont eden ve sonucu yazd bir tern olusturun

        String sonuc=sayi>=100 ?"Sayi 3 basamakli veya daha büyük":"sayi negatif veya 3 basamaktan kucuk";

        //ternary bize sonuc dondurdugu icin
        //ya bu sonucu direk yazdirmaliyiz
        //ya da sonucun uygun bir variable atama yapabiliriz
        System.out.println("girdiginiz sayi analizi:"+sonuc);
    }
}
