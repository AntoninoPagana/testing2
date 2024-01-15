import java.awt.*;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime data = OffsetDateTime.parse("2002-03-01T13:00:00Z");

    }

    public String formatFull(OffsetDateTime data) throws Exception {
        if (data != null) {
            String dataFormatFull = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
            return dataFormatFull;
        } else {
            throw new Exception("Errore!");
        }
    }

    public String formatMedium(OffsetDateTime data) throws Exception {
        if (data != null) {
            String dataFormatMedium = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
            return dataFormatMedium;
        } else {
            throw new Exception("Errore!");
        }
    }

    public String formatShort(OffsetDateTime data) throws Exception {
        if (data != null) {
            String dataFormatShort = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
            return dataFormatShort;
        } else {
            throw new Exception("Errore!");
        }
    }
}
