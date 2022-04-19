package day18_NestedForLoop;

public class C03_UcgenOlusturma {
    public static void main(String[] args) {
        //Kullanicidan pozitif bir rakam girmesini isteyin ve girilen rakama gore asagidaki sekli cizdirin
        //        *
        //        * *
        //        * * *
        //        * * * *

        int input = 7;

        for (int i = 1; i <= input; i++) {
            for (int j = 1; j <= i; j++) {//burda input yazinca kare dikt seklini verir.ucgen icin i
                System.out.print("* ");
            }
            System.out.println("");//alt satira gecmesi icin
        }



            }
        }

