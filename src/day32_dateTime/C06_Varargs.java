package day32_dateTime;

public class C06_Varargs {
    public static void main(String[] args) {
        //verilen 2 sayiyi topl iki meth olsturun

        int sayi1=10;
        int sayi2=20;
        int sayi3=30;
        int sayi4=40;
        int sayi5=50;


        toplaGel(sayi1,sayi2);
        //bir de 3 sayiyi topl meth olustrulaim
        toplaGel();
        toplaGel(sayi1,sayi2,sayi3);
        toplaGel(sayi1,sayi2,sayi3,sayi4,sayi5);

    }

    private static void toplaGel(int... sayi1) {
int toplam=0;
        for (int each:sayi1
             ) {
            toplam+=each;

        }
        System.out.println(toplam);
    }




    }


