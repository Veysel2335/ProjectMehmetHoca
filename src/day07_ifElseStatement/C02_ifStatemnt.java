package day07_ifElseStatement;

public class C02_ifStatemnt {
    public static void main(String[] args) {

        int a=10;
        int b=20;
        if(a>b && b<100){

            System.out.println("isteginiz gerceklesecek");
        }
        if(a<0) System.out.println("suslu parantez olmaz ise sadece 1 satir calisir");

        //bir if cumlesinin daha anlasilabilir olmasini istiyorsaniz süslü parantez icine yaz
        //bodyi{} icine yazmasak da if cümlesi calisir ancak ilk;gördugunde if cumlesi bitmis olur

        System.out.println("2.satir  calisti");



    }


}
