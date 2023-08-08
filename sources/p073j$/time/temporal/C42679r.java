package p073j$.time.temporal;

import java.io.Serializable;
import p073j$.time.C42586c;

/* renamed from: j$.time.temporal.r */
public final class C42679r implements Serializable {

    /* renamed from: a */
    private final long f107970a;

    /* renamed from: b */
    private final long f107971b;

    /* renamed from: c */
    private final long f107972c;

    /* renamed from: d */
    private final long f107973d;

    private C42679r(long j, long j2, long j3, long j4) {
        this.f107970a = j;
        this.f107971b = j2;
        this.f107972c = j3;
        this.f107973d = j4;
    }

    /* renamed from: c */
    private String m172525c(long j, C42675n nVar) {
        if (nVar != null) {
            return "Invalid value for " + nVar + " (valid values " + this + "): " + j;
        }
        return "Invalid value (valid values " + this + "): " + j;
    }

    /* renamed from: j */
    public static C42679r m172526j(long j, long j2) {
        if (j <= j2) {
            return new C42679r(j, j, j2, j2);
        }
        throw new IllegalArgumentException("Minimum value must be less than maximum value");
    }

    /* renamed from: k */
    public static C42679r m172527k(long j, long j2, long j3) {
        if (j > 1) {
            throw new IllegalArgumentException("Smallest minimum value must be less than largest minimum value");
        } else if (j2 > j3) {
            throw new IllegalArgumentException("Smallest maximum value must be less than largest maximum value");
        } else if (1 <= j3) {
            return new C42679r(j, 1, j2, j3);
        } else {
            throw new IllegalArgumentException("Minimum value must be less than maximum value");
        }
    }

    /* renamed from: l */
    public static C42679r m172528l(long j, long j2) {
        return m172527k(1, j, j2);
    }

    /* renamed from: a */
    public final int mo138226a(long j, C42675n nVar) {
        if (mo138233h() && mo138235i(j)) {
            return (int) j;
        }
        throw new C42586c(m172525c(j, nVar));
    }

    /* renamed from: b */
    public final void mo138227b(long j, C42675n nVar) {
        if (!mo138235i(j)) {
            throw new C42586c(m172525c(j, nVar));
        }
    }

    /* renamed from: d */
    public final long mo138228d() {
        return this.f107973d;
    }

    /* renamed from: e */
    public final long mo138229e() {
        return this.f107970a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C42679r)) {
            return false;
        }
        C42679r rVar = (C42679r) obj;
        return this.f107970a == rVar.f107970a && this.f107971b == rVar.f107971b && this.f107972c == rVar.f107972c && this.f107973d == rVar.f107973d;
    }

    /* renamed from: f */
    public final long mo138231f() {
        return this.f107972c;
    }

    /* renamed from: g */
    public final boolean mo138232g() {
        return this.f107970a == this.f107971b && this.f107972c == this.f107973d;
    }

    /* renamed from: h */
    public final boolean mo138233h() {
        return this.f107970a >= -2147483648L && this.f107973d <= 2147483647L;
    }

    public final int hashCode() {
        long j = this.f107970a;
        long j2 = this.f107971b;
        long j3 = j + (j2 << 16) + (j2 >> 48);
        long j4 = this.f107972c;
        long j5 = j3 + (j4 << 32) + (j4 >> 32);
        long j6 = this.f107973d;
        long j7 = j5 + (j6 << 48) + (j6 >> 16);
        return (int) (j7 ^ (j7 >>> 32));
    }

    /* renamed from: i */
    public final boolean mo138235i(long j) {
        return j >= this.f107970a && j <= this.f107973d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f107970a);
        if (this.f107970a != this.f107971b) {
            sb.append('/');
            sb.append(this.f107971b);
        }
        sb.append(" - ");
        sb.append(this.f107972c);
        if (this.f107972c != this.f107973d) {
            sb.append('/');
            sb.append(this.f107973d);
        }
        return sb.toString();
    }
}
