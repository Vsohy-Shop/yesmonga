package p073j$.time;

import java.io.Serializable;
import java.util.Locale;
import p073j$.time.format.C42625D;
import p073j$.time.format.DateTimeFormatterBuilder;
import p073j$.time.temporal.C42662a;
import p073j$.time.temporal.C42671j;
import p073j$.time.temporal.C42672k;

/* renamed from: j$.time.m */
public abstract class C42659m implements C42671j, C42672k, Comparable, Serializable {

    /* renamed from: a */
    public static final /* synthetic */ int f107934a = 0;

    static {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.mo138114l(C42662a.YEAR, 4, 10, C42625D.EXCEEDS_PAD);
        dateTimeFormatterBuilder.mo138123v(Locale.getDefault());
    }
}
