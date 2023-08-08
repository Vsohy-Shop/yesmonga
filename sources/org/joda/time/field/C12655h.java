package org.joda.time.field;

import org.joda.time.C12646e;
import org.joda.time.DateTimeFieldType;

/* renamed from: org.joda.time.field.h */
public abstract class C12655h extends C12649b {

    /* renamed from: d */
    public static final long f31149d = 5004523158306266035L;

    /* renamed from: b */
    public final long f31150b;

    /* renamed from: c */
    public final C12646e f31151c;

    public C12655h(DateTimeFieldType dateTimeFieldType, C12646e eVar) {
        super(dateTimeFieldType);
        if (eVar.mo28950n0()) {
            long X = eVar.mo28947X();
            this.f31150b = X;
            if (X >= 1) {
                this.f31151c = eVar;
                return;
            }
            throw new IllegalArgumentException("The unit milliseconds must be at least 1");
        }
        throw new IllegalArgumentException("Unit duration field must be precise");
    }

    /* renamed from: C */
    public int mo28800C() {
        return 0;
    }

    /* renamed from: K */
    public boolean mo28808K() {
        return false;
    }

    /* renamed from: M */
    public long mo28810M(long j) {
        if (j >= 0) {
            return j % this.f31150b;
        }
        long j2 = this.f31150b;
        return (((j + 1) % j2) + j2) - 1;
    }

    /* renamed from: N */
    public long mo28811N(long j) {
        if (j <= 0) {
            return j - (j % this.f31150b);
        }
        long j2 = j - 1;
        long j3 = this.f31150b;
        return (j2 - (j2 % j3)) + j3;
    }

    /* renamed from: O */
    public long mo28812O(long j) {
        long j2;
        if (j >= 0) {
            j2 = j % this.f31150b;
        } else {
            long j3 = j + 1;
            j2 = this.f31150b;
            j = j3 - (j3 % j2);
        }
        return j - j2;
    }

    /* renamed from: S */
    public long mo28816S(long j, int i) {
        C12652e.m53806p(this, i, mo28800C(), mo28954Z(j, i));
        return j + (((long) (i - mo28828g(j))) * this.f31150b);
    }

    /* renamed from: Z */
    public int mo28954Z(long j, int i) {
        return mo28848z(j);
    }

    /* renamed from: a0 */
    public final long mo29121a0() {
        return this.f31150b;
    }

    /* renamed from: t */
    public C12646e mo28841t() {
        return this.f31151c;
    }
}
