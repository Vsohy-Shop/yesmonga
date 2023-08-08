package org.joda.time.field;

import java.io.Serializable;
import kotlinx.serialization.json.internal.C12361b;
import org.joda.time.C12646e;
import org.joda.time.DurationFieldType;

public abstract class BaseDurationField extends C12646e implements Serializable {
    private static final long serialVersionUID = -2554245107589433218L;
    private final DurationFieldType iType;

    public BaseDurationField(DurationFieldType durationFieldType) {
        if (durationFieldType != null) {
            this.iType = durationFieldType;
            return;
        }
        throw new IllegalArgumentException("The type must not be null");
    }

    /* renamed from: Q */
    public final String mo29033Q() {
        return this.iType.mo27878e();
    }

    /* renamed from: W */
    public final DurationFieldType mo29034W() {
        return this.iType;
    }

    /* renamed from: Z */
    public int mo29035Z(long j) {
        return C12652e.m53804n(mo29036f0(j));
    }

    /* renamed from: e0 */
    public int mo28932e0(long j, long j2) {
        return C12652e.m53804n(mo28933m0(j, j2));
    }

    /* renamed from: f0 */
    public long mo29036f0(long j) {
        return j / mo28947X();
    }

    /* renamed from: o0 */
    public final boolean mo29037o0() {
        return true;
    }

    /* renamed from: q */
    public int mo28911q(long j, long j2) {
        return C12652e.m53804n(mo28912r(j, j2));
    }

    public String toString() {
        return "DurationField[" + mo29033Q() + C12361b.f30261l;
    }

    /* renamed from: u0 */
    public int compareTo(C12646e eVar) {
        int i = (mo28947X() > eVar.mo28947X() ? 1 : (mo28947X() == eVar.mo28947X() ? 0 : -1));
        if (i == 0) {
            return 0;
        }
        if (i < 0) {
            return -1;
        }
        return 1;
    }

    /* renamed from: w */
    public long mo29041w(int i) {
        return ((long) i) * mo28947X();
    }

    /* renamed from: z */
    public long mo29042z(long j) {
        return C12652e.m53800j(j, mo28947X());
    }
}
