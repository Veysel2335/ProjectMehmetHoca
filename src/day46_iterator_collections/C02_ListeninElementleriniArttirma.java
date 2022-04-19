package day46_iterator_collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class C02_ListeninElementleriniArttirma {
    public static void main(String[] args) {
        List<Integer> liste = new ArrayList<>();
        liste.add(5);
        liste.add(7);
        liste.add(8);
        liste.add(6);
        liste.add(9);
        System.out.println(liste);//[5, 7, 8, 6, 9]

        //listenin tum elementlerini bize getirmesi icin iteratorun hasnext ve next meth kullanacagiz

        ListIterator itr= liste.listIterator();
        while (itr.hasNext()){
        Object sayi= itr.next();
        itr.set((Integer)sayi+3);
        }
        System.out.println(liste);
    }
}