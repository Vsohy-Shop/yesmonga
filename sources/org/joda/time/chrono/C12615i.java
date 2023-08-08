package org.joda.time.chrono;

import java.util.Locale;
import org.joda.time.C12646e;
import org.joda.time.DateTimeFieldType;
import org.joda.time.field.C12655h;

/* renamed from: org.joda.time.chrono.i */
public final class C12615i extends C12655h {

    /* renamed from: f */
    public static final long f31075f = -3857947176719041436L;

    /* renamed from: e */
    public final BasicChronology f31076e;

    public C12615i(BasicChronology basicChronology, C12646e eVar) {
        super(DateTimeFieldType.m51306B(), eVar);
        this.f31076e = basicChronology;
    }

    /* renamed from: C */
    public int mo28800C() {
        return 1;
    }

    /* renamed from: H */
    public C12646e mo28805H() {
        return this.f31076e.mo28627M();
    }

    /* renamed from: Y */
    public int mo28963Y(String str, Locale locale) {
        return C12617k.m53222h(locale).mo28966c(str);
    }

    /* renamed from: g */
    public int mo28828g(long j) {
        return this.f31076e.mo28888p0(j);
    }

    /* renamed from: h */
    public String mo28829h(int i, Locale locale) {
        return C12617k.m53222h(locale).mo28967d(i);
    }

    /* renamed from: m */
    public String mo28834m(int i, Locale locale) {
        return C12617k.m53222h(locale).mo28968e(i);
    }

    public final Object readResolve() {
        return this.f31076e.mo28642h();
    }

    /* renamed from: w */
    public int mo28845w(Locale locale) {
        return C12617k.m53222h(locale).mo28971i();
    }

    /* renamed from: x */
    public int mo28846x(Locale locale) {
        return C12617k.m53222h(locale).mo28972j();
    }

    /* renamed from: y */
    public int mo28847y() {
        return 7;
    }
}
