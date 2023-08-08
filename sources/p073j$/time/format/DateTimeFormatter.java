package p073j$.time.format;

import androidx.compose.p004ui.graphics.vector.C15369g;
import com.carrefour.fid.android.shared.util.C28932h;
import java.io.IOException;
import java.text.ParsePosition;
import java.util.HashMap;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import kotlinx.serialization.json.internal.C12361b;
import p073j$.time.C42586c;
import p073j$.time.ZoneId;
import p073j$.time.chrono.C42608p;
import p073j$.time.chrono.Chronology;
import p073j$.time.temporal.C42662a;
import p073j$.time.temporal.C42670i;
import p073j$.time.temporal.TemporalAccessor;
import p073j$.time.temporal.TemporalQuery;

/* renamed from: j$.time.format.DateTimeFormatter */
public final class DateTimeFormatter {
    public static final DateTimeFormatter ISO_LOCAL_DATE;
    public static final DateTimeFormatter ISO_OFFSET_DATE_TIME;

    /* renamed from: h */
    public static final DateTimeFormatter f107822h;

    /* renamed from: a */
    private final C42632f f107823a;

    /* renamed from: b */
    private final Locale f107824b;

    /* renamed from: c */
    private final DecimalStyle f107825c;

    /* renamed from: d */
    private final C42624C f107826d;

    /* renamed from: e */
    private final Set f107827e;

    /* renamed from: f */
    private final Chronology f107828f;

    /* renamed from: g */
    private final ZoneId f107829g;

