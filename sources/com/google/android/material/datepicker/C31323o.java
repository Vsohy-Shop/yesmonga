package com.google.android.material.datepicker;

import androidx.annotation.C0363p0;
import java.util.Calendar;
import java.util.TimeZone;

/* renamed from: com.google.android.material.datepicker.o */
public class C31323o {

    /* renamed from: c */
    public static final C31323o f75491c = new C31323o((Long) null, (TimeZone) null);
    @C0363p0

    /* renamed from: a */
    public final Long f75492a;
    @C0363p0

    /* renamed from: b */
    public final TimeZone f75493b;

    public C31323o(@C0363p0 Long l, @C0363p0 TimeZone timeZone) {
        this.f75492a = l;
        this.f75493b = timeZone;
    }

    /* renamed from: a */
    public static C31323o m126248a(long j) {
        return new C31323o(Long.valueOf(j), (TimeZone) null);
    }

    /* renamed from: b */
    public static C31323o m126249b(long j, @C0363p0 TimeZone timeZone) {
        return new C31323o(Long.valueOf(j), timeZone);
    }

    /* renamed from: e */
    public static C31323o m126250e() {
        return f75491c;
    }

    /* renamed from: c */
    public Calendar mo89462c() {
        return mo89463d(this.f75493b);
    }

    /* renamed from: d */
    public Calendar mo89463d(@C0363p0 TimeZone timeZone) {
        Calendar calendar;
        if (timeZone == null) {
            calendar = Calendar.getInstance();
        } else {
            calendar = Calendar.getInstance(timeZone);
        }
        Long l = this.f75492a;
        if (l != null) {
            calendar.setTimeInMillis(l.longValue());
        }
        return calendar;
    }
}
