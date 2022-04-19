package day05_matematikselIslemler;

public class C05_WrapperClass {
    public static void main(String[] args) {
        short sayi1=20;
        Short sayi2=30;

        sayi1=sayi2; //wrapper class ile ayni isimdeki primitiv data türü arasinda gecis m+ümkün
        System.out.println(sayi1);


        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.BYTES);

    }




}
