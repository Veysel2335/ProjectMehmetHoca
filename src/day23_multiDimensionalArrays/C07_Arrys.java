package day23_multiDimensionalArrays;

import java.util.Scanner;

public class C07_Arrys {
    public static void main(String[] args) {
        //kullanicidan bir cumle isteyin ve cumledeki kelime sayisini yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle= scan.nextLine();

        String arr[]=cumle.split(" ");
        System.out.println("Girdiginiz kelime sayisi:"+arr.length);

    }
}
