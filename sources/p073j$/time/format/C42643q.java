package p073j$.time.format;

import p073j$.time.LocalDate;
import p073j$.time.chrono.C42594b;
import p073j$.time.chrono.Chronology;
import p073j$.time.temporal.C42675n;

/* renamed from: j$.time.format.q */
final class C42643q extends C42637k {

    /* renamed from: i */
    static final LocalDate f107891i = LocalDate.m171813of(2000, 1, 1);

    /* renamed from: g */
    private final int f107892g;

    /* renamed from: h */
    private final C42594b f107893h;

    private C42643q(C42675n nVar, int i, int i2, int i3, C42594b bVar, int i4) {
        super(nVar, i, i2, C42625D.NOT_NEGATIVE, i4);
        this.f107892g = i3;
        this.f107893h = bVar;
    }

    C42643q(C42675n nVar, LocalDate localDate) {
        this(nVar, 2, 2, 0, localDate, 0);
    }

    /* synthetic */ C42643q(C42675n nVar, LocalDate localDate, int i) {
        this(nVar, 2, 2, 0, localDate, 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final long mo138143b(C42651y yVar, long j) {
        long abs = Math.abs(j);
        C42594b bVar = this.f107893h;
        long j2 = (long) (bVar != null ? Chronology.m172024H(yVar.mo138184d()).mo138039t(bVar).mo137890j(this.f107868a) : this.f107892g);
        int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        long[] jArr = C42637k.f107867f;
        if (i >= 0) {
            long j3 = jArr[this.f107869b];
            if (j < j2 + j3) {
                return abs % j3;
            }
        }
        return abs % jArr[this.f107870c];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo138144c(C42649w wVar) {
        if (!wVar.mo138171l()) {
            return false;
        }
        return super.mo138144c(wVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final int mo138145d(C42649w wVar, long j, int i, int i2) {
        int i3;
        C42594b bVar = this.f107893h;
        if (bVar != null) {
            i3 = wVar.mo138167h().mo138039t(bVar).mo137890j(this.f107868a);
            wVar.mo138162a(new C42642p(this, wVar, j, i, i2));
        } else {
            i3 = this.f107892g;
        }
        int i4 = i2 - i;
        int i5 = this.f107869b;
        if (i4 == i5 && j >= 0) {
            long j2 = C42637k.f107867f[i5];
            long j3 = (long) i3;
            long j4 = j3 - (j3 % j2);
            j = i3 > 0 ? j4 + j : j4 - j;
            if (j < j3) {
                j += j2;
            }
        }
        return wVar.mo138174o(this.f107868a, j, i, i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final C42637k mo138146e() {
        return this.f107872e == -1 ? this : new C42643q(this.f107868a, this.f107869b, this.f107870c, this.f107892g, this.f107893h, -1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final C42637k mo138147f(int i) {
        return new C42643q(this.f107868a, this.f107869b, this.f107870c, this.f107892g, this.f107893h, this.f107872e + i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReducedValue(");
        sb.append(this.f107868a);
        sb.append(",");
        sb.append(this.f107869b);
        sb.append(",");
        sb.append(this.f107870c);
        sb.append(",");
        Object obj = this.f107893h;
        if (obj == null) {
            obj = Integer.valueOf(this.f107892g);
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
