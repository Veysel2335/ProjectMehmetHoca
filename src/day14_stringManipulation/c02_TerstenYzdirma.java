package day14_stringManipulation;

import java.util.Locale;

public class c02_TerstenYzdirma {
    public static void main(String[] args) {
        //kullaniidan 4 harflu kelime iste
        //girilen kelimeyi tersten yazdir

        String input="seda";
        String tersStr=input.substring(3).toUpperCase(Locale.ROOT)+input.substring(2,3).toLowerCase(Locale.ROOT)+
                input.substring(1,2).toLowerCase()+input.substring(0,1).toLowerCase(Locale.ROOT);
        System.out.println(tersStr);



    }
}
