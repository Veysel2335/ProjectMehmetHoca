package day17_forLoop;

public class C04_ForLoop {
    public static void main(String[] args) {
        //10 ile 30 arasindaki (10 30 dahil)
        //sayilari arasunda virgul olarak ayni satirda
        for (int i = 10; i <=30 ; i++) {
            System.out.print(i+",");

        }
        int baslangic=10;
        int bitis=30;
        for (int i = baslangic; i <=bitis ; i++) {

            if (i<bitis){
                System.out.print(i+",");
            }else {
                System.out.print(i);
            }

        }
    }
}
