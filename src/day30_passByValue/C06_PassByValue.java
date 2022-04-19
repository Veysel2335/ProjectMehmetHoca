package day30_passByValue;

import java.util.Arrays;

public class C06_PassByValue {
    public static void main(String[] args) {//[1, 2, 3]
        //non primitiv data turlerinde objenin kendisi degil de
        //icinde ki elementler degisirse java objenin referansi ve obj kendisi degismedigi icin element degisikliklerini kabul edr ve kalici yapar
        //
        int arr[]={1,2,3};
        System.out.println(Arrays.toString(arr));
        arrDegistir(arr);
        System.out.println("meth call sonrasi:"+Arrays.toString(arr));//[5, 6, 3]

    }

    private static void arrDegistir(int[] arr) {
        arr[0]=5;
        arr[1]=6;
        System.out.println(Arrays.toString(arr));//[5, 6, 3]
    }
}
