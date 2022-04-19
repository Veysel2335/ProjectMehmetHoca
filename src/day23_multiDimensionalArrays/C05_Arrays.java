package day23_multiDimensionalArrays;

import java.util.Arrays;

public class C05_Arrays {
    public static void main(String[] args) {
        //verilen bir arraye yeni bir element ekleyen bir method olusturun
        int arr[]={3,5,7};
      //  arr[3]=8;//.ArrayIndexOutOfBoundsException hata veriri arraya ekleme yapilamaz.olustrur ama calistirmaz
       // arr={1,3,5,}// var olan bir arraye ayni boyutta olsa bile direk yeni degerler iceren bir array atayamayiz
        arr=new int[4];
        System.out.println(Arrays.toString(arr));//[0, 0, 0, 0]

        int arrYeni[]=new int [5];
        arr=arrYeni;
        System.out.println(Arrays.toString(arr));//[0, 0, 0, 0]
        arrYeni[0]=2;
        arrYeni[3]=5;
        arr=arrYeni;
        System.out.println(Arrays.toString(arr));//[2, 0, 0, 5, 0]


        int arrEnYeni[]={1,2,3,4,5};
        arr=arrEnYeni;
        System.out.println(Arrays.toString(arr));//[1, 2, 3, 4, 5]



    }
}
