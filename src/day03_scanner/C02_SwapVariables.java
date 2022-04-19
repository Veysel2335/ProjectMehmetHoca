package day03_scanner;

public class C02_SwapVariables {
    public static void main(String[] args) {

        //verilen sayi 1 ve sayi2 variable degerlerini degistiren swap program yaz  orn :sayi1:10 sayi2=20;
        //kod calistiktan sonra sayi1=20 sayi2=10

        int sayi1=10;
        int sayi2=20;
        System.out.println("Swap'dan önce sayi1:"+sayi1+",sayi2:"+sayi2);

        //1.adim:bos bir variable olusturup sayi 1 i ona atayalim
        int temp=sayi1;
        //2.adim sayi1e yeni degerini atayalim
        sayi1=sayi2;
        //3.adimsayi 2 ye tempe yedekledigimiz sayi 1 degerini atayalim
        sayi2=temp;
        System.out.println("Swap'dan sonra sayi1:"+sayi1+",sayi2:"+sayi2);
    }
}
