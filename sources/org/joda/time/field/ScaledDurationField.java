package org.joda.time.field;

import org.joda.time.C12646e;
import org.joda.time.DurationFieldType;

public class ScaledDurationField extends DecoratedDurationField {
    private static final long serialVersionUID = -3205227092378684157L;
    private final int iScalar;

    public ScaledDurationField(C12646e eVar, DurationFieldType durationFieldType, int i) {
        super(eVar, durationFieldType);
        if (i == 0 || i == 1) {
            throw new IllegalArgumentException("The scalar must not be 0 or 1");
        }
        this.iScalar = i;
    }

    /* renamed from: C0 */
    public int mo29087C0() {
        return this.iScalar;
    }

    /* renamed from: M */
    public long mo28931M(long j, long j2) {
        return mo29073A0().mo28931M(C12652e.m53799i(j, this.iScalar), j2);
    }

    /* renamed from: X */
    public long mo28947X() {
        return mo29073A0().mo28947X() * ((long) this.iScalar);
    }

    /* renamed from: Z */
    public int mo29035Z(long j) {
        return mo29073A0().mo29035Z(j) / this.iScalar;
    }

    /* renamed from: b */
    public long mo28909b(long j, int i) {
        return mo29073A0().mo28910g(j, ((long) i) * ((long) this.iScalar));
    }

    /* renamed from: e0 */
    public int mo28932e0(long j, long j2) {
        return mo29073A0().mo28932e0(j, j2) / this.iScalar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScaledDurationField)) {
            return false;
        }
        ScaledDurationField scaledDurationField = (ScaledDurationField) obj;
        if (mo29073A0().equals(scaledDurationField.mo29073A0()) && mo29034W() == scaledDurationField.mo29034W() && this.iScalar == scaledDurationField.iScalar) {
            return true;
        }
        return false;
    }

    /* renamed from: f0 */
    public long mo29036f0(long j) {
        return mo29073A0().mo29036f0(j) / ((long) this.iScalar);
    }

    /* renamed from: g */
    public long mo28910g(long j, long j2) {
        return mo29073A0().mo28910g(j, C12652e.m53799i(j2, this.iScalar));
    }

    public int hashCode() {
        long j = (long) this.iScalar;
        return ((int) (j ^ (j >>> 32))) + mo29034W().hashCode() + mo29073A0().hashCode();
    }

    /* renamed from: m0 */
    public long mo28933m0(long j, long j2) {
        return mo29073A0().mo28933m0(j, j2) / ((long) this.iScalar);
    }

    /* renamed from: q */
    public int mo28911q(long j, long j2) {
        return mo29073A0().mo28911q(j, j2) / this.iScalar;
    }

    /* renamed from: r */
    public long mo28912r(long j, long j2) {
        return mo29073A0().mo28912r(j, j2) / ((long) this.iScalar);
    }

    /* renamed from: w */
    public long mo29041w(int i) {
        return mo29073A0().mo29042z(((long) i) * ((long) this.iScalar));
    }

    /* renamed from: y */
    public long mo28934y(int i, long j) {
        return mo29073A0().mo28931M(((long) i) * ((long) this.iScalar), j);
    }

    /* renamed from: z */
    public long mo29042z(long j) {
        return mo29073A0().mo29042z(C12652e.m53799i(j, this.iScalar));
    }
}
