package day34_accesModifier_encapsulation;

public class C04_Encapsulation {
    public static void main(String[] args) {
        //bir variabl encapsule etmek icin

        //1-access mod private yapariz  2-okuma ve yazma ozelliklerini kullanilmasini istedigimiz gibi sinirlayabiliriz
        //eger sadece okunmasini istiyorsak getter ,sadece deger girilebilsin isterseniz setter meth olustururuzzz.

        //bir varibal icin hem getter hem setter olsturursaniz o variabl public olmus gibi hem okuyup hem de yazilmasini saglayabilirsiniz
        //piyasada dev arasinda genel uygulamada boyledir



        C03 obj =new C03();
        System.out.println( obj.getSayi());//0
        obj.setStr("Java Java Java");
        System.out.println(obj.getStr());//Java Java Java
        System.out.println(obj);//C03{sayi=0, str='Java Java Java'}


        //data saklamak (data hiding demek
        //bizdden izinsiz kimse degismesin goremesin diye
        //encapsulation yapmak icin variabl private yapariz
        //encapsulation yapt variabl okumak icin ve degistirmke icin acabiliriz
        //okumak icin get degistirmke icin set




    }
}
