package day05_matematikselIslemler;

public class C02_PreincrementPosticrement {
    public static void main(String[] args) {
        int sayi1=10;
        int sayi2=20;
        int sayi3=30;
        sayi2=sayi1++;
        System.out.println(sayi1 +","+ sayi2+","+ sayi3);//51


        sayi3=++sayi1;
        System.out.println(sayi1 +","+ sayi2+","+ sayi3);//once sayiyi artir sonra esitle

        System.out.println((sayi3++));//12

        System.out.println(--sayi2);




    }




}