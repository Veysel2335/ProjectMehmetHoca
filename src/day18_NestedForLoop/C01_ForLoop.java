package day18_NestedForLoop;

public class C01_ForLoop {
    public static void main(String[] args) {
        //kullanicdan 10dan kucuk tam sayi iste ve girilen sayinin faktoriyelini bulun

        int input =9;
        int faktoriyel=1;//carpium old 0 mantiksiz
        String faktoryelAcikYazim="";
        for (int i = input; i>=1 ; i--) {
            faktoriyel *=i;
            if (i==input){
                faktoryelAcikYazim=faktoryelAcikYazim+i;

            }else {
                faktoryelAcikYazim=faktoryelAcikYazim+"*"+i;
            }


        }

        System.out.println(input+"!="+faktoryelAcikYazim+"="+faktoriyel);
    }
}
