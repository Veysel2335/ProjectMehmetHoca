package day32_dateTime;

import java.time.LocalTime;

public class C02_LocalTime {
    public static void main(String[] args) {
        LocalTime tm=LocalTime.now();
        System.out.println(tm);//13:51:00.244236600

int sayi=0;
        for (int i = 0; i <100000 ; i++) {
            sayi+=i;

        }
        LocalTime tmLoopSonrasi=LocalTime.now();
        System.out.println(tm);//13:53:39.624440800

        double nano1=tm.getNano();
        double nano2=tmLoopSonrasi.getNano();
        System.out.println("islem "+(nano2-nano1+"nanosaniyede bitti"));

        //ileri ve geriye de gidebliriz
        System.out.println(tm.plusMinutes(1000));//06:37:21.960942900

    }
}
