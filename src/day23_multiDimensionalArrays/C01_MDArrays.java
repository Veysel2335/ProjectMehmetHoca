package day23_multiDimensionalArrays;

import java.util.Arrays;

public class C01_MDArrays {
    public static void main(String[] args) {
        int arr[][]={{3,1,7},{3,10,2}};
        System.out.println(arr[0][2]);//7
        System.out.println(arr[1][1]);//10

        //ilk inner arrayin tum elementlerini yazdirin
        System.out.println(arr[0]);//[I@27f674d bu arr old icin drek yazdrirlamaz
        System.out.println(Arrays.toString(arr[0]));//[3, 1, 7]
        System.out.println(Arrays.toString(arr));//[[I@27f674d, [I@1d251891] referans degerleri
        //MDA de tim elementleri bir array olarak yazdrimak istersek
        System.out.println(Arrays.deepToString(arr));  //[[3, 1, 7], [3, 10, 2]]

    }
}
