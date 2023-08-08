package org.joda.time.field;

import java.io.Serializable;
import org.joda.time.C12646e;
import org.joda.time.DurationFieldType;

public final class MillisDurationField extends C12646e implements Serializable {

    /* renamed from: a */
    public static final C12646e f31128a = new MillisDurationField();
    private static final long serialVersionUID = 2656707858124633367L;

    private MillisDurationField() {
    }

    private Object readResolve() {
        return f31128a;
    }

    /* renamed from: M */
    public long mo28931M(long j, long j2) {
        return j;
    }

    /* renamed from: Q */
    public String mo29033Q() {
        return "millis";
    }

    /* renamed from: W */
    public DurationFieldType mo29034W() {
        return DurationFieldType.m51460i();
    }

    /* renamed from: X */
    public final long mo28947X() {
        return 1;
    }

    /* renamed from: Z */
    public int mo29035Z(long j) {
        return C12652e.m53804n(j);
    }

    /* renamed from: b */
    public long mo28909b(long j, int i) {
        return C12652e.m53795e(j, (long) i);
    }

    /* renamed from: e0 */
    public int mo28932e0(long j, long j2) {
        return C12652e.m53804n(j);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof MillisDurationField) || mo28947X() != ((MillisDurationField) obj).mo28947X()) {
            return false;
        }
        return true;
    }

    /* renamed from: f0 */
    public long mo29036f0(long j) {
        return j;
    }

    /* renamed from: g */
    public long mo28910g(long j, long j2) {
        return C12652e.m53795e(j, j2);
    }

    public int hashCode() {
        return (int) mo28947X();
    }

    /* renamed from: m0 */
    public long mo28933m0(long j, long j2) {
        return j;
    }

    /* renamed from: n0 */
    public final boolean mo28950n0() {
        return true;
    }

    /* renamed from: o0 */
    public boolean mo29037o0() {
        return true;
    }

    /* renamed from: q */
    public int mo28911q(long j, long j2) {
        return C12652e.m53804n(C12652e.m53803m(j, j2));
    }

    /* renamed from: r */
    public long mo28912r(long j, long j2) {
        return C12652e.m53803m(j, j2);
    }

    public String toString() {
        return "DurationField[millis]";
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
        return (long) i;
    }

    /* renamed from: y */
    public long mo28934y(int i, long j) {
        return (long) i;
    }

    /* renamed from: z */
    public long mo29042z(long j) {
        return j;
    }
}
