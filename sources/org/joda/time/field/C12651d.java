package org.joda.time.field;

import org.joda.time.C12599c;
import org.joda.time.C12646e;
import org.joda.time.DateTimeFieldType;

/* renamed from: org.joda.time.field.d */
public class C12651d extends C12650c {

    /* renamed from: w */
    public static final long f31136w = 8318475124230605365L;

    /* renamed from: d */
    public final int f31137d;

    /* renamed from: e */
    public final C12646e f31138e;

    /* renamed from: f */
    public final C12646e f31139f;

    /* renamed from: g */
    public final int f31140g;

    /* renamed from: v */
    public final int f31141v;

    public C12651d(C12599c cVar, DateTimeFieldType dateTimeFieldType, int i) {
        this(cVar, cVar.mo28805H(), dateTimeFieldType, i);
    }

    /* renamed from: C */
    public int mo28800C() {
        return this.f31140g;
    }

    /* renamed from: H */
    public C12646e mo28805H() {
        C12646e eVar = this.f31139f;
        if (eVar != null) {
            return eVar;
        }
        return super.mo28805H();
    }

    /* renamed from: M */
    public long mo28810M(long j) {
        return mo28816S(j, mo28828g(mo29116Z().mo28810M(j)));
    }

    /* renamed from: O */
    public long mo28812O(long j) {
        C12599c Z = mo29116Z();
        return Z.mo28812O(Z.mo28816S(j, mo28828g(j) * this.f31137d));
    }

    /* renamed from: S */
    public long mo28816S(long j, int i) {
        C12652e.m53806p(this, i, this.f31140g, this.f31141v);
        return mo29116Z().mo28816S(j, (i * this.f31137d) + mo29118b0(mo29116Z().mo28828g(j)));
    }

    /* renamed from: a */
    public long mo28822a(long j, int i) {
        return mo29116Z().mo28822a(j, i * this.f31137d);
    }

    /* renamed from: a0 */
    public int mo29117a0() {
        return this.f31137d;
    }

    /* renamed from: b */
    public long mo28823b(long j, long j2) {
        return mo29116Z().mo28823b(j, j2 * ((long) this.f31137d));
    }

    /* renamed from: b0 */
    public final int mo29118b0(int i) {
        if (i >= 0) {
            return i % this.f31137d;
        }
        int i2 = this.f31137d;
        return (i2 - 1) + ((i + 1) % i2);
    }

    /* renamed from: d */
    public long mo28825d(long j, int i) {
        return mo28816S(j, C12652e.m53793c(mo28828g(j), i, this.f31140g, this.f31141v));
    }

    /* renamed from: g */
    public int mo28828g(long j) {
        int g = mo29116Z().mo28828g(j);
        if (g >= 0) {
            return g / this.f31137d;
        }
        return ((g + 1) / this.f31137d) - 1;
    }

    /* renamed from: r */
    public int mo28839r(long j, long j2) {
        return mo29116Z().mo28839r(j, j2) / this.f31137d;
    }

    /* renamed from: s */
    public long mo28840s(long j, long j2) {
        return mo29116Z().mo28840s(j, j2) / ((long) this.f31137d);
    }

    /* renamed from: t */
    public C12646e mo28841t() {
        return this.f31138e;
    }

    /* renamed from: y */
    public int mo28847y() {
        return this.f31141v;
    }

    public C12651d(C12599c cVar, C12646e eVar, DateTimeFieldType dateTimeFieldType, int i) {
        super(cVar, dateTimeFieldType);
        if (i >= 2) {
            C12646e t = cVar.mo28841t();
            if (t == null) {
                this.f31138e = null;
            } else {
                this.f31138e = new ScaledDurationField(t, dateTimeFieldType.mo27801E(), i);
            }
            this.f31139f = eVar;
            this.f31137d = i;
            int C = cVar.mo28800C();
            int i2 = C >= 0 ? C / i : ((C + 1) / i) - 1;
            int y = cVar.mo28847y();
            int i3 = y >= 0 ? y / i : ((y + 1) / i) - 1;
            this.f31140g = i2;
            this.f31141v = i3;
            return;
        }
        throw new IllegalArgumentException("The divisor must be at least 2");
    }

    public C12651d(C12656i iVar, DateTimeFieldType dateTimeFieldType) {
        this(iVar, (C12646e) null, dateTimeFieldType);
    }

    public C12651d(C12656i iVar, C12646e eVar, DateTimeFieldType dateTimeFieldType) {
        super(iVar.mo29116Z(), dateTimeFieldType);
        int i = iVar.f31153d;
        this.f31137d = i;
        this.f31138e = iVar.f31155f;
        this.f31139f = eVar;
        C12599c Z = mo29116Z();
        int C = Z.mo28800C();
        int i2 = C >= 0 ? C / i : ((C + 1) / i) - 1;
        int y = Z.mo28847y();
        int i3 = y >= 0 ? y / i : ((y + 1) / i) - 1;
        this.f31140g = i2;
        this.f31141v = i3;
    }
}
