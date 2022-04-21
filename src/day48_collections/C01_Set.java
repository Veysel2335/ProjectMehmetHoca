package day48_collections;

import java.util.HashSet;
import java.util.Set;

public class C01_Set {
    public static void main(String[] args) {
        //verilen bir aayin tekrar eden elemntlerini sadecec bir kere yazdiran bir meth olusturun
        Integer arr[]={3,5,4,6,3,1,2,7,8,6,1,4,2,8};
        arrayiTekrarsiyYap(arr);

    }

    private static void arrayiTekrarsiyYap(Integer[] arr) {
        Set<Integer>tekrarsizElemanKumesi=new HashSet<>();
        for (Integer each:arr
             ) {
            tekrarsizElemanKumesi.add(each);

        }
        System.out.println(tekrarsizElemanKumesi);
    }
}
