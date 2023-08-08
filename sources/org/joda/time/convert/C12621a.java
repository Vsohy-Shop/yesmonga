package org.joda.time.convert;

import org.joda.time.C12589a;
import org.joda.time.C12641d;
import org.joda.time.C12714n;
import org.joda.time.DateTimeZone;
import org.joda.time.PeriodType;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.format.C12674b;

/* renamed from: org.joda.time.convert.a */
public abstract class C12621a implements C12623c {
    /* renamed from: a */
    public C12589a mo28984a(Object obj, C12589a aVar) {
        return C12641d.m53370e(aVar);
    }

    /* renamed from: b */
    public C12589a mo28985b(Object obj, DateTimeZone dateTimeZone) {
        return ISOChronology.m52934b0(dateTimeZone);
    }

    /* renamed from: d */
    public PeriodType mo28986d(Object obj) {
        return PeriodType.m52156q();
    }

    /* renamed from: e */
    public int[] mo28987e(C12714n nVar, Object obj, C12589a aVar) {
        return aVar.mo28647m(nVar, mo28989h(obj, aVar));
    }

    /* renamed from: g */
    public boolean mo28988g(Object obj, C12589a aVar) {
        return false;
    }

    /* renamed from: h */
    public long mo28989h(Object obj, C12589a aVar) {
        return C12641d.m53368c();
    }

    /* renamed from: k */
    public int[] mo28990k(C12714n nVar, Object obj, C12589a aVar, C12674b bVar) {
        return mo28987e(nVar, obj, aVar);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Converter[");
        sb.append(mo28992j() == null ? "null" : mo28992j().getName());
        sb.append("]");
        return sb.toString();
    }
}
