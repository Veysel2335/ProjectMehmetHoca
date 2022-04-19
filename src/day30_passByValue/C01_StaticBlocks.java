package day30_passByValue;

import day29_staticKeyWord.C01_Static;

public class C01_StaticBlocks {
    static {// class calismaya baslamadan yapmamiz gerekn on atam varsa onlari yapar.pre cond
        //class ilk calismya basld devreye girer ve clasin calsimasi icin gerekli on hazirliklar icin kullanilir
        //yazildigi satirin hic bir onemi yoktru,class icerisinde istenen yerde yazilabilir
        //2 tane varsa yukardan asagi dogru calisir

        System.out.println("static block calisti");

    }
    static {
        System.out.println("static block 2 calisti");
    }
    C01_StaticBlocks(){
        System.out.println("Constructor calisti");
    }

    public static void main(String[] args) {
        System.out.println("main method baslangici");
        C01_StaticBlocks obj1;
        new C01_StaticBlocks();

    }
}
