package day07_ifElseStatement;

import java.util.Scanner;

public class KareSorusu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen dikdörtgenin kenar uzunluklarını giriniz");
        int kenar1 = scan.nextInt();
        int kenar2 = scan.nextInt();
        if (kenar1 == kenar2) {
            System.out.println("uzunluklarını girdiginiz dikdortgen karedir");
        }  if (kenar1 != kenar2) {
            System.out.println("uzunluklarını girdiginiz dikdortgen kare degildir");
        }

    }
}
