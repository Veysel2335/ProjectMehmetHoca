package day26_forEachLoop;

public class Araba {
         //Java da her class olusturdugumuzda java o klasddan ileride objeler uretmek gerek biliri
    //ve biz ozellikle belirtmesek de java
    //her olusturdugu clasa bir constaktir koyar
    //javanin class olustrurken classa koydugu consructa DEFAULT CONSTUCTOR denir ve bu const gorunmez
    //eger biz gorunur cir constructirimiz olsun istersek default constructor ile ayni gorevi yapan bir constuctor olusturabiliriz
   // veya istersek ayni kaliptan farkli desenlerde objler olustrmak icin farkli ozelliklerde const da olusturabiliriz
    //const birbirinden farklilastiran tek ayricalik kullanilan parametre sayisi ve parametre data turudur

    public Araba(){//wie ein method
        System.out.println("parametresiz constructor calisti");

    }
    //bir kod blogunun method veya constructor olmasindan emin olmak istiyorsaniz
    //iki seye dikkat etmelisiniz
    //1-const isimleri class isimleriyle ayni olmak zorunda yani buyuk harfle baslar
    //2-const return type i olmaz

   // ozetle:const adi class adi ile ayni olmali ve
   //return type i olmamali
    public Araba(String renk){
        System.out.println(renk+"renkli bir araba uretildi");
    }
    public Araba(int yil){
        System.out.println(yil+"model bir araba uretildi");
    }
    public Araba(int yil,String renk){
        System.out.println(yil+" model"+renk+" renginde bir araba uretildi");
    }

}
