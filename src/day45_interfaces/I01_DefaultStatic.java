package day45_interfaces;

public interface I01_DefaultStatic {
    //interfacelerde sadece abstrackt  meth bulunur.
    //body si olan concerae bir meth olusturmak istedigimizde java cte verir.
    //ancak java 8 ve uzeri versiyonlarda istisnai olarakstatic veya default olarak tanimlanan methodlarin bodysi olabilir.ancak buradaki default key wordu access modofier degildir.
    //cunku interfacelerde tum methodlar public ve abstrackt ti.assagidaki ornekte gorulecegi gibi default olarak tanimlanmis bir methoda access modifeir olarak public yazabiliriz
    //access modofier yazmasak da java public olarak kabul edecektir.


    void mehod1();
  public default void method2(){
      System.out.println("Interface de ki default degeri");

  }
  static void method3(){
      System.out.println("Interface de ki default degeri");

  }
}
