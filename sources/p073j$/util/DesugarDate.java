package p073j$.util;

import java.util.Date;
import p073j$.time.Instant;

/* renamed from: j$.util.DesugarDate */
public class DesugarDate {
    public static Date from(Instant instant) {
        try {
            return new Date(instant.toEpochMilli());
        } catch (ArithmeticException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
