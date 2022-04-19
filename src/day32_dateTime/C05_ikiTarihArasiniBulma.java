package day32_dateTime;

import java.time.LocalDate;
import java.time.Period;

public class C05_ikiTarihArasiniBulma {
    public static void main(String[] args) {
        LocalDate bugun=LocalDate.now();
        LocalDate dogumGunu=LocalDate.of(1972,01,18);
        LocalDate dogumGunu1=LocalDate.of(1992,9,6);
        System.out.println(Period.between(dogumGunu,bugun));//P50Y2M14D
        System.out.println(Period.between(dogumGunu,bugun).getYears());//50
        System.out.println(Period.between(dogumGunu1,bugun));//P29Y6M26D
        System.out.println(Period.between(dogumGunu1,bugun).getYears());//29


    }
}