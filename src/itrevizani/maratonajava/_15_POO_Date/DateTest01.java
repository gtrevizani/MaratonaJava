package itrevizani.maratonajava._15_POO_Date;

import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) {
        Date date = new Date(6415646455456L);
        date.setTime(date.getTime() + 3_600_000);
        System.out.println(date);
    }
}
