package day09_ternary_Switch;

import java.util.Scanner;

public class C02_Ternary {
    public static void main(String[] args) {
        //Ternary ile yapilan tüm islemler if else ile de yapilabilir
        //if else yerine ternary tercih etme sebebi yapinin basit ve anlasilir olmassidri
        //Ternary icerisinde kompleks kodlar olmaz
        //sadece sonuc ve bizi sonuca göturen basit islemer olabilir

        //kullanicidan bir tam sayi alip tek cift yazdrian bir kod yazalim
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tam sayi giriniz");
        int sayi= scan.nextInt();
        if (sayi%2==0){
            System.out.println("Sayi cift");
        }else {
            System.out.println("Sayi tek");
        }
        System.out.println(sayi%2==0? "sayi cift":"sayi tek");// bu ternary mantigi
    }
}
