package day05_matematikselIslemler;

public class C06_WrapperClass {
    public static void main(String[] args) {
        String str1="12345";
        String str2="23456";

        //verilen iki string sayilari toplayin

        System.out.println(str1 + str2);//yan yana yazdirir toplamay

        System.out.println(Integer.valueOf(str1)+  Integer.valueOf(str2));
    }



}
