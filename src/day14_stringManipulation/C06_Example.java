package day14_stringManipulation;

import java.util.Scanner;

public class C06_Example {
    public static void main(String[] args) {
        //how to find index of initial of last name
        //ex ali can (ac) mary star ms
        Scanner scan=new Scanner(System.in);
        System.out.println("bir isim soyisim giriniz");
        String isimSoyisim1= scan.nextLine();
        String str = null;
        String isimSoyisim=str.substring(0,1);

        int index=str.indexOf(" ")+1;
    //    String isimSoyisim=str.substring(isimSoyisim1,isimSoyisim1+1);


    }
}
