package org.joda.time.field;

import org.joda.time.C12646e;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationFieldType;

public abstract class ImpreciseDateTimeField extends C12649b {

    /* renamed from: d */
    public static final long f31125d = 7190739608550251860L;

    /* renamed from: b */
    public final long f31126b;

    /* renamed from: c */
    public final C12646e f31127c;

    public final class LinkedDurationField extends BaseDurationField {
        private static final long serialVersionUID = -203813474600094134L;

        public LinkedDurationField(DurationFieldType durationFieldType) {
            super(durationFieldType);
        }

        /* renamed from: M */
        public long mo28931M(long j, long j2) {
            return ImpreciseDateTimeField.this.mo28823b(j2, j) - j2;
        }

        /* renamed from: X */
        public long mo28947X() {
            return ImpreciseDateTimeField.this.f31126b;
        }

        /* renamed from: b */
        public long mo28909b(long j, int i) {
            return ImpreciseDateTimeField.this.mo28822a(j, i);
        }

        /* renamed from: e0 */
        public int mo28932e0(long j, long j2) {
            return ImpreciseDateTimeField.this.mo28839r(j + j2, j2);
        }

        /* renamed from: g */
        public long mo28910g(long j, long j2) {
            return ImpreciseDateTimeField.this.mo28823b(j, j2);
        }

        /* renamed from: m0 */
        public long mo28933m0(long j, long j2) {
            return ImpreciseDateTimeField.this.mo28840s(j + j2, j2);
        }

        /* renamed from: n0 */
        public boolean mo28950n0() {
            return false;
        }

        /* renamed from: q */
        public int mo28911q(long j, long j2) {
            return ImpreciseDateTimeField.this.mo28839r(j, j2);
        }

        /* renamed from: r */
        public long mo28912r(long j, long j2) {
            return ImpreciseDateTimeField.this.mo28840s(j, j2);
        }

        /* renamed from: y */
        public long mo28934y(int i, long j) {
            return ImpreciseDateTimeField.this.mo28822a(j, i) - j;
        }
    }

    public ImpreciseDateTimeField(DateTimeFieldType dateTimeFieldType, long j) {
        super(dateTimeFieldType);
        this.f31126b = j;
        this.f31127c = new LinkedDurationField(dateTimeFieldType.mo27801E());
    }

    /* renamed from: H */
    public abstract C12646e mo28805H();

    /* renamed from: O */
    public abstract long mo28812O(long j);

    /* renamed from: S */
    public abstract long mo28816S(long j, int i);

    /* renamed from: Z */
    public final long mo29080Z() {
        return this.f31126b;
    }

    /* renamed from: a */
    public abstract long mo28822a(long j, int i);

    /* renamed from: b */
    public abstract long mo28823b(long j, long j2);

    /* renamed from: g */
    public abstract int mo28828g(long j);

    /* renamed from: r */
    public int mo28839r(long j, long j2) {
        return C12652e.m53804n(mo28840s(j, j2));
    }

    /* renamed from: s */
    public long mo28840s(long j, long j2) {
        if (j < j2) {
            return -mo28840s(j2, j);
        }
        long j3 = (j - j2) / this.f31126b;
        if (mo28823b(j2, j3) < j) {
            do {
                j3++;
            } while (mo28823b(j2, j3) <= j);
            return j3 - 1;
        } else if (mo28823b(j2, j3) <= j) {
            return j3;
        } else {
            do {
                j3--;
            } while (mo28823b(j2, j3) > j);
            return j3;
        }
    }

    /* renamed from: t */
    public final C12646e mo28841t() {
        return this.f31127c;
    }
}
