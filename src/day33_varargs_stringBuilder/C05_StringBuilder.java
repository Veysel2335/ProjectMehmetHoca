package day33_varargs_stringBuilder;

public class C05_StringBuilder {
    public static void main(String[] args) {
        //Compare iki sbi esit mi diye kont etmek icin  ilk harften baslayarak
        // tum karakt karsilastirir.Ayni olan karak icin bir sey yazdrimaz.farkli olan ilk karakter icin ascii tabls gore kac deger geride veya ileride old yazdirir
        //ayni ise 0 doner
        //bir strin builder ile bir str compare etmek istersek java cte verir

        StringBuilder sb1=new StringBuilder("Ali Can");
        StringBuilder sb2=new StringBuilder("Ali Can");

        String str="Ali Can";
        System.out.println(sb1.compareTo(sb2));//-32
     //   System.out.println(sb1.compareTo());

     //   System.out.println(sb1==str);//farkli turden 2 obj karsilastiramazsin




    }
}
