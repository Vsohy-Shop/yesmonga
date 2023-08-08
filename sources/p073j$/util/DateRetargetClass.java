package p073j$.util;

import java.util.Date;
import p073j$.time.Instant;

/* renamed from: j$.util.DateRetargetClass */
public final /* synthetic */ class DateRetargetClass {
    public static Instant toInstant(Date date) {
        return Instant.ofEpochMilli(date.getTime());
    }
}
