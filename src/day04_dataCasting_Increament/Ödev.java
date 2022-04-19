package day04_dataCasting_Increament;

public class Ödev {


    public static void main(String[] args) {
        //soru1:byte veri tipinde bir degidken olusturun,short,int,float ve double data tiplerinde birer degisken olusturup adim adim widening yapin  ve yazdirin
        byte sayi1 = 35;//35
        System.out.println(sayi1);
        short sayi2 = sayi1;
        System.out.println(sayi2);//35
        int sayi3 = sayi2;
        System.out.println(sayi3);//35
        long sayi4 = sayi1;
        System.out.println(sayi4);//35
        float sayi5 = sayi1;
        System.out.println(sayi5);//35.0
        double sayi6 = sayi1;
        System.out.println(sayi6); //35.0

        //soru2:int veri türünde bir degisken olusturunve adim adim narrowing yapin ve yazdirin
        int sayi7 = 3;
        byte sayi8 = (byte) sayi7;
        System.out.println(sayi8);//3
        int sayi9 = 129;
        byte sayi10 = (byte) sayi9;
        System.out.println(sayi10);//-127

        //soru3:float data türünde bir variable olusturun ve yazdirin
        float sayi11 = 35f;
        System.out.println(sayi11);//35.0

        //soru4:double 255.36 sayisini int'a ve sonrada olusturdugunuz int sayiyi byte'a cevirip yazdirin
        double sayi12 = 255.36;
        int sayi13 = (int) sayi12;
        System.out.println(sayi13);//255
        int sayi14 = (byte) sayi13;
        System.out.println(sayi14);//-1

        //soru5:int 2 sayiyi biribirine boldurun ve sonucu yazdirin
        int sayi15 = 35;
        int sayi16 = 7;
        System.out.println(sayi15 / sayi16);//5

        //soru6:int bir sayiyi double bir sayiya boldurun ve sonucu yazdirin
        //int sayi15=35, double sayi12=255.36
        sayi15 = sayi15 / sayi16;
        System.out.println(sayi15 / sayi12);//0.1370614035087719

        //soru7:farkli data tipleri ile işlem yapip sonuclariini yazdirin
        //int sayi15=35 , byte sayi1=35 , double sayi12=255.36
        System.out.println(sayi15 + sayi1);//40
        System.out.println(sayi1 - sayi15);//30
        System.out.println(sayi1 - sayi12);//-220.36
    }
}