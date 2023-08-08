package p073j$.time.format;

import androidx.compose.p004ui.graphics.vector.C15369g;
import java.util.Locale;
import kotlinx.serialization.json.internal.C12361b;
import p073j$.time.LocalDateTime;
import p073j$.time.ZoneOffset;
import p073j$.time.temporal.C42662a;
import p073j$.time.temporal.TemporalAccessor;

/* renamed from: j$.time.format.i */
final class C42635i implements C42633g {
    C42635i() {
    }

    /* renamed from: n */
    public final boolean mo138135n(C42651y yVar, StringBuilder sb) {
        StringBuilder sb2 = sb;
        Long e = yVar.mo138185e(C42662a.INSTANT_SECONDS);
        TemporalAccessor d = yVar.mo138184d();
        C42662a aVar = C42662a.NANO_OF_SECOND;
        Long valueOf = d.mo137885f(aVar) ? Long.valueOf(yVar.mo138184d().mo137886g(aVar)) : null;
        int i = 0;
        if (e == null) {
            return false;
        }
        long longValue = e.longValue();
        int a0 = aVar.mo138214a0(valueOf != null ? valueOf.longValue() : 0);
        if (longValue >= -62167219200L) {
            long j = (longValue - 315569520000L) + 62167219200L;
            long floorDiv = Math.floorDiv(j, 315569520000L) + 1;
            LocalDateTime c0 = LocalDateTime.m171850c0(Math.floorMod(j, 315569520000L) - 62167219200L, 0, ZoneOffset.UTC);
            if (floorDiv > 0) {
                sb2.append('+');
                sb2.append(floorDiv);
            }
            sb2.append(c0);
            if (c0.mo137950E() == 0) {
                sb2.append(":00");
            }
        } else {
            long j2 = longValue + 62167219200L;
            long j3 = j2 / 315569520000L;
            long j4 = j2 % 315569520000L;
            LocalDateTime c02 = LocalDateTime.m171850c0(j4 - 62167219200L, 0, ZoneOffset.UTC);
            int length = sb.length();
            sb2.append(c02);
            if (c02.mo137950E() == 0) {
                sb2.append(":00");
            }
            if (j3 < 0) {
                if (c02.mo137952K() == -10000) {
                    sb2.replace(length, length + 2, Long.toString(j3 - 1));
                } else if (j4 == 0) {
                    sb2.insert(length, j3);
                } else {
                    sb2.insert(length + 1, Math.abs(j3));
                }
            }
        }
        if (a0 > 0) {
            sb2.append('.');
            int i2 = 100000000;
            while (true) {
                if (a0 <= 0 && i % 3 == 0 && i >= -2) {
                    break;
                }
                int i3 = a0 / i2;
                sb2.append((char) (i3 + 48));
                a0 -= i3 * i2;
                i2 /= 10;
                i++;
            }
        }
        sb2.append(C15369g.f37976b);
        return true;
    }

    /* renamed from: o */
    public final int mo138136o(C42649w wVar, CharSequence charSequence, int i) {
        int i2;
        int i3;
        int i4 = i;
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.mo138104a(DateTimeFormatter.ISO_LOCAL_DATE);
        dateTimeFormatterBuilder.mo138107e(C15369g.f37992r);
        C42662a aVar = C42662a.HOUR_OF_DAY;
        dateTimeFormatterBuilder.mo138115n(aVar, 2);
        dateTimeFormatterBuilder.mo138107e(C12361b.f30257h);
        C42662a aVar2 = C42662a.MINUTE_OF_HOUR;
        dateTimeFormatterBuilder.mo138115n(aVar2, 2);
        dateTimeFormatterBuilder.mo138107e(C12361b.f30257h);
        C42662a aVar3 = C42662a.SECOND_OF_MINUTE;
        dateTimeFormatterBuilder.mo138115n(aVar3, 2);
        C42662a aVar4 = C42662a.NANO_OF_SECOND;
        int i5 = 0;
        dateTimeFormatterBuilder.mo138105b(aVar4, 0, 9, true);
        dateTimeFormatterBuilder.mo138107e(C15369g.f37976b);
        C42632f g = dateTimeFormatterBuilder.mo138123v(Locale.getDefault()).mo138100g();
        C42649w d = wVar.mo138164d();
        int o = g.mo138136o(d, charSequence, i4);
        if (o < 0) {
            return o;
        }
        long longValue = d.mo138169j(C42662a.YEAR).longValue();
        int intValue = d.mo138169j(C42662a.MONTH_OF_YEAR).intValue();
        int intValue2 = d.mo138169j(C42662a.DAY_OF_MONTH).intValue();
        int intValue3 = d.mo138169j(aVar).intValue();
        int intValue4 = d.mo138169j(aVar2).intValue();
        Long j = d.mo138169j(aVar3);
        Long j2 = d.mo138169j(aVar4);
        int intValue5 = j != null ? j.intValue() : 0;
        int intValue6 = j2 != null ? j2.intValue() : 0;
        if (intValue3 == 24 && intValue4 == 0 && intValue5 == 0 && intValue6 == 0) {
            i3 = 0;
            i2 = intValue5;
            i5 = 1;
        } else if (intValue3 == 23 && intValue4 == 59 && intValue5 == 60) {
            wVar.mo138175p();
            i3 = intValue3;
            i2 = 59;
        } else {
            i3 = intValue3;
            i2 = intValue5;
        }
        try {
            C42649w wVar2 = wVar;
            int i6 = i;
            return wVar2.mo138174o(aVar4, (long) intValue6, i6, wVar2.mo138174o(C42662a.INSTANT_SECONDS, Math.multiplyExact(longValue / 10000, 315569520000L) + LocalDateTime.m171848a0(((int) longValue) % 10000, intValue, intValue2, i3, intValue4, i2).mo137959e0((long) i5).toEpochSecond(ZoneOffset.UTC), i6, o));
        } catch (RuntimeException unused) {
            return ~i4;
        }
    }

    public final String toString() {
        return "Instant()";
    }
}
