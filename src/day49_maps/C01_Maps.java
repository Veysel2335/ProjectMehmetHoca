package day49_maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C01_Maps {
    public static void main(String[] args) {
        //java da collection uyesi bir yapida data turu objetc secilirse her datat turunden deger ekleyebiliriz.
        //ancak bu durumda surekli casting problemleriyle karsilasabiliriz.

        List<Object> list=new ArrayList<>();
        list.add("Ergin");
        list.add(15);
        list.add(10.2);
        System.out.println(list);//[Ergin, 15, 10.2]
       list.set(1,(Integer)(list.get(1))+10);

        Map<Integer,String> sinifList=new HashMap<>();
        //bir isinfta ogrenci no ve isim ,soyisim ,brans olarak map olsutrmak istiryoruz
        //key tek bir inique degerdir.
        //ama value (deger) birden fazla bilginin birlesiminden olusabilir
        //bu durumda daha sonra istedigimiz bilgilere dogru sekilde ulasabilmek icin
        //tum elemementelr icin value ayni biicmde olusturulmalidir
        sinifList.put(101,"Ali, Can, Developer");
        sinifList.put(102,"Veli,Yan,QA");
        sinifList.put(103,"Ali, Yan, C#");

        System.out.println(sinifList);//{101=Ali, Can, Developer, 102=Veli,Yan,QA, 103=Ali, Yan, Dev}
        System.out.println(sinifList.keySet());//[101, 102, 103]
        System.out.println(sinifList.values());//[Ali, Can, Developer, Veli,Yan,QA, Ali, Yan, C#]





    }

}
