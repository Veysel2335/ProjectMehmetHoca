package day09_ternary_Switch;

public class C05_Ternary {
    public static void main(String[] args) {
        //Bazen ternarydeki iki sonucun data turleri farkli olabilir
        //verilen sayi 100 den büyük ise sayinin karesini alip yazdiran
        //100 den kucukse "sayi 100'den büyük olmali" yazd bir ternary olut

        int sayi=150;
        //ternary bize sonuc getirdiginden ya sonucu direk yazdirmaliyiz
        //veya bir degiskene atamaliyiz
        //eger sonuclar farkli data türlerinde ise atama yapacagimiz variablein data türü tek olacagindan
        //atama yapamayiz
        //sadece direk yazdirablrz

        System.out.println(sayi>100 ? sayi*sayi :"sayi 100 den büyük olmali");
    }
}
