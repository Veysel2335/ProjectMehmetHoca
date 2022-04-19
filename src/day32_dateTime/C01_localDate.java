package day32_dateTime;

import java.time.LocalDate;
import java.time.ZoneId;

public class C01_localDate {
    public static void main(String[] args) {
        LocalDate trh= LocalDate.now();//obj olustr tarihi trh ye atar
        LocalDate baskaTrh=LocalDate.of(1972,1,18);
        //istedigimiz yil ay ve gun degerlerine gore bize obje olusturur
        System.out.println(trh);//2022-04-01
//get li meth tarih ile alakali bilgiler alabiliriz
        System.out.println(trh.getDayOfMonth());//1
        System.out.println(trh.getDayOfWeek());//FRIDAY
        System.out.println(trh.getMonthValue());//4
        System.out.println(trh.getDayOfYear());//2022

        //bir tarihten geriywe gidebiliriz ileriye de
        System.out.println(trh.minusWeeks(20));//2021-11-12
        System.out.println(trh.minusWeeks(5).minusDays(3));//2022-02-22

        System.out.println(trh.plusMonths(9).plusDays(10));//2023-01-11

        //tarih dile gore degismez
        System.out.println(LocalDate.now().isLeapYear());//false subat icin artik yil

        LocalDate trhZone=LocalDate.now(ZoneId.of("Japan"));
        System.out.println(trhZone);//2022-04-01

        //is ile baslayan meth boolean sonuclar dondurur

        System.out.println(trh.isAfter(baskaTrh));//true



    }
}
