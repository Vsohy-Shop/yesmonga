package org.joda.time.chrono;

import org.joda.time.C12646e;
import org.joda.time.DateTimeFieldType;
import org.joda.time.field.C12652e;
import org.joda.time.field.ImpreciseDateTimeField;

/* renamed from: org.joda.time.chrono.g */
public class C12613g extends ImpreciseDateTimeField {

    /* renamed from: f */
    public static final long f31070f = -98628754872287L;

    /* renamed from: e */
    public final BasicChronology f31071e;

    public C12613g(BasicChronology basicChronology) {
        super(DateTimeFieldType.m51322W(), basicChronology.mo28880f0());
        this.f31071e = basicChronology;
    }

    /* renamed from: C */
    public int mo28800C() {
        return this.f31071e.mo28858E0();
    }

    /* renamed from: H */
    public C12646e mo28805H() {
        return null;
    }

    /* renamed from: J */
    public boolean mo28807J(long j) {
        return this.f31071e.mo28874U0(mo28828g(j));
    }

    /* renamed from: K */
    public boolean mo28808K() {
        return false;
    }

    /* renamed from: M */
    public long mo28810M(long j) {
        return j - mo28812O(j);
    }

    /* renamed from: N */
    public long mo28811N(long j) {
        int g = mo28828g(j);
        if (j != this.f31071e.mo28870Q0(g)) {
            return this.f31071e.mo28870Q0(g + 1);
        }
        return j;
    }

    /* renamed from: O */
    public long mo28812O(long j) {
        return this.f31071e.mo28870Q0(mo28828g(j));
    }

    /* renamed from: S */
    public long mo28816S(long j, int i) {
        C12652e.m53806p(this, i, this.f31071e.mo28858E0(), this.f31071e.mo28856C0());
        return this.f31071e.mo28875V0(j, i);
    }

    /* renamed from: X */
    public long mo28821X(long j, int i) {
        C12652e.m53806p(this, i, this.f31071e.mo28858E0() - 1, this.f31071e.mo28856C0() + 1);
        return this.f31071e.mo28875V0(j, i);
    }

    /* renamed from: a */
    public long mo28822a(long j, int i) {
        if (i == 0) {
            return j;
        }
        return mo28816S(j, C12652e.m53794d(mo28828g(j), i));
    }

    /* renamed from: b */
    public long mo28823b(long j, long j2) {
        return mo28822a(j, C12652e.m53804n(j2));
    }

    /* renamed from: d */
    public long mo28825d(long j, int i) {
        if (i == 0) {
            return j;
        }
        return mo28816S(j, C12652e.m53793c(this.f31071e.mo28867N0(j), i, this.f31071e.mo28858E0(), this.f31071e.mo28856C0()));
    }

    /* renamed from: g */
    public int mo28828g(long j) {
        return this.f31071e.mo28867N0(j);
    }

    public final Object readResolve() {
        return this.f31071e.mo28631S();
    }

    /* renamed from: s */
    public long mo28840s(long j, long j2) {
        if (j < j2) {
            return -this.f31071e.mo28868O0(j2, j);
        }
        return this.f31071e.mo28868O0(j, j2);
    }

    /* renamed from: u */
    public int mo28843u(long j) {
        return this.f31071e.mo28874U0(mo28828g(j)) ? 1 : 0;
    }

    /* renamed from: v */
    public C12646e mo28844v() {
        return this.f31071e.mo28644j();
    }

    /* renamed from: y */
    public int mo28847y() {
        return this.f31071e.mo28856C0();
    }
}
