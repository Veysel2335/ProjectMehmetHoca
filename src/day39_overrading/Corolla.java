package day39_overrading;

public class Corolla extends Toyota{

    protected String hiz="Coroööa max 200 km hiz yapar";
    protected String yakit="Corolla benzinli veya elektriklidir";
    protected String model="Corolla";


    public void motor(){
        System.out.println("Corolla araclar cevreci  motor kullanirlar");


    }
    public void yakitTuketimi(){
        System.out.println("Corolla 5.6 yakit tuketirler");
    }
    public void vitesSayisi(){
        System.out.println("Corolla 5 vitesli arac uretir");

        Corolla arb1=new Corolla();
        System.out.println(arb1.hareket);//araba clasindan alacaz
        System.out.println(arb1.hiz);//corolladan alir
        System.out.println(arb1.yakit);
        System.out.println(arb1.marka);//toyota
        System.out.println(arb1.sirketMerkezi);//totyota
        System.out.println(arb1.model);//corolla
        arb1.motor();//corolla

        Toyota arb2=new Corolla();

        System.out.println(arb2.hareket);//araba clasindan alacaz
        System.out.println(arb2.hiz);//corolladan alir
        System.out.println(arb2.yakit);//araba
        System.out.println(arb2.marka);//toyota
        System.out.println(arb2.sirketMerkezi);//totyota
      //  System.out.println(arb2.model);//cte
arb2.motor();//

        Toyota arb3=new Corolla();

        System.out.println(arb3.hareket);//araba clasindan alacaz
        System.out.println(arb3.hiz);//araba alir
        System.out.println(arb3.yakit);//araba
        System.out.println(arb3.marka);//araba
       // System.out.println(arb3.sirketMerkezi);//cte
       // System.out.println(arb3.model);//cte
        arb3.yakitTuketimi();//corolla
        arb3.motor();//corolla
      //  arb3.garanti(); cte araba clasina gitti ve methodu bulamadi



    }

}
