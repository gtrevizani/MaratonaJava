package itrevizani.maratonajava._15_POO_Datas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate date = LocalDate.parse("2022-08-06");
        LocalTime time = LocalTime.parse("23:45:00");
        System.out.println(localDateTime);
        System.out.println(date);
        System.out.println(time);
        LocalDateTime ltd1 = date.atTime(time);
        LocalDateTime ldt2 = time.atDate(date);
        System.out.println(ltd1);
        System.out.println(ldt2);
    }
}
