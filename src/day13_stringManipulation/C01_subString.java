package day13_stringManipulation;

public class C01_subString {
    public static void main(String[] args) {
        String str="Java ile IT cok guzel";
        System.out.println(str.substring(5));//i den sonra hepsoni yazdiracak
        //yuk stringi kullanarak mzhmet hoca ile it cok guzel yapalim
        System.out.println(str.replace("Java","Mehmet hoca"));
        System.out.println("Mehmet Hoca"+str.substring(5));
        System.out.println(str.substring(9));//yazilan index inclusive
        System.out.println(str.substring(11));

        //eger bir indexten sona kadar olan parcayi degil
        //belirli bir parcayi almak istersek
        //2 parametre yazmak gerekir(basl,bitis)
        System.out.println(str.substring(0,5));//0 dahil 5 dahil degil Java bosluk
        System.out.println(str.substring(0,1));//J

       String harf=str.substring(5,6); // i bana 6.karakteri string olarak bulur
        System.out.println(harf);
        str="Java gun gectikce guzellesiyor";
        System.out.println(str.substring(7,7));//"" java soldan saga dogru calisir ve sonuncu dogru olur

      //  System.out.println(str.substring(5,2));// hata verecek
        System.out.println(str.substring(str.length()-1));//son harfi verir
        System.out.println(str.substring(str.length()-5));//son 5 harfi yazdiralim
        System.out.println(str.substring(str.length()));//hiclik verecek




    }
}
