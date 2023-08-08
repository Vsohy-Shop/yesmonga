package org.joda.time.chrono;

import org.joda.time.C12599c;
import org.joda.time.C12646e;
import org.joda.time.C12714n;
import org.joda.time.DateTimeFieldType;
import org.joda.time.field.C12650c;
import org.joda.time.field.C12652e;

/* renamed from: org.joda.time.chrono.m */
public final class C12619m extends C12650c {

    /* renamed from: e */
    public static final long f31096e = -5961050944769862059L;

    /* renamed from: d */
    public final BasicChronology f31097d;

    public C12619m(C12599c cVar, BasicChronology basicChronology) {
        super(cVar, DateTimeFieldType.m51324Y());
        this.f31097d = basicChronology;
    }

    /* renamed from: C */
    public int mo28800C() {
        return 1;
    }

    /* renamed from: H */
    public C12646e mo28805H() {
        return this.f31097d.mo28646l();
    }

    /* renamed from: M */
    public long mo28810M(long j) {
        return mo29116Z().mo28810M(j);
    }

    /* renamed from: N */
    public long mo28811N(long j) {
        return mo29116Z().mo28811N(j);
    }

    /* renamed from: O */
    public long mo28812O(long j) {
        return mo29116Z().mo28812O(j);
    }

    /* renamed from: S */
    public long mo28816S(long j, int i) {
        C12652e.m53806p(this, i, 1, mo28847y());
        if (this.f31097d.mo28867N0(j) <= 0) {
            i = 1 - i;
        }
        return super.mo28816S(j, i);
    }

    /* renamed from: a */
    public long mo28822a(long j, int i) {
        return mo29116Z().mo28822a(j, i);
    }

    /* renamed from: b */
    public long mo28823b(long j, long j2) {
        return mo29116Z().mo28823b(j, j2);
    }

    /* renamed from: d */
    public long mo28825d(long j, int i) {
        return mo29116Z().mo28825d(j, i);
    }

    /* renamed from: e */
    public int[] mo28826e(C12714n nVar, int i, int[] iArr, int i2) {
        return mo29116Z().mo28826e(nVar, i, iArr, i2);
    }

    /* renamed from: g */
    public int mo28828g(long j) {
        int g = mo29116Z().mo28828g(j);
        return g <= 0 ? 1 - g : g;
    }

    /* renamed from: r */
    public int mo28839r(long j, long j2) {
        return mo29116Z().mo28839r(j, j2);
    }

    public final Object readResolve() {
        return this.f31097d.mo28633U();
    }

    /* renamed from: s */
    public long mo28840s(long j, long j2) {
        return mo29116Z().mo28840s(j, j2);
    }

    /* renamed from: y */
    public int mo28847y() {
        return mo29116Z().mo28847y();
    }
}
