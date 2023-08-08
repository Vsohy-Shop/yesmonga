package org.joda.time.chrono;

import org.joda.time.C12599c;
import org.joda.time.C12646e;
import org.joda.time.C12714n;
import org.joda.time.DateTimeFieldType;
import org.joda.time.field.C12650c;
import org.joda.time.field.C12652e;

/* renamed from: org.joda.time.chrono.n */
public class C12620n extends C12650c {

    /* renamed from: d */
    public static final long f31098d = 7037524068969447317L;

    /* renamed from: e */
    public static final C12599c f31099e = new C12620n();

    public C12620n() {
        super(GregorianChronology.m52917Z0().mo28631S(), DateTimeFieldType.m51324Y());
    }

    /* renamed from: C */
    public int mo28800C() {
        return 0;
    }

    /* renamed from: H */
    public C12646e mo28805H() {
        return GregorianChronology.m52917Z0().mo28646l();
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
        C12652e.m53806p(this, i, 0, mo28847y());
        if (mo29116Z().mo28828g(j) < 0) {
            i = -i;
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
        return g < 0 ? -g : g;
    }

    /* renamed from: r */
    public int mo28839r(long j, long j2) {
        return mo29116Z().mo28839r(j, j2);
    }

    public final Object readResolve() {
        return f31099e;
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
