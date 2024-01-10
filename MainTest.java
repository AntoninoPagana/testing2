import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    private final Main testing = new Main();

    @Test
    void controlloFormatFull() {
        OffsetDateTime data = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        String actual = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        String expected = "venerdì 1 marzo 2002";
        assertEquals(expected, actual);
    }

    @Test
    void controlloFormatMedium() {
        OffsetDateTime data = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        String actual = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        String expected = "1 mar 2002";
        assertEquals(expected, actual);
    }

    @Test
    void controlloFormatShort() {
        OffsetDateTime data = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        String actual = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
        String expected = "01/03/02";
        assertEquals(expected, actual);
    }
}