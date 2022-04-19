package day25_lists;

import java.util.ArrayList;
import java.util.List;

public class C01_Contains {
    public static void main(String[] args) {
        List<String>harfler=new ArrayList<>();
        harfler.add("D");//[D]
        harfler.add("M");//[d;m]
        harfler.add(1,"T");//[D,t,m]
        harfler.add(0,"T");
        System.out.println(harfler);//[T, D, T, M]
        System.out.println(harfler.contains("T"));//t
        System.out.println(harfler.contains("F"));//f
        List<String>karakterler=new ArrayList<>();
        karakterler.add(("M"));
        karakterler.add(("T"));
        System.out.println(harfler.containsAll(karakterler));//true
        karakterler.add("F");
        System.out.println(harfler.containsAll(karakterler));//f




    }
}
