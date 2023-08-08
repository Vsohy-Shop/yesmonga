package org.joda.time.field;

import java.io.Serializable;
import java.util.HashMap;
import kotlinx.serialization.json.internal.C12361b;
import org.joda.time.C12646e;
import org.joda.time.DurationFieldType;

public final class UnsupportedDurationField extends C12646e implements Serializable {

    /* renamed from: a */
    public static HashMap<DurationFieldType, UnsupportedDurationField> f31132a = null;
    private static final long serialVersionUID = -6390301302770925357L;
    private final DurationFieldType iType;

    public UnsupportedDurationField(DurationFieldType durationFieldType) {
        this.iType = durationFieldType;
    }

    /* renamed from: A0 */
    public static synchronized UnsupportedDurationField m53678A0(DurationFieldType durationFieldType) {
        UnsupportedDurationField unsupportedDurationField;
        synchronized (UnsupportedDurationField.class) {
            HashMap<DurationFieldType, UnsupportedDurationField> hashMap = f31132a;
            if (hashMap == null) {
                f31132a = new HashMap<>(7);
                unsupportedDurationField = null;
            } else {
                unsupportedDurationField = hashMap.get(durationFieldType);
            }
            if (unsupportedDurationField == null) {
                unsupportedDurationField = new UnsupportedDurationField(durationFieldType);
                f31132a.put(durationFieldType, unsupportedDurationField);
            }
        }
        return unsupportedDurationField;
    }

    private Object readResolve() {
        return m53678A0(this.iType);
    }

    /* renamed from: C0 */
    public final UnsupportedOperationException mo29091C0() {
        return new UnsupportedOperationException(this.iType + " field is unsupported");
    }

    /* renamed from: M */
    public long mo28931M(long j, long j2) {
        throw mo29091C0();
    }

    /* renamed from: Q */
    public String mo29033Q() {
        return this.iType.mo27878e();
    }

    /* renamed from: W */
    public final DurationFieldType mo29034W() {
        return this.iType;
    }

    /* renamed from: X */
    public long mo28947X() {
        return 0;
    }

    /* renamed from: Z */
    public int mo29035Z(long j) {
        throw mo29091C0();
    }

    /* renamed from: b */
    public long mo28909b(long j, int i) {
        throw mo29091C0();
    }

    /* renamed from: e0 */
    public int mo28932e0(long j, long j2) {
        throw mo29091C0();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnsupportedDurationField)) {
            return false;
        }
        UnsupportedDurationField unsupportedDurationField = (UnsupportedDurationField) obj;
        if (unsupportedDurationField.mo29033Q() != null) {
            return unsupportedDurationField.mo29033Q().equals(mo29033Q());
        }
        if (mo29033Q() == null) {
            return true;
        }
        return false;
    }

    /* renamed from: f0 */
    public long mo29036f0(long j) {
        throw mo29091C0();
    }

    /* renamed from: g */
    public long mo28910g(long j, long j2) {
        throw mo29091C0();
    }

    public int hashCode() {
        return mo29033Q().hashCode();
    }

    /* renamed from: m0 */
    public long mo28933m0(long j, long j2) {
        throw mo29091C0();
    }

    /* renamed from: n0 */
    public boolean mo28950n0() {
        return true;
    }

    /* renamed from: o0 */
    public boolean mo29037o0() {
        return false;
    }

    /* renamed from: q */
    public int mo28911q(long j, long j2) {
        throw mo29091C0();
    }

    /* renamed from: r */
    public long mo28912r(long j, long j2) {
        throw mo29091C0();
    }

    public String toString() {
        return "UnsupportedDurationField[" + mo29033Q() + C12361b.f30261l;
    }

    /* renamed from: u0 */
    public int compareTo(C12646e eVar) {
        return 0;
    }

    /* renamed from: w */
    public long mo29041w(int i) {
        throw mo29091C0();
    }

    /* renamed from: y */
    public long mo28934y(int i, long j) {
        throw mo29091C0();
    }

    /* renamed from: z */
    public long mo29042z(long j) {
        throw mo29091C0();
    }
}
