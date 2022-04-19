package day24_list;

import java.util.ArrayList;
import java.util.List;

public class C08_Ubung {
    public static void main(String[] args) {
        //set() methodu kullanarak, f’yi D yapiniz. ArrayList’i ekrana yazdiriniz, list goyle olmali; A, L, C, D, F, B.
        // 4) remove() methodu kullanarak, F’yi siliniz. ArrayList’i ekrana yazdiriniz, list goyle olmali; A, L, C, D, B.
        List<String> harfler = new ArrayList<>();
        harfler.add("A");
        harfler.add("L");
        harfler.add("C");
        harfler.add("D");
        harfler.add("F");
        harfler.add("B");
        harfler.add(".");
        System.out.println(harfler);
        harfler.set(3,"D");
        System.out.println(harfler);
    }
}
