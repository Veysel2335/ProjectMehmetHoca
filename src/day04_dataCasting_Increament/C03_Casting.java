package day04_dataCasting_Increament;

public class C03_Casting {
    public static void main(String[] args) {
        int sayi1=8;
        int sayi2=4;
        System.out.println(sayi1/sayi2); //2

        sayi2=3;
        System.out.println(sayi1/sayi2);//2

        sayi1=22;
        System.out.println(sayi1/sayi2);//7

        //Java iki intiger sayiyiy birbirne bölerse sonucuda integer olarak veriri.küsürat gider

        sayi1=4786;
        sayi2=10;
        sayi1=sayi1/sayi2;
        System.out.println(sayi1);//478
        sayi1=sayi1/sayi2;
        System.out.println(sayi1);//47
        sayi1=sayi1/sayi2;
        System.out.println(sayi1);//4
        sayi1=sayi1/sayi2;
        System.out.println(sayi1);//0

        sayi1=4895;
        double sayi3=10;
        //sayi1=say1/sayi3;//java iki farkli sayi data türünü isleme koydugumuzda java kücük olan icin autowidening yapar
                            //bu islemin sonucunu double yapar kucugu atadi

        System.out.println(sayi1/sayi3);//489.5
        System.out.println(sayi3/sayi1);//0.0020429009193054137











    }




}
