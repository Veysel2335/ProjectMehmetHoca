package day26_forEachLoop;

public class C01_ForEachLoop {
    public static void main(String[] args) {
        int arr[]={2,4,6,8,11};
        //elementleri for loop ile yazd
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");

        }
        System.out.println("");

        //bunu for each ile
        for (int each:arr
             ) {
            System.out.print(each+" ");
            //indexe bagli bir islem yapamayiz

        }
    }
}
