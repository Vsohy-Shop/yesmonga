package org.joda.time.field;

import org.joda.time.C12646e;
import org.joda.time.DateTimeFieldType;

/* renamed from: org.joda.time.field.g */
public class C12654g extends C12655h {

    /* renamed from: g */
    public static final long f31146g = -5586801265774496376L;

    /* renamed from: e */
    public final int f31147e;

    /* renamed from: f */
    public final C12646e f31148f;

    public C12654g(DateTimeFieldType dateTimeFieldType, C12646e eVar, C12646e eVar2) {
        super(dateTimeFieldType, eVar);
        if (eVar2.mo28950n0()) {
            int X = (int) (eVar2.mo28947X() / mo29121a0());
            this.f31147e = X;
            if (X >= 2) {
                this.f31148f = eVar2;
                return;
            }
            throw new IllegalArgumentException("The effective range must be at least 2");
        }
        throw new IllegalArgumentException("Range duration field must be precise");
    }

    /* renamed from: H */
    public C12646e mo28805H() {
        return this.f31148f;
    }

    /* renamed from: S */
    public long mo28816S(long j, int i) {
        C12652e.m53806p(this, i, mo28800C(), mo28847y());
        return j + (((long) (i - mo28828g(j))) * this.f31150b);
    }

    /* renamed from: b0 */
    public int mo29120b0() {
        return this.f31147e;
    }

    /* renamed from: d */
    public long mo28825d(long j, int i) {
        int g = mo28828g(j);
        return j + (((long) (C12652e.m53793c(g, i, mo28800C(), mo28847y()) - g)) * mo29121a0());
    }

    /* renamed from: g */
    public int mo28828g(long j) {
        if (j >= 0) {
            return (int) ((j / mo29121a0()) % ((long) this.f31147e));
        }
        return (this.f31147e - 1) + ((int) (((j + 1) / mo29121a0()) % ((long) this.f31147e)));
    }

    /* renamed from: y */
    public int mo28847y() {
        return this.f31147e - 1;
    }
}
