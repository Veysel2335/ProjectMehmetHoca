package day42_exceptions;

public class C02_Castexception {
    public static void main(String[] args) {
        int sayi=10;
       //cte String str=sayi;
        Object str3="Java cok guzel";
        String str4=(String) str3;
        System.out.println(str4);
        Object sayi2=20;
        String str2=(String) sayi2;//explicit narrowing

    }
}
