package day44_abstracktClass_interfece;

import day45_interfaces.I01_DefaultStatic;

public class C02_Default_Static_Method implements I01_DefaultStatic {
    @Override

        //bir interface de default veya static olarak tanimlanan ve badisi olan methodlarin ovveride edilmesi mecburi degildir.
    public void mehod1() {
        System.out.println("child class method1");

    }

    public static void main(String[] args) {
        I01_DefaultStatic.method3();
        C02_Default_Static_Method obj=new C02_Default_Static_Method();
        obj.mehod1();//child classdan calisir
        obj.method2();//parent interface
       // obj.method3(); eski classlarda static bir uyeye static olmayan yollarla da ulasabilirdik
        //ancak interface icerisinde static olark tanimlanan methoda
        //static olmayan yontemlerle ulasilamaz

        
    }
}
