package day14_stringManipulation;

public class c03_StringSayiToplama {
    public static void main(String[] args) {
        //String seklinde verlen asagidaki fiyatlarin toplamini bulunuz
        // String str1 = “$13.99”
        // String str2 = “$10.55”
        // ipucu : Double.parseDouble() methodunu kullanabilirsiniz.

        String str1="$13.99";
        String str2="$10.55";
        str1=str1.replaceAll("\\D","");//1399
        str2=str2.replaceAll("\\D","");//1055

        double str1Sayi=Double.valueOf(str1);
        double str2Sayi=Double.valueOf(str2);

        double sonuc=(str1Sayi+str2Sayi)/100;
        System.out.println("verilen string sayilarin toplami:$"+sonuc);



    }
}
