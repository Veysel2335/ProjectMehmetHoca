package day10_switch_StringManipulation;

public class C03_Concate {
    public static void main(String[] args) {
        //Concatenation yapmak icin iki ihtimal var
        //istersek daha once yapt gibi + operatorunu kullanabiliriz
        //veya String clasindan gelen concat met kullanmaliyiz

        String str1="Java";
        String str2="Candir";

        //Java Candir yazdiralim
        System.out.println(str1+" "+str2);

        String cumle=str1.concat(str2);// JavaCandir
        cumle=str1.concat(" ").concat(str2);
        System.out.println(cumle);
        //concat icine String degil de sayi veya boolean deger yazsak?
        cumle=str1.concat("" +5);
        cumle=str1.concat(""+true);
        //concet methodu icine string ister.string harici yazdiginda onu kabul etmez ve stringe cevirmek lazim o da ""+



    }
}
