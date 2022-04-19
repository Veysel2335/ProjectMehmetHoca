package day24_list;

import java.util.ArrayList;
import java.util.List;

public class C04_Set {
    public static void main(String[] args) {
        List<String> isimler=new ArrayList<>();
        isimler.add("Aykut");
        isimler.add("Yusuf");
        isimler.add("Ilker");
        isimler.add("oguzhan");
        System.out.println(isimler);//[Aykut, Yusuf, Ilker, oguzhan]
//yusuf gitti seckin gelid

        isimler.set(1,"Seckin");
        System.out.println(isimler);//[Aykut, Seckin, Ilker, oguzhan]
        List<String>logListesi=new ArrayList<>();
       logListesi.add (isimler.set(2,"Cosmos"));
        System.out.println(isimler);//[Aykut, Seckin, Cosmos, oguzhan]
        System.out.println(logListesi);//[Ilker]


    }
}
