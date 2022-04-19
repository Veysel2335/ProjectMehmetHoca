package day27_constructor;

public class Cons02 {
    public static void main(String[] args) {
        Cons01 obj1=new Cons01();//default cont devrede
        //Cons01 classinda hic constolustrumassak,Java default const kullandigindan
        //obj1 i uretebiliriz
        //ancak parametreli veya parametresiz const yazdigimizdan java default const siler
        //daha once baska claslar veya kullanicilarin olusturmus olabilecegi obj kullanabilmeleri icin
        //default const islevini gerceklestirabilecek parametresiz const olustrumakta fayda var

Cons01 obj2=new Cons01("Java");

    }
}
