import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/*
Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
aggiungi un anno
sottrai un mese
aggiungi 7 giorni
Stampa il risultato localizzata per l'Italia
Crea dei test per questo esercizio
 */
public class DateMethods {
    public static void main(String[] args) {
        String date = "2023-03-01T13:00:00Z";
        dateMethodsItaly(date);
    }
    public static void dateMethodsItaly(String date) {
        OffsetDateTime dateTime = OffsetDateTime.parse(date);
        OffsetDateTime newDate1 = dateTime.plusYears(1);
        OffsetDateTime newDate2 = newDate1.minusMonths(1);
        OffsetDateTime newDate3 = newDate2.plusDays(7);

        ZonedDateTime dateItaly = newDate3.atZoneSameInstant(ZoneId.of("Europe/Paris"));
        String dateItalyString = dateItaly.toString();
        System.out.println(dateItalyString);
    }
}