import java.util.Calendar;
import java.util.Locale;
import java.util.Random;
import java.util.UUID;

public class IdGenerator {

    public static String generateXRequestId() {
        Calendar instance = Calendar.getInstance(Locale.FRANCE);
        int monthValue = (instance.get(Calendar.MONTH) + 1) * 1000;
        int weekOfMonthValue = (instance.get(Calendar.WEEK_OF_MONTH) + 1) * 678;
        int dayOfWeekValue = (((instance.get(Calendar.DAY_OF_WEEK) + 5) % 7) + 1) * 572;
        Random random = new Random();

        String monthHex = String.format("%03x", monthValue);
        if (random.nextBoolean()) {
            monthHex = new StringBuilder(monthHex).reverse().toString();
        }

        String weekOfMonthHex = String.format("%03x", weekOfMonthValue);
        if (random.nextBoolean()) {
            weekOfMonthHex = new StringBuilder(weekOfMonthHex).reverse().toString();
        }

        String dayOfWeekHex = String.format("%03x", dayOfWeekValue);
        if (random.nextBoolean()) {
            dayOfWeekHex = new StringBuilder(dayOfWeekHex).reverse().toString();
        }

        String uuidString = UUID.randomUUID().toString() + UUID.randomUUID();
        String cleanedUuidString = uuidString.replace("-", "").toLowerCase();

        int firstInsertPosition = random.nextInt(cleanedUuidString.length() - 6) + 3;
        int secondInsertPosition = random.nextInt(cleanedUuidString.length() - 6) + 3;
        int thirdInsertPosition = random.nextInt(cleanedUuidString.length() - 6) + 3;

        StringBuilder requestIdBuilder = new StringBuilder(cleanedUuidString);
        requestIdBuilder.replace(firstInsertPosition, firstInsertPosition + 3, monthHex);
        requestIdBuilder.replace(secondInsertPosition, secondInsertPosition + 3, weekOfMonthHex);
        requestIdBuilder.replace(thirdInsertPosition, thirdInsertPosition + 3, dayOfWeekHex);

        return requestIdBuilder.toString().toUpperCase();
    }

    public static String generateXCorrelationId() {
        // Génère un UUID standard
        return UUID.randomUUID().toString().toUpperCase();
    }

    public static void main(String[] args) {
        String xRequestId = generateXRequestId();
        String xCorrelationId = generateXCorrelationId();

        System.out.println("X-Request-Id: " + xRequestId);
        System.out.println("X-Correlation-Id: " + xCorrelationId);
    }
}
