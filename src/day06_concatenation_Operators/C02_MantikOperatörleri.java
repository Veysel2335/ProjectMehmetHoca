package day06_concatenation_Operators;

public class C02_MantikOperatörleri {
    public static void main(String[] args) {
        System.out.println(5+2==8);//f

        boolean sonuc1= (5 > 4) && (7 < 9) && ((6 + 3) == 9) && ((5 + 2) != 8);//true
        System.out.println(sonuc1);

        boolean sonuc2= (5 > 4) && (7 > 9) && ((6 + 3) == 9) && ((5 + 2) != 8);
        System.out.println(sonuc2);  //false

        boolean sonuc3= (5 > 4) & (7 > 9) & ((6 + 3) == 9) & ((5 + 2) != 8);//false
        System.out.println(sonuc3);


        //&& and& fark;1tane false olursa islem false .bana 1 false yeter:).2 and 1 yanlis bulunca dizide durur ama tek
        //and devam eder kontrole


    }




}
