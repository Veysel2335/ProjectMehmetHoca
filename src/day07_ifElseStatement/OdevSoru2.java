package day07_ifElseStatement;

import java.util.Scanner;

public class OdevSoru2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("günün ilk harfini giriniz");
        String p= "gün Pazartesi, Pazar ya da Persembe'dir.";
        String s= "gün Sali'dir.";

        String harf = scan.nextLine();
        if (harf.equals("p")) {
            System.out.println(p);
        }
        else if(harf.equals("s")) {

            System.out.println(s);
        }
        else { System.out.println("baska gundur");}


    }
    }

