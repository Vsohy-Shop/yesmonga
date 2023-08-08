package org.joda.time.convert;

import java.util.Calendar;
import java.util.GregorianCalendar;
import org.joda.time.C12589a;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.JulianChronology;

/* renamed from: org.joda.time.convert.b */
public final class C12622b extends C12621a implements C12629h, C12633l {

    /* renamed from: a */
    public static final C12622b f31100a = new C12622b();

    /* renamed from: a */
    public C12589a mo28984a(Object obj, C12589a aVar) {
        DateTimeZone dateTimeZone;
        if (aVar != null) {
            return aVar;
        }
        Calendar calendar = (Calendar) obj;
        try {
            dateTimeZone = DateTimeZone.m51371k(calendar.getTimeZone());
        } catch (IllegalArgumentException unused) {
            dateTimeZone = DateTimeZone.m51374n();
        }
        return mo28985b(calendar, dateTimeZone);
    }

    /* renamed from: b */
    public C12589a mo28985b(Object obj, DateTimeZone dateTimeZone) {
        if (obj.getClass().getName().endsWith(".BuddhistCalendar")) {
            return BuddhistChronology.m52813b0(dateTimeZone);
        }
        if (!(obj instanceof GregorianCalendar)) {
            return ISOChronology.m52934b0(dateTimeZone);
        }
        long time = ((GregorianCalendar) obj).getGregorianChange().getTime();
        if (time == Long.MIN_VALUE) {
            return GregorianChronology.m52915X0(dateTimeZone);
        }
        if (time == Long.MAX_VALUE) {
            return JulianChronology.m52973Y0(dateTimeZone);
        }
        return GJChronology.m52856k0(dateTimeZone, time, 4);
    }

    /* renamed from: h */
    public long mo28989h(Object obj, C12589a aVar) {
        return ((Calendar) obj).getTime().getTime();
    }

    /* renamed from: j */
    public Class<?> mo28992j() {
        return Calendar.class;
    }
}
