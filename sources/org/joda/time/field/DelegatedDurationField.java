package org.joda.time.field;

import java.io.Serializable;
import kotlinx.serialization.json.internal.C12361b;
import org.joda.time.C12646e;
import org.joda.time.DurationFieldType;

public class DelegatedDurationField extends C12646e implements Serializable {
    private static final long serialVersionUID = -5576443481242007829L;
    private final C12646e iField;
    private final DurationFieldType iType;

    public DelegatedDurationField(C12646e eVar) {
        this(eVar, (DurationFieldType) null);
    }

    /* renamed from: A0 */
    public final C12646e mo29075A0() {
        return this.iField;
    }

    /* renamed from: M */
    public long mo28931M(long j, long j2) {
        return this.iField.mo28931M(j, j2);
    }

    /* renamed from: Q */
    public String mo29033Q() {
        return this.iType.mo27878e();
    }

    /* renamed from: W */
    public DurationFieldType mo29034W() {
        return this.iType;
    }

    /* renamed from: X */
    public long mo28947X() {
        return this.iField.mo28947X();
    }

    /* renamed from: Z */
    public int mo29035Z(long j) {
        return this.iField.mo29035Z(j);
    }

    /* renamed from: b */
    public long mo28909b(long j, int i) {
        return this.iField.mo28909b(j, i);
    }

    /* renamed from: e0 */
    public int mo28932e0(long j, long j2) {
        return this.iField.mo28932e0(j, j2);
    }

    public boolean equals(Object obj) {
        if (obj instanceof DelegatedDurationField) {
            return this.iField.equals(((DelegatedDurationField) obj).iField);
        }
        return false;
    }

    /* renamed from: f0 */
    public long mo29036f0(long j) {
        return this.iField.mo29036f0(j);
    }

    /* renamed from: g */
    public long mo28910g(long j, long j2) {
        return this.iField.mo28910g(j, j2);
    }

    public int hashCode() {
        return this.iField.hashCode() ^ this.iType.hashCode();
    }

    /* renamed from: m0 */
    public long mo28933m0(long j, long j2) {
        return this.iField.mo28933m0(j, j2);
    }

    /* renamed from: n0 */
    public boolean mo28950n0() {
        return this.iField.mo28950n0();
    }

    /* renamed from: o0 */
    public boolean mo29037o0() {
        return this.iField.mo29037o0();
    }

    /* renamed from: q */
    public int mo28911q(long j, long j2) {
        return this.iField.mo28911q(j, j2);
    }

    /* renamed from: r */
    public long mo28912r(long j, long j2) {
        return this.iField.mo28912r(j, j2);
    }

    public String toString() {
        if (this.iType == null) {
            return this.iField.toString();
        }
        return "DurationField[" + this.iType + C12361b.f30261l;
    }

    /* renamed from: u0 */
    public int compareTo(C12646e eVar) {
        return this.iField.compareTo(eVar);
    }

    /* renamed from: w */
    public long mo29041w(int i) {
        return this.iField.mo29041w(i);
    }

    /* renamed from: y */
    public long mo28934y(int i, long j) {
        return this.iField.mo28934y(i, j);
    }

    /* renamed from: z */
    public long mo29042z(long j) {
        return this.iField.mo29042z(j);
    }

    public DelegatedDurationField(C12646e eVar, DurationFieldType durationFieldType) {
        if (eVar != null) {
            this.iField = eVar;
            this.iType = durationFieldType == null ? eVar.mo29034W() : durationFieldType;
            return;
        }
        throw new IllegalArgumentException("The field must not be null");
    }
}
