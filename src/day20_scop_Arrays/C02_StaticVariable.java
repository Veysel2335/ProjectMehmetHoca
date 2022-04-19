package day20_scop_Arrays;

public class C02_StaticVariable { //clasi ici ama main disi olusur

    //instance variable objeye bagimlidir ve her obje farkli degerler alabilir
    //ogrenci notlari veya ogretmen branslari gibi
    //bir objeye ait bir variablein son degerini bulmak icin sadece o objeyi dikkate aliriz
    //static variabler ise class variable olarak tanimlanir
    //ve tüm class uyeleri icin aynidir.okul ismi,okul mudurunun adi gibi
    //eger static variablein degeri degi
    static String okulIsmi="Yildiz Koleji";
   static int okulNo;
    static boolean okulAcikMi;



    public static void main(String[] args) {
        System.out.println(okulIsmi);////yildiz koleji
        System.out.println(okulNo);// 0 atama yapmadik
        okulNo=102;
        System.out.println(okulNo);//102
        System.out.println(okulAcikMi);//false

        //metot icin main disina cik ama calismayz calismasi icin main meth tanimla
        staticMethod();
        System.out.println(okulNo);//200

    }
    public static void staticMethod(){
        okulNo=200;
        System.out.println(okulNo);//200

    }

}
