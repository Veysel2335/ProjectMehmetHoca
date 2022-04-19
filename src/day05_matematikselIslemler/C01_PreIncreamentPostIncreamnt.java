package day05_matematikselIslemler;

public class C01_PreIncreamentPostIncreamnt {
    public static void main(String[] args) {
        int sayi=10;
        //bu sayiyi bir artirmak istersek

        sayi++;
        System.out.println(sayi);//11

        sayi++;
        System.out.println(sayi);//12
        //eger bu 2 islemi tek satirda yaparsam java iki islemden önce hangisini yapacagini bilmek ister

        System.out.println(sayi);//12


        System.out.println(++sayi);//13once artir sonra yazdir
        System.out.println(sayi);//13


        System.out.println(sayi++);//13once yazdr sonra arttir
        System.out.println(sayi);//14


    }



}
