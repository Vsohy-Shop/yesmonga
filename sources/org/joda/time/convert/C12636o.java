package org.joda.time.convert;

import org.joda.time.C12589a;
import org.joda.time.C12641d;
import org.joda.time.C12712l;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.ISOChronology;

/* renamed from: org.joda.time.convert.o */
public class C12636o extends C12621a implements C12629h, C12633l {

    /* renamed from: a */
    public static final C12636o f31115a = new C12636o();

    /* renamed from: a */
    public C12589a mo28984a(Object obj, C12589a aVar) {
        if (aVar == null) {
            return C12641d.m53370e(((C12712l) obj).mo27913m());
        }
        return aVar;
    }

    /* renamed from: b */
    public C12589a mo28985b(Object obj, DateTimeZone dateTimeZone) {
        C12589a m = ((C12712l) obj).mo27913m();
        if (m == null) {
            return ISOChronology.m52934b0(dateTimeZone);
        }
        if (m.mo27836s() == dateTimeZone) {
            return m;
        }
        C12589a R = m.mo27835R(dateTimeZone);
        if (R == null) {
            return ISOChronology.m52934b0(dateTimeZone);
        }
        return R;
    }

    /* renamed from: h */
    public long mo28989h(Object obj, C12589a aVar) {
        return ((C12712l) obj).mo27912k();
    }

    /* renamed from: j */
    public Class<?> mo28992j() {
        return C12712l.class;
    }
}
