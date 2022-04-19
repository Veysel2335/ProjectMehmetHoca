package day18_NestedForLoop;

public class C06_WhileLoop {
    public static void main(String[] args) {
        //kullanicidan iki tam sayi alip
        //bu sayilru ve aralarindaki tum tamsayilari yazdiran kod olust
        int baslangic=40;
        int bitis=60;

        for (int i = baslangic; i <=bitis ; i++) {
            System.out.print(i+" ");

        }
        System.out.println("");

        //ayni soruyu while loop ile yapalim
        int i=baslangic;
        while (baslangic<=bitis){
           System.out.print(baslangic+" ");
           baslangic++;
        }
        System.out.println("");
    }
}
