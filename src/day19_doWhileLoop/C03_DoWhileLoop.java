package day19_doWhileLoop;

public class C03_DoWhileLoop {
    public static void main(String[] args) {
        //kull poz bir tam sayi al while loop ilesayidan den kucuk poz sayilari yazdiralim
        int input=3;

        int sayi=1;

        while (sayi<input){
            System.out.println(sayi);

            sayi++;
        }
        //ayni soruyu do while ile yapalim
        sayi=1;

        do {
            System.out.println(sayi);

            sayi++;
        }while (sayi<input);
    }
}
