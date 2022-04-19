package day28_constructor;

public class StaticKeyword {
    static int sayi1;
    int sayi2;
    public static void main(String[] args) {
        //static variabl direk clasa baglidir.
        //clas icerisinde yapilan her turlu degisiklik static variabl kalici olur
        //int variab ise obj bagli ve bir obj uzerinden erisilirek yapilan degisiklik instance variabln degerini tum obj icin kalici olarak degistirmez
        //sadece o obje icin instance variabl degerini kalici olarak degistirir

        System.out.println("sayi1;"+sayi1);//static olm icin main meth direk kullanamayiz
    StaticKeyword obj1=new StaticKeyword();
        System.out.println(obj1.sayi2);//0

        sayi1++;
        System.out.println("sayi1:"+sayi1);//1
        System.out.println(obj1.sayi2);//1
        System.out.println(obj1.sayi1);//1

        StaticKeyword obj2=new StaticKeyword();
        System.out.println(obj2.sayi2);//0
        System.out.println(obj2.sayi1);//1

        obj2.sayi1++;
        obj2.sayi2++;
        System.out.println(obj2.sayi2);//1
        System.out.println(obj2.sayi1);//2

        obj2.sayi2++;
        System.out.println(obj1.sayi2);//1
        System.out.println(obj1.sayi1);//2

        obj1.sayi1++;
        obj1.sayi2++;
        System.out.println(obj1.sayi2);//2
        System.out.println(obj1.sayi1);//3


        System.out.println(obj1.sayi2);//2
        System.out.println(obj1.sayi1);//3

        System.out.println(obj2.sayi2); // 1
        System.out.println(obj2.sayi1); // 3



    }
}
