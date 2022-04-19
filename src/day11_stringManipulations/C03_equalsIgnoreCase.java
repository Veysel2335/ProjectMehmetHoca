package day11_stringManipulations;

import java.util.Scanner;

public class C03_equalsIgnoreCase {
    public static void main(String[] args) {

        //kullaniciya derse katilip katilmak istemedigini sorun
        //evet derse cevabimi ve "derse katiliminiz alinmistir" yazdirin
        //hayir derse cvb ve "sonraki derslermize bekelrz " yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Derse katilmak istermisiniz?\nEvet veya hayir yaziniz");
        String cevap = scan.next();
        if (cevap.equalsIgnoreCase("evet")) {
            System.out.println("Derse katiliminiz onaylanmistir");

        } else if (cevap.equalsIgnoreCase("hayir")){
            System.out.println("cevabiniz:"+cevap+"sonraki desrlermozte bekleriz");
        }else {
            System.out.println("Lutfen evet veya hayir yaziniz");
        }


        }
    }











