package day18_NestedForLoop;

public class C02_NestedForLoop {

    public static void main(String[] args) {
        //kullanicidan bir rakam alip carpim tablosu olustrualim

        int input=5;

        for (int i = 1; i <=input ; i++) {
            for (int j = 1; j <=input ; j++) {
                System.out.print((i*j)+" ");

            }
            System.out.println(" ");//satiri asagi gecirmek

        }
    }
}
