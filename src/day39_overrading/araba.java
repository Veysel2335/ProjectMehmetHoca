package day39_overrading;

public class araba {
    protected   String hareket="Arabalar teke rile hareket eder";
    protected String hiz="Arabalar motor gucune gore hiz yaparlar";
    protected String yakit="Arabalar farkli yakitlar kullanabilir";
    protected String marka="Arabalar uretildikleri markaya sahiptir";

    public void motor(){
        System.out.println("Arabalar farkli markalarda motor kullanirlar");


    }
    public void yakitTuketimi(){
        System.out.println("arabalar motor giúcne ve yakit turune gore yakit tuketirler");
    }

    public static void main(String[] args) {

    }
}
