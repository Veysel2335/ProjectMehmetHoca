package day23_multiDimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class C12_Ubung {
    public static void main(String[] args) {
        //Kullanicidan bir cumle isteyin ve cumledeki kelime sayisini yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle=scan.nextLine();
        String kelime[]=cumle.split("");
        String harf[]=cumle.split("");
        System.out.println(Arrays.toString(kelime));
        System.out.println("Girdiginiz cumle "+kelime.length+" kelime icermektedir");
        System.out.println("Girdiginiz cumle "+harf.length+" karakter icermektedir");


    }
}
