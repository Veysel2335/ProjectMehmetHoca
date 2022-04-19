package day39_overrading;

public class Toyota extends araba {

    String hiz="Toyota araclar max 220 km hiz yaparlar";
    String marka="Toyota";
    String sirketMerkezi="Japonya";



    public void motor(){
        System.out.println("Toyota arabalar toyota marka motor kullanir");


    }
    public void yakitTuketimi(){
        System.out.println("arabalar motor giúcne ve yakit turune gore yakit tuketirler");
    }
    public void garanti(){
        System.out.println("Toyota araclar 10 yil garantilidir");
    }
}
