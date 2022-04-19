package day27_constructor;

public class VolvoRunner2 {
    public static void main(String[] args) {
        //her obje olustrd model yakit gibi degerleri tek tek atama yapmak istemiyorsak
        Volvo arb1=new Volvo("XC60",false,2023,"Benzine");
        System.out.println(arb1.toString());
        Volvo arb2=new Volvo("XC90",true,2021,"elektrikli");
        System.out.println(arb2);

    }
}
