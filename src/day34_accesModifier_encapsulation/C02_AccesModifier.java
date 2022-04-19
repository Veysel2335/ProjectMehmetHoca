package day34_accesModifier_encapsulation;

public class C02_AccesModifier {
    public static void main(String[] args) {
        C01 obj=new C01();

        obj.acikString="Bye";
        C01.acikSayi=50;
        //C01.sayi=15; private old icin goremeyizz

        //obj.method1; private old icin goremeyizz

        //C01 objParametreli=new C01(5); private old icin goremeyizz

    }
}
