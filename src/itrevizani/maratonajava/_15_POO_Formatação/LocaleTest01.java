package itrevizani.maratonajava._15_POO_Formatação;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {
        Locale localeItaly = new Locale("it", "IT");
        Locale localeCH = new Locale("it", "CH");
        Locale localeBrasil = new Locale("pt", "BR");
        Calendar calendar = Calendar.getInstance();
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeCH);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, localeBrasil);
        System.out.println("Italia " + df1.format(calendar.getTime()));
        System.out.println("Suíça " + df2.format(calendar.getTime()));
        System.out.println("Brasil " + df3.format(calendar.getTime()));
    }
}
