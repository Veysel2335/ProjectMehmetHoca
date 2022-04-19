package day47_linkedList;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C04_ArraydenTekrarlariSilme {
    public static void main(String[] args) {
        //verilen arr den tekrra eden elementleri silip uniqe elentlerden olsuan bir arr haline donduren meth yazin

        Integer arr[]={3,5,4,6,3,1,2,7,8,6,1,4,2,8};
      arr=  benzersizYap(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static Integer[] benzersizYap(Integer[] arr) {
        Set<Integer>benzersizSet=new HashSet<>();
        for (Integer each:arr
             ) {
            benzersizSet.add(each);

        }
        System.out.println(benzersizSet);//[1, 2, 3, 4, 5, 6, 7, 8]
        //sette index yapisi yoktur dolayisiyla for loop kullanamayiz
        Integer arrBenzersiz[]=new Integer [benzersizSet.size()];
        int index=0;
        for (Integer each:benzersizSet
             ) {
            arr[index]=each;
            index++;
        }
        return arrBenzersiz;
    }
}
