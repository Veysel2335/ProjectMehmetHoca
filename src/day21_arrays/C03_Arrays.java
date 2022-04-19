package day21_arrays;

import java.util.Arrays;

public class C03_Arrays {
    public static void main(String[] args) {
        int arr[];//deger atamasi yapmadik ama java kabul etti ancak kullanamayiz.boyutu bilmiyor
        arr=new int[6];

        System.out.println(Arrays.toString(arr));//[0, 0, 0, 0, 0, 0]
        System.out.println(arr.length);//arrayin element sayisini verir 6

        //arraydeki her bir elemani index degeri kadar artiralim
        for (int i = 0; i < arr.length ; i++) {
            arr[i]+=i;


        }
        System.out.println(Arrays.toString(arr));//[0, 1, 2, 3, 4, 5]
        System.out.println(arr[arr.length-1]);//5


    }
}
