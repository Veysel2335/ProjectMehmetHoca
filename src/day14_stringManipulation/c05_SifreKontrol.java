package day14_stringManipulation;

public class c05_SifreKontrol {
    public static void main(String[] args) {
        //Kullanicidan bir sifre girmesini isteyin. Asagidaki sartlari sagliyorsa “Sifre basari ile tanimlandi”, sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir sifre girin” yazdirin
        //    - Ilk harf buyuk harf olmali
        //    - Son harf kucuk harf olmali
        //    - Sifre bosluk icermemeli
        //    - Sifre uzunlugu en az 8 karakter olmali
        String sifre="asdf12345a";
        boolean ilkHarf=false;
        if (sifre.charAt(0)>='A'&&sifre.charAt(0)<='Z'){
            ilkHarf=true;

        }else {
            System.out.println("Sifrenizin ilk harfi Buyuk Harf olmali");
        }
        boolean sonHarf=false;
        if (sifre.charAt(sifre.length()-1)>='a'&&sifre.charAt(sifre.length()-1)<='z'){
            System.out.println("sifreninizin son harfi kucuk olmali");
            boolean bosluk=false;
        }if (!sifre.contains(" ")){

        }else {
            System.out.println("sifre boslik icermemeli");
        }
        boolean uzunluk=false;
        if (sifre.length()>=8){
            uzunluk=true;
        }else {
            System.out.println("sifre en az 8 karakter olmali");
        }
        if (ilkHarf && sonHarf  && uzunluk){
            System.out.println("sifreniz basarili bir sekilde kaydedildi");

        }
    }
}
