package day06_concatenation_Operators;

public class C01_Concatination {
    public static void main(String[] args) {
        String str1="Java";
        String str2="Guzel";
        int sayi1=5;
        int sayi2=3;
        //variabl degerlerini degistirmeden asagidaki ifadeleri bu variabl kullanarak yazdir
        //Java5Guzel
        System.out.println(str1+sayi1+str2);

        //2Guzel15
        System.out.println(sayi1-sayi2+str2+sayi1*sayi2);

        //Java22
        System.out.println(str1+(sayi1-sayi2)+(sayi1-sayi2));//java22

        //53Guzel
        System.out.println(sayi1+sayi2+str2);//8guzel
        System.out.println(sayi1+(sayi2+  str2));//53Guzel
        System.out.println(""+sayi1+sayi2+str2);//53Guzel basa turnak hiclik ve herseyi str cevirir



    }


}
