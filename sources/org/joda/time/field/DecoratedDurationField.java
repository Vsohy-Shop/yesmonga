package org.joda.time.field;

import org.joda.time.C12646e;
import org.joda.time.DurationFieldType;

public class DecoratedDurationField extends BaseDurationField {
    private static final long serialVersionUID = 8019982251647420015L;
    private final C12646e iField;

    public DecoratedDurationField(C12646e eVar, DurationFieldType durationFieldType) {
        super(durationFieldType);
        if (eVar == null) {
            throw new IllegalArgumentException("The field must not be null");
        } else if (eVar.mo29037o0()) {
            this.iField = eVar;
        } else {
            throw new IllegalArgumentException("The field must be supported");
        }
    }

    /* renamed from: A0 */
    public final C12646e mo29073A0() {
        return this.iField;
    }

    /* renamed from: M */
    public long mo28931M(long j, long j2) {
        return this.iField.mo28931M(j, j2);
    }

    /* renamed from: X */
    public long mo28947X() {
        return this.iField.mo28947X();
    }

    /* renamed from: b */
    public long mo28909b(long j, int i) {
        return this.iField.mo28909b(j, i);
    }

    /* renamed from: g */
    public long mo28910g(long j, long j2) {
        return this.iField.mo28910g(j, j2);
    }

    /* renamed from: m0 */
    public long mo28933m0(long j, long j2) {
        return this.iField.mo28933m0(j, j2);
    }

    /* renamed from: n0 */
    public boolean mo28950n0() {
        return this.iField.mo28950n0();
    }

    /* renamed from: r */
    public long mo28912r(long j, long j2) {
        return this.iField.mo28912r(j, j2);
    }

    /* renamed from: y */
    public long mo28934y(int i, long j) {
        return this.iField.mo28934y(i, j);
    }
}
