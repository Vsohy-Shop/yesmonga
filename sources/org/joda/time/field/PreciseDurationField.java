package org.joda.time.field;

import org.joda.time.DurationFieldType;

public class PreciseDurationField extends BaseDurationField {
    private static final long serialVersionUID = -8346152187724495365L;
    private final long iUnitMillis;

    public PreciseDurationField(DurationFieldType durationFieldType, long j) {
        super(durationFieldType);
        this.iUnitMillis = j;
    }

    /* renamed from: M */
    public long mo28931M(long j, long j2) {
        return C12652e.m53800j(j, this.iUnitMillis);
    }

    /* renamed from: X */
    public final long mo28947X() {
        return this.iUnitMillis;
    }

    /* renamed from: b */
    public long mo28909b(long j, int i) {
        return C12652e.m53795e(j, ((long) i) * this.iUnitMillis);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreciseDurationField)) {
            return false;
        }
        PreciseDurationField preciseDurationField = (PreciseDurationField) obj;
        if (mo29034W() == preciseDurationField.mo29034W() && this.iUnitMillis == preciseDurationField.iUnitMillis) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public long mo28910g(long j, long j2) {
        return C12652e.m53795e(j, C12652e.m53800j(j2, this.iUnitMillis));
    }

    public int hashCode() {
        long j = this.iUnitMillis;
        return ((int) (j ^ (j >>> 32))) + mo29034W().hashCode();
    }

    /* renamed from: m0 */
    public long mo28933m0(long j, long j2) {
        return j / this.iUnitMillis;
    }

    /* renamed from: n0 */
    public final boolean mo28950n0() {
        return true;
    }

    /* renamed from: r */
    public long mo28912r(long j, long j2) {
        return C12652e.m53803m(j, j2) / this.iUnitMillis;
    }

    /* renamed from: y */
    public long mo28934y(int i, long j) {
        return ((long) i) * this.iUnitMillis;
    }
}
