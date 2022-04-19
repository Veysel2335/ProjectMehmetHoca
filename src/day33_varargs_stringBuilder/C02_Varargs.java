package day33_varargs_stringBuilder;

public class C02_Varargs {
    public static void main(String[] args) {
        //parametre olarak bir int
        //ve istedigimiz kadar string alan en uzun kelimenin harf sayisi ile
        // int parametre degeerini carp sonucu yazd bir meth olust


        int sayi=5;
        String str1="Zulal";
        String str2="Zyenep";
        String str3="Ali";

        carpim(sayi,str1,str2,str3);
        //bir methda varargs disinda paraemt7re kullanacaksak once diger parametr yazip varargs en sona yazmaliyiz
        //be sebeple bir meth birden fazla varargs olamaz
    }

    private static void carpim(int sayi, String...str) {
        String enUzunStr = "";
        for (String each : str
        ) {
            if (each.length() > enUzunStr.length()) {
                enUzunStr = each;
            }
        }
        System.out.println("istenen deger:"+sayi*enUzunStr.length());
    }
}