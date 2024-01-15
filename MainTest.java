import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    Main testing = new Main();

    @Test
    void controlloFormatFull() {
        try {
            OffsetDateTime data = OffsetDateTime.parse("2002-03-01T13:00:00Z");
            String result = testing.formatFull(data);
            assertEquals("venerdì 1 marzo 2002", result);
        } catch (Exception e) {
            System.out.println("Eccezione" + e.getMessage());
        }
    }

    @Test
    void controlloFormatMedium() {
        try {
            OffsetDateTime data = OffsetDateTime.parse("2002-03-01T13:00:00Z");
            String result = testing.formatMedium(data);
            assertEquals("1 mar 2002", result);
        } catch (Exception e) {
            System.out.println("Eccezione" + e.getMessage());
        }
    }

    @Test
    void controlloFormatShort() {
        try {
            OffsetDateTime data = OffsetDateTime.parse("2002-03-01T13:00:00Z");
            String result = testing.formatShort(data);
            assertEquals("01/03/02", result);
        } catch (Exception e) {
            System.out.println("Eccezione" + e.getMessage());
        }

    }
}