    static {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        C42662a aVar = C42662a.YEAR;
        C42625D d = C42625D.EXCEEDS_PAD;
        dateTimeFormatterBuilder.mo138114l(aVar, 4, 10, d);
        dateTimeFormatterBuilder.mo138107e('-');
        C42662a aVar2 = C42662a.MONTH_OF_YEAR;
        dateTimeFormatterBuilder.mo138115n(aVar2, 2);
        dateTimeFormatterBuilder.mo138107e('-');
        C42662a aVar3 = C42662a.DAY_OF_MONTH;
        dateTimeFormatterBuilder.mo138115n(aVar3, 2);
        C42624C c = C42624C.STRICT;
        C42608p pVar = C42608p.f107789d;
        DateTimeFormatter u = dateTimeFormatterBuilder.mo138122u(c, pVar);
        ISO_LOCAL_DATE = u;
        DateTimeFormatterBuilder dateTimeFormatterBuilder2 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder2.mo138119r();
        dateTimeFormatterBuilder2.mo138104a(u);
        dateTimeFormatterBuilder2.mo138110h();
        dateTimeFormatterBuilder2.mo138122u(c, pVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilder3 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder3.mo138119r();
        dateTimeFormatterBuilder3.mo138104a(u);
        dateTimeFormatterBuilder3.mo138118q();
        dateTimeFormatterBuilder3.mo138110h();
        dateTimeFormatterBuilder3.mo138122u(c, pVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilder4 = new DateTimeFormatterBuilder();
        C42662a aVar4 = C42662a.HOUR_OF_DAY;
        dateTimeFormatterBuilder4.mo138115n(aVar4, 2);
        dateTimeFormatterBuilder4.mo138107e(C12361b.f30257h);
        C42662a aVar5 = C42662a.MINUTE_OF_HOUR;
        dateTimeFormatterBuilder4.mo138115n(aVar5, 2);
        dateTimeFormatterBuilder4.mo138118q();
        dateTimeFormatterBuilder4.mo138107e(C12361b.f30257h);
        C42662a aVar6 = C42662a.SECOND_OF_MINUTE;
        dateTimeFormatterBuilder4.mo138115n(aVar6, 2);
        dateTimeFormatterBuilder4.mo138118q();
        dateTimeFormatterBuilder4.mo138105b(C42662a.NANO_OF_SECOND, 0, 9, true);
        DateTimeFormatter u2 = dateTimeFormatterBuilder4.mo138122u(c, (C42608p) null);
        DateTimeFormatterBuilder dateTimeFormatterBuilder5 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder5.mo138119r();
        dateTimeFormatterBuilder5.mo138104a(u2);
        dateTimeFormatterBuilder5.mo138110h();
        dateTimeFormatterBuilder5.mo138122u(c, (C42608p) null);
        DateTimeFormatterBuilder dateTimeFormatterBuilder6 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder6.mo138119r();
        dateTimeFormatterBuilder6.mo138104a(u2);
        dateTimeFormatterBuilder6.mo138118q();
        dateTimeFormatterBuilder6.mo138110h();
        dateTimeFormatterBuilder6.mo138122u(c, (C42608p) null);
        DateTimeFormatterBuilder dateTimeFormatterBuilder7 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder7.mo138119r();
        dateTimeFormatterBuilder7.mo138104a(u);
        dateTimeFormatterBuilder7.mo138107e(C15369g.f37992r);
        dateTimeFormatterBuilder7.mo138104a(u2);
        DateTimeFormatter u3 = dateTimeFormatterBuilder7.mo138122u(c, pVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilder8 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder8.mo138119r();
        dateTimeFormatterBuilder8.mo138104a(u3);
        dateTimeFormatterBuilder8.mo138110h();
        DateTimeFormatter u4 = dateTimeFormatterBuilder8.mo138122u(c, pVar);
        ISO_OFFSET_DATE_TIME = u4;
        DateTimeFormatterBuilder dateTimeFormatterBuilder9 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder9.mo138104a(u4);
        dateTimeFormatterBuilder9.mo138118q();
        dateTimeFormatterBuilder9.mo138107e(C12361b.f30260k);
        dateTimeFormatterBuilder9.mo138120s();
        dateTimeFormatterBuilder9.mo138116o();
        dateTimeFormatterBuilder9.mo138107e(C12361b.f30261l);
        dateTimeFormatterBuilder9.mo138122u(c, pVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilder10 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder10.mo138104a(u3);
        dateTimeFormatterBuilder10.mo138118q();
        dateTimeFormatterBuilder10.mo138110h();
        dateTimeFormatterBuilder10.mo138118q();
        dateTimeFormatterBuilder10.mo138107e(C12361b.f30260k);
        dateTimeFormatterBuilder10.mo138120s();
        dateTimeFormatterBuilder10.mo138116o();
        dateTimeFormatterBuilder10.mo138107e(C12361b.f30261l);
        dateTimeFormatterBuilder10.mo138122u(c, pVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilder11 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder11.mo138119r();
        dateTimeFormatterBuilder11.mo138114l(aVar, 4, 10, d);
        dateTimeFormatterBuilder11.mo138107e('-');
        dateTimeFormatterBuilder11.mo138115n(C42662a.DAY_OF_YEAR, 3);
        dateTimeFormatterBuilder11.mo138118q();
        dateTimeFormatterBuilder11.mo138110h();
        dateTimeFormatterBuilder11.mo138122u(c, pVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilder12 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder12.mo138119r();
        dateTimeFormatterBuilder12.mo138114l(C42670i.f107959c, 4, 10, d);
        dateTimeFormatterBuilder12.mo138108f("-W");
        dateTimeFormatterBuilder12.mo138115n(C42670i.f107958b, 2);
        dateTimeFormatterBuilder12.mo138107e('-');
        C42662a aVar7 = C42662a.DAY_OF_WEEK;
        dateTimeFormatterBuilder12.mo138115n(aVar7, 1);
        dateTimeFormatterBuilder12.mo138118q();
        dateTimeFormatterBuilder12.mo138110h();
        dateTimeFormatterBuilder12.mo138122u(c, pVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilder13 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder13.mo138119r();
        dateTimeFormatterBuilder13.mo138106c();
        f107822h = dateTimeFormatterBuilder13.mo138122u(c, (C42608p) null);
        DateTimeFormatterBuilder dateTimeFormatterBuilder14 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder14.mo138119r();
        dateTimeFormatterBuilder14.mo138115n(aVar, 4);
        dateTimeFormatterBuilder14.mo138115n(aVar2, 2);
        dateTimeFormatterBuilder14.mo138115n(aVar3, 2);
        dateTimeFormatterBuilder14.mo138118q();
        dateTimeFormatterBuilder14.mo138109g("+HHMMss", "Z");
        dateTimeFormatterBuilder14.mo138122u(c, pVar);
        HashMap hashMap = new HashMap();
        hashMap.put(1L, "Mon");
        hashMap.put(2L, "Tue");
        hashMap.put(3L, "Wed");
        hashMap.put(4L, "Thu");
        hashMap.put(5L, "Fri");
        hashMap.put(6L, "Sat");
        C42608p pVar2 = pVar;
        hashMap.put(7L, "Sun");
        HashMap hashMap2 = new HashMap();
        hashMap2.put(1L, "Jan");
        hashMap2.put(2L, "Feb");
        hashMap2.put(3L, "Mar");
        hashMap2.put(4L, "Apr");
        hashMap2.put(5L, "May");
        hashMap2.put(6L, "Jun");
        hashMap2.put(7L, "Jul");
        hashMap2.put(8L, "Aug");
        hashMap2.put(9L, "Sep");
        hashMap2.put(10L, "Oct");
        hashMap2.put(11L, "Nov");
        hashMap2.put(12L, "Dec");
        DateTimeFormatterBuilder dateTimeFormatterBuilder15 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder15.mo138119r();
        dateTimeFormatterBuilder15.mo138121t();
        dateTimeFormatterBuilder15.mo138118q();
        dateTimeFormatterBuilder15.mo138112j(aVar7, hashMap);
        dateTimeFormatterBuilder15.mo138108f(", ");
        dateTimeFormatterBuilder15.mo138117p();
        dateTimeFormatterBuilder15.mo138114l(aVar3, 1, 2, C42625D.NOT_NEGATIVE);
        dateTimeFormatterBuilder15.mo138107e(' ');
        dateTimeFormatterBuilder15.mo138112j(aVar2, hashMap2);
        dateTimeFormatterBuilder15.mo138107e(' ');
        dateTimeFormatterBuilder15.mo138115n(aVar, 4);
        dateTimeFormatterBuilder15.mo138107e(' ');
        dateTimeFormatterBuilder15.mo138115n(aVar4, 2);
        dateTimeFormatterBuilder15.mo138107e(C12361b.f30257h);
        dateTimeFormatterBuilder15.mo138115n(aVar5, 2);
        dateTimeFormatterBuilder15.mo138118q();
        dateTimeFormatterBuilder15.mo138107e(C12361b.f30257h);
        dateTimeFormatterBuilder15.mo138115n(aVar6, 2);
        dateTimeFormatterBuilder15.mo138117p();
        dateTimeFormatterBuilder15.mo138107e(' ');
        dateTimeFormatterBuilder15.mo138109g("+HHMM", C28932h.f70913W);
        dateTimeFormatterBuilder15.mo138122u(C42624C.SMART, pVar2);
    }

    DateTimeFormatter(C42632f fVar, Locale locale, DecimalStyle decimalStyle, C42624C c, Set set, Chronology chronology, ZoneId zoneId) {
        Objects.requireNonNull(fVar, "printerParser");
        this.f107823a = fVar;
        this.f107827e = set;
        Objects.requireNonNull(locale, "locale");
        Locale locale2 = locale;
        this.f107824b = locale;
        Objects.requireNonNull(decimalStyle, "decimalStyle");
        this.f107825c = decimalStyle;
        Objects.requireNonNull(c, "resolverStyle");
        this.f107826d = c;
        this.f107828f = chronology;
        this.f107829g = zoneId;
    }

    /* renamed from: f */
    private TemporalAccessor m172304f(CharSequence charSequence) {
        String str;
        ParsePosition parsePosition = new ParsePosition(0);
        Objects.requireNonNull(charSequence, "text");
        C42649w wVar = new C42649w(this);
        int o = this.f107823a.mo138136o(wVar, charSequence, parsePosition.getIndex());
        if (o < 0) {
            parsePosition.setErrorIndex(~o);
            wVar = null;
        } else {
            parsePosition.setIndex(o);
        }
        if (wVar != null && parsePosition.getErrorIndex() < 0 && parsePosition.getIndex() >= charSequence.length()) {
            return wVar.mo138179t(this.f107826d, this.f107827e);
        }
        if (charSequence.length() > 64) {
            str = charSequence.subSequence(0, 64).toString() + "...";
        } else {
            str = charSequence.toString();
        }
        if (parsePosition.getErrorIndex() >= 0) {
            String str2 = "Text '" + str + "' could not be parsed at index " + parsePosition.getErrorIndex();
            parsePosition.getErrorIndex();
            throw new DateTimeParseException(str2, charSequence);
        }
        String str3 = "Text '" + str + "' could not be parsed, unparsed text found at index " + parsePosition.getIndex();
        parsePosition.getIndex();
        throw new DateTimeParseException(str3, charSequence);
    }

    public static DateTimeFormatter ofPattern(String str) {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.mo138111i(str);
        return dateTimeFormatterBuilder.mo138123v(Locale.getDefault());
    }

    public static DateTimeFormatter ofPattern(String str, Locale locale) {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.mo138111i(str);
        return dateTimeFormatterBuilder.mo138123v(locale);
    }

    /* renamed from: a */
    public final String mo138095a(TemporalAccessor temporalAccessor) {
        StringBuilder sb = new StringBuilder(32);
        Objects.requireNonNull(temporalAccessor, "temporal");
        try {
            this.f107823a.mo138135n(new C42651y(temporalAccessor, this), sb);
            return sb.toString();
        } catch (IOException e) {
            throw new C42586c(e.getMessage(), e);
        }
    }

    /* renamed from: b */
    public final Chronology mo138096b() {
        return this.f107828f;
    }

    /* renamed from: c */
    public final DecimalStyle mo138097c() {
        return this.f107825c;
    }

    /* renamed from: d */
    public final Locale mo138098d() {
        return this.f107824b;
    }

    /* renamed from: e */
    public final ZoneId mo138099e() {
        return this.f107829g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final C42632f mo138100g() {
        return this.f107823a.mo138138a();
    }

    public <T> T parse(CharSequence charSequence, TemporalQuery<T> temporalQuery) {
        String str;
        Objects.requireNonNull(charSequence, "text");
        Objects.requireNonNull(temporalQuery, "query");
        try {
            return ((C42623B) m172304f(charSequence)).mo137883c(temporalQuery);
        } catch (DateTimeParseException e) {
            throw e;
        } catch (RuntimeException e2) {
            if (charSequence.length() > 64) {
                str = charSequence.subSequence(0, 64).toString() + "...";
            } else {
                str = charSequence.toString();
            }
            throw new DateTimeParseException("Text '" + str + "' could not be parsed: " + e2.getMessage(), charSequence, e2);
        }
    }

    public final String toString() {
        String fVar = this.f107823a.toString();
        return fVar.startsWith("[") ? fVar : fVar.substring(1, fVar.length() - 1);
    }

    public DateTimeFormatter withDecimalStyle(DecimalStyle decimalStyle) {
        if (this.f107825c.equals(decimalStyle)) {
            return this;
        }
        return new DateTimeFormatter(this.f107823a, this.f107824b, decimalStyle, this.f107826d, this.f107827e, this.f107828f, this.f107829g);
    }
}
