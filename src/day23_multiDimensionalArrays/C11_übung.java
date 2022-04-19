package day23_multiDimensionalArrays;

import java.util.Arrays;

public class C11_übung {
    public static void main(String[] args) {
        //Verilen bir Array’den tek sayilaru cikartio , kalanlari yeni bir Array olarak yazdiran bir method yaziniz
        int[]arr={2,4,6,8,1,3,5,7};
        int kalan=0;
        sayiCikarmaMethodu(arr);
        int uzunluk=sayiCikarmaMethodu(arr);
        int[]yeniArr=new int[uzunluk];
        System.out.println(Arrays.toString(yeniArr));
        elemanAtamaMethodu(yeniArr,arr,kalan);

    }

    private static void elemanAtamaMethodu(int[] yeniArr, int[] arr, int kalan) {
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]%2==0){
                kalan=arr[i];
                yeniArr[i]=kalan;
            }

        }
        System.out.println(Arrays.toString(yeniArr));
    }

    private static int sayiCikarmaMethodu(int[] arr) {
        int sayac =0;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]%2==0){
                sayac++;
            }

        }
        return sayac;
    }
}
