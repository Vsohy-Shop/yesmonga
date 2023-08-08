package org.joda.time.p014tz;

import org.joda.time.DateTimeZone;

/* renamed from: org.joda.time.tz.CachedDateTimeZone */
public class CachedDateTimeZone extends DateTimeZone {
    private static final long serialVersionUID = 5472298452022250685L;

    /* renamed from: v */
    public static final int f31377v;

    /* renamed from: g */
    public final transient C12716a[] f31378g = new C12716a[(f31377v + 1)];
    private final DateTimeZone iZone;

    /* renamed from: org.joda.time.tz.CachedDateTimeZone$a */
    public static final class C12716a {

        /* renamed from: a */
        public final long f31379a;

        /* renamed from: b */
        public final DateTimeZone f31380b;

        /* renamed from: c */
        public C12716a f31381c;

        /* renamed from: d */
        public String f31382d;

        /* renamed from: e */
        public int f31383e = Integer.MIN_VALUE;

        /* renamed from: f */
        public int f31384f = Integer.MIN_VALUE;

        public C12716a(DateTimeZone dateTimeZone, long j) {
            this.f31379a = j;
            this.f31380b = dateTimeZone;
        }

        /* renamed from: a */
        public String mo29397a(long j) {
            C12716a aVar = this.f31381c;
            if (aVar != null && j >= aVar.f31379a) {
                return aVar.mo29397a(j);
            }
            if (this.f31382d == null) {
                this.f31382d = this.f31380b.mo27829u(this.f31379a);
            }
            return this.f31382d;
        }

        /* renamed from: b */
        public int mo29398b(long j) {
            C12716a aVar = this.f31381c;
            if (aVar != null && j >= aVar.f31379a) {
                return aVar.mo29398b(j);
            }
            if (this.f31383e == Integer.MIN_VALUE) {
                this.f31383e = this.f31380b.mo27830w(this.f31379a);
            }
            return this.f31383e;
        }

        /* renamed from: c */
        public int mo29399c(long j) {
            C12716a aVar = this.f31381c;
            if (aVar != null && j >= aVar.f31379a) {
                return aVar.mo29399c(j);
            }
            if (this.f31384f == Integer.MIN_VALUE) {
                this.f31384f = this.f31380b.mo27811C(this.f31379a);
            }
            return this.f31384f;
        }
    }

    static {
        Integer num;
        int i;
        try {
            num = Integer.getInteger("org.joda.time.tz.CachedDateTimeZone.size");
        } catch (SecurityException unused) {
            num = null;
        }
        if (num == null) {
            i = 512;
        } else {
            int i2 = 0;
            for (int intValue = num.intValue() - 1; intValue > 0; intValue >>= 1) {
                i2++;
            }
            i = 1 << i2;
        }
        f31377v = i - 1;
    }

    public CachedDateTimeZone(DateTimeZone dateTimeZone) {
        super(dateTimeZone.mo27824q());
        this.iZone = dateTimeZone;
    }

    /* renamed from: Q */
    public static CachedDateTimeZone m54622Q(DateTimeZone dateTimeZone) {
        if (dateTimeZone instanceof CachedDateTimeZone) {
            return (CachedDateTimeZone) dateTimeZone;
        }
        return new CachedDateTimeZone(dateTimeZone);
    }

    /* renamed from: C */
    public int mo27811C(long j) {
        return mo29395R(j).mo29399c(j);
    }

    /* renamed from: D */
    public boolean mo27812D() {
        return this.iZone.mo27812D();
    }

    /* renamed from: G */
    public long mo27815G(long j) {
        return this.iZone.mo27815G(j);
    }

    /* renamed from: I */
    public long mo27816I(long j) {
        return this.iZone.mo27816I(j);
    }

    /* renamed from: P */
    public final C12716a mo29394P(long j) {
        long j2 = j & -4294967296L;
        C12716a aVar = new C12716a(this.iZone, j2);
        long j3 = 4294967295L | j2;
        C12716a aVar2 = aVar;
        while (true) {
            long G = this.iZone.mo27815G(j2);
            if (G == j2 || G > j3) {
                return aVar;
            }
            C12716a aVar3 = new C12716a(this.iZone, G);
            aVar2.f31381c = aVar3;
            aVar2 = aVar3;
            j2 = G;
        }
        return aVar;
    }

    /* renamed from: R */
    public final C12716a mo29395R(long j) {
        int i = (int) (j >> 32);
        C12716a[] aVarArr = this.f31378g;
        int i2 = f31377v & i;
        C12716a aVar = aVarArr[i2];
        if (aVar != null && ((int) (aVar.f31379a >> 32)) == i) {
            return aVar;
        }
        C12716a P = mo29394P(j);
        aVarArr[i2] = P;
        return P;
    }

    /* renamed from: S */
    public DateTimeZone mo29396S() {
        return this.iZone;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CachedDateTimeZone) {
            return this.iZone.equals(((CachedDateTimeZone) obj).iZone);
        }
        return false;
    }

    public int hashCode() {
        return this.iZone.hashCode();
    }

    /* renamed from: u */
    public String mo27829u(long j) {
        return mo29395R(j).mo29397a(j);
    }

    /* renamed from: w */
    public int mo27830w(long j) {
        return mo29395R(j).mo29398b(j);
    }
}
