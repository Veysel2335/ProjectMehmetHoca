package day32_dateTime;

import java.time.LocalDateTime;

public class C03_LocalDateTime {
    public static void main(String[] args) {
        LocalDateTime tarihSaat=LocalDateTime.now();
        System.out.println(tarihSaat);//2022-04-01T14:05:56.656962200

        System.out.println("tarihSaat = " + tarihSaat);  tarihSaat.plusYears(3).plusMonths(2).plusDays(10).plusHours(5);

    }
}
