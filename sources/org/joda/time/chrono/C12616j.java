package org.joda.time.chrono;

import java.util.Locale;
import org.joda.time.C12646e;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationFieldType;
import org.joda.time.field.C12649b;
import org.joda.time.field.C12652e;
import org.joda.time.field.UnsupportedDurationField;

/* renamed from: org.joda.time.chrono.j */
public final class C12616j extends C12649b {

    /* renamed from: c */
    public static final long f31077c = 4240986525305515528L;

    /* renamed from: b */
    public final BasicChronology f31078b;

    public C12616j(BasicChronology basicChronology) {
        super(DateTimeFieldType.m51308D());
        this.f31078b = basicChronology;
    }

    /* renamed from: C */
    public int mo28800C() {
        return 0;
    }

    /* renamed from: H */
    public C12646e mo28805H() {
        return null;
    }

    /* renamed from: K */
    public boolean mo28808K() {
        return false;
    }

    /* renamed from: N */
    public long mo28811N(long j) {
        if (mo28828g(j) == 0) {
            return this.f31078b.mo28875V0(0, 1);
        }
        return Long.MAX_VALUE;
    }

    /* renamed from: O */
    public long mo28812O(long j) {
        if (mo28828g(j) == 1) {
            return this.f31078b.mo28875V0(0, 1);
        }
        return Long.MIN_VALUE;
    }

    /* renamed from: P */
    public long mo28813P(long j) {
        return mo28812O(j);
    }

    /* renamed from: Q */
    public long mo28814Q(long j) {
        return mo28812O(j);
    }

    /* renamed from: R */
    public long mo28815R(long j) {
        return mo28812O(j);
    }

    /* renamed from: S */
    public long mo28816S(long j, int i) {
        C12652e.m53806p(this, i, 0, 1);
        if (mo28828g(j) == i) {
            return j;
        }
        return this.f31078b.mo28875V0(j, -this.f31078b.mo28867N0(j));
    }

    /* renamed from: U */
    public long mo28818U(long j, String str, Locale locale) {
        return mo28816S(j, C12617k.m53222h(locale).mo28969f(str));
    }

    /* renamed from: g */
    public int mo28828g(long j) {
        return this.f31078b.mo28867N0(j) <= 0 ? 0 : 1;
    }

    /* renamed from: m */
    public String mo28834m(int i, Locale locale) {
        return C12617k.m53222h(locale).mo28970g(i);
    }

    public final Object readResolve() {
        return this.f31078b.mo28645k();
    }

    /* renamed from: t */
    public C12646e mo28841t() {
        return UnsupportedDurationField.m53678A0(DurationFieldType.m51457c());
    }

    /* renamed from: x */
    public int mo28846x(Locale locale) {
        return C12617k.m53222h(locale).mo28973k();
    }

    /* renamed from: y */
    public int mo28847y() {
        return 1;
    }
}
