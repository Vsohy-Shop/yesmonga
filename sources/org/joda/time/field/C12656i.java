package org.joda.time.field;

import org.joda.time.C12599c;
import org.joda.time.C12646e;
import org.joda.time.DateTimeFieldType;

/* renamed from: org.joda.time.field.i */
public class C12656i extends C12650c {

    /* renamed from: g */
    public static final long f31152g = 5708241235177666790L;

    /* renamed from: d */
    public final int f31153d;

    /* renamed from: e */
    public final C12646e f31154e;

    /* renamed from: f */
    public final C12646e f31155f;

    public C12656i(C12599c cVar, DateTimeFieldType dateTimeFieldType, int i) {
        super(cVar, dateTimeFieldType);
        if (i >= 2) {
            C12646e t = cVar.mo28841t();
            if (t == null) {
                this.f31155f = null;
            } else {
                this.f31155f = new ScaledDurationField(t, dateTimeFieldType.mo27804H(), i);
            }
            this.f31154e = cVar.mo28841t();
            this.f31153d = i;
            return;
        }
        throw new IllegalArgumentException("The divisor must be at least 2");
    }

    /* renamed from: C */
    public int mo28800C() {
        return 0;
    }

    /* renamed from: H */
    public C12646e mo28805H() {
        return this.f31155f;
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

    /* renamed from: P */
    public long mo28813P(long j) {
        return mo29116Z().mo28813P(j);
    }

    /* renamed from: Q */
    public long mo28814Q(long j) {
        return mo29116Z().mo28814Q(j);
    }

    /* renamed from: R */
    public long mo28815R(long j) {
        return mo29116Z().mo28815R(j);
    }

    /* renamed from: S */
    public long mo28816S(long j, int i) {
        C12652e.m53806p(this, i, 0, this.f31153d - 1);
        return mo29116Z().mo28816S(j, (mo29122a0(mo29116Z().mo28828g(j)) * this.f31153d) + i);
    }

    /* renamed from: a0 */
    public final int mo29122a0(int i) {
        if (i >= 0) {
            return i / this.f31153d;
        }
        return ((i + 1) / this.f31153d) - 1;
    }

    /* renamed from: b0 */
    public int mo29123b0() {
        return this.f31153d;
    }

    /* renamed from: d */
    public long mo28825d(long j, int i) {
        return mo28816S(j, C12652e.m53793c(mo28828g(j), i, 0, this.f31153d - 1));
    }

    /* renamed from: g */
    public int mo28828g(long j) {
        int g = mo29116Z().mo28828g(j);
        if (g >= 0) {
            return g % this.f31153d;
        }
        int i = this.f31153d;
        return (i - 1) + ((g + 1) % i);
    }

    /* renamed from: t */
    public C12646e mo28841t() {
        return this.f31154e;
    }

    /* renamed from: y */
    public int mo28847y() {
        return this.f31153d - 1;
    }

    public C12656i(C12599c cVar, C12646e eVar, DateTimeFieldType dateTimeFieldType, int i) {
        super(cVar, dateTimeFieldType);
        if (i >= 2) {
            this.f31155f = eVar;
            this.f31154e = cVar.mo28841t();
            this.f31153d = i;
            return;
        }
        throw new IllegalArgumentException("The divisor must be at least 2");
    }

    public C12656i(C12651d dVar) {
        this(dVar, dVar.mo28806I());
    }

    public C12656i(C12651d dVar, DateTimeFieldType dateTimeFieldType) {
        this(dVar, dVar.mo29116Z().mo28841t(), dateTimeFieldType);
    }

    public C12656i(C12651d dVar, C12646e eVar, DateTimeFieldType dateTimeFieldType) {
        super(dVar.mo29116Z(), dateTimeFieldType);
        this.f31153d = dVar.f31137d;
        this.f31154e = eVar;
        this.f31155f = dVar.f31138e;
    }
}
