package day13_stringManipulation;

import com.sun.source.tree.IfTree;

public class C02_substring {
    public static void main(String[] args) {
        //1-48 of 104 result for "nutella"
        //bu arama sonucunda ki bulunan sonuc sayisi 100 den cok ise super
        //az ise "az sonuc bulundu"

        String str="1-48 of 104 result for \"nutella\"";
        int ilkSpace=str.indexOf(" ");//4
        int ikinciSpace=str.indexOf(" ",ilkSpace+1);
        int ucuncuSpace=str.indexOf(" ",ikinciSpace+1);

        String aramaSonucSyisiStr=str.substring(ikinciSpace+1,ucuncuSpace);
        System.out.println(aramaSonucSyisiStr);
        int aramaSonucSayisiInt=Integer.valueOf(aramaSonucSyisiStr);
        if ((aramaSonucSayisiInt>100)){
            System.out.println("Super");

        }else {
            System.out.println("az sonuc");

        }

    }
}
