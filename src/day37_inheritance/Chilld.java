package day37_inheritance;

import day36_inheritance.Parent;

public class Chilld extends Parent {
    //bir classi child class yapt parent class daki constractura ulasmasi gerekir.bu durumda parent class da ki const
    //access modieferi uygun bir modifier yapilmalidir

    //chil class da tum const ilk satirina javanin yerlestirdigi const parametresiz dir yani supper


    Chilld(){
        super();
        System.out.println("child class parametresiz cons");
    }
Chilld(int s){
    //chil class da tum const ilk satirina javanin yerlestirdigi const parametresiz dir yani supper
    System.out.println("Child class parametreli cons");
}
Chilld(int sayi1,int sayi2){
        //eger parent class dan parametresiz const degilde baska bir const calistirmak isterseniz bunu child class da ki const ilk satirina yazmalisiniz

        super(sayi1,sayi2);
    System.out.println("iki parametreli cons.");
}
    public static void main(String[] args) {
        Chilld child=new Chilld(5,8);

    }
}
