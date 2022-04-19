package day09_ternary_Switch;

public class C04_NestedTernary {
    public static void main(String[] args) {
        //verilen sayinin poz neg old kontrol edip
        //0 veya poz sayi ise tek veya cift
        //neg sayi ise -100'den büyük veya kucuk
        //old belirleyen bir ternary yazdirin
        int sayi=20;

        if (sayi>=0){
            if (sayi%2==0){
                System.out.println("sayi poz cift sayi");

            }else {
                System.out.println("Sayi poz tek sayi");
            }
        }else {
            if ((sayi <= -100)) {
                System.out.println("sayi -100 den kücük negativ");

        }else {
            }
            System.out.println("sayi -100 den büyük negativ sayi");
        }
                 String sonuc=sayi>=0 ? // bu nested ternary ile
                (sayi %2==0 ? "pozitiv cift sayi":"pozitiv tek sayi"):
                 (sayi <-100 ?"-100 den kucuk neg sayi":"-100 den büyük neg sayi");
        System.out.println(sonuc);

        }

    }

