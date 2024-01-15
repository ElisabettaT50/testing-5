import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

import static org.junit.jupiter.api.Assertions.*;

class DateMethodsTest {

    @Test
    void dateMethodsItaly() {
        OffsetDateTime dateTime = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        OffsetDateTime newDate1 = dateTime.plusYears(1);
        OffsetDateTime newDate2 = newDate1.minusMonths(1);
        OffsetDateTime newDate3 = newDate2.plusDays(7);

        ZonedDateTime dateItaly = newDate3.atZoneSameInstant(ZoneId.of("Europe/Paris"));
        String dateItalyString = dateItaly.toString();

        assertEquals("2024-02-08T14:00+01:00[Europe/Paris]", dateItalyString);
    }
}