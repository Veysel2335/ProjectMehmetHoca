package day24_list;

import java.util.ArrayList;
import java.util.List;

public class C02_Remove {
    public static void main(String[] args) {
        List<String> isimler=new ArrayList<>();
        isimler.add("Aykut");
        isimler.add("Yusuf");
        isimler.add("Ilker");
        isimler.add("oguzhan");
        System.out.println(isimler);//[Aykut, Yusuf, Ilker, oguzhan]

        isimler.remove("oguzhan");//true
        System.out.println(isimler);//[Aykut, Yusuf, Ilker]
//remove (istenenObject) methodu istenen elementi kaldirip bize true veya false doner
        //eger remove isleminin yapildigini  kontrol etmek istiyorsaniz
        //methodu boolean bir variable atayabilirsiniz

        boolean sonuc=isimler.remove("oguzhan");
        //sonucu kullaniciya yazd istersen if el ile yazdirabilrisn
        if (sonuc==true){
            System.out.println("istedigin isim silindi");
        }else {
            System.out.println("istediginiz isim listede olmadigindan silinemedi");
        }
        System.out.println(isimler);//[Aykut, Yusuf, Ilker]

        sonuc=isimler.remove("Berk");
        if (sonuc==true){
            System.out.println("istedigin isim silindi");
        }else {
            System.out.println("istediginiz isim listede olmadigindan silinemedi");//istediginiz isim listede olmadigindan silinemedi

        }
        //remove(index) yazdigimizda sildim medim ihtimali kalmaz
        //bize remove ediln elementi doner

        System.out.println(isimler.remove(1));//yusufu siler ve delil olarak yusuf ism bize dondurur Yusuf
        System.out.println(isimler);//[Aykut, Ilker]

    }
}
