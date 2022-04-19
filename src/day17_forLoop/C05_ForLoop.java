package day17_forLoop;

public class C05_ForLoop {
    public static void main(String[] args) {
        //kull 100 den kucuk tam sayi iste
        //1 den baslayarak girilen sayiya 3 un kati olan say yazdirin
        int sayi=99;
        for (int i = 1; i <=sayi ; i++) {
            if (i%3==0) System.out.print(i + " ");

        }
        System.out.println("asagi gec yegen");
        int sayi2=3;
        for (int i = 3; i <=99 ; i++) {
            if (i%3==0) System.out.print(i+" ");

        }

    }
}
