package p073j$.time.chrono;

import java.util.Objects;
import p073j$.time.C42619d;
import p073j$.time.C42658l;
import p073j$.time.LocalDate;
import p073j$.time.LocalTime;
import p073j$.time.temporal.C42662a;
import p073j$.time.temporal.C42671j;
import p073j$.time.temporal.C42672k;
import p073j$.time.temporal.C42675n;
import p073j$.time.temporal.C42677p;
import p073j$.time.temporal.C42678q;
import p073j$.time.temporal.C42679r;
import p073j$.time.temporal.ChronoUnit;

/* renamed from: j$.time.chrono.z */
public final class C42618z extends C42596d {

    /* renamed from: a */
    private final transient LocalDate f107807a;

    C42618z(LocalDate localDate) {
        Objects.requireNonNull(localDate, "isoDate");
        this.f107807a = localDate;
    }

    /* renamed from: K */
    private int m172266K() {
        return this.f107807a.getYear() - 1911;
    }

    /* renamed from: R */
    private C42618z m172267R(LocalDate localDate) {
        return localDate.equals(this.f107807a) ? this : new C42618z(localDate);
    }

    /* renamed from: D */
    public final C42594b mo137914D(C42658l lVar) {
        return (C42618z) super.mo137914D(lVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public final C42594b mo138053E(long j) {
        return m172267R(this.f107807a.mo137927d0(j));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        if (r2 != 7) goto L_0x0064;
     */
    /* renamed from: L */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p073j$.time.chrono.C42618z m172273a(long r8, p073j$.time.temporal.C42675n r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof p073j$.time.temporal.C42662a
            if (r0 == 0) goto L_0x00a5
            r0 = r10
            j$.time.temporal.a r0 = (p073j$.time.temporal.C42662a) r0
            long r1 = r7.mo137886g(r0)
            int r1 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r1 != 0) goto L_0x0010
            return r7
        L_0x0010:
            int[] r1 = p073j$.time.chrono.C42617y.f107806a
            int r2 = r0.ordinal()
            r2 = r1[r2]
            r3 = 7
            r4 = 6
            r5 = 4
            if (r2 == r5) goto L_0x004d
            r6 = 5
            if (r2 == r6) goto L_0x0025
            if (r2 == r4) goto L_0x004d
            if (r2 == r3) goto L_0x004d
            goto L_0x0064
        L_0x0025:
            j$.time.chrono.x r10 = p073j$.time.chrono.C42616x.f107805d
            j$.time.temporal.r r10 = r10.mo138036W(r0)
            r10.mo138227b(r8, r0)
            int r10 = r7.m172266K()
            long r0 = (long) r10
            r2 = 12
            long r0 = r0 * r2
            j$.time.LocalDate r10 = r7.f107807a
            int r10 = r10.getMonthValue()
            long r2 = (long) r10
            long r0 = r0 + r2
            r2 = 1
            long r0 = r0 - r2
            long r8 = r8 - r0
            j$.time.LocalDate r10 = r7.f107807a
            j$.time.LocalDate r8 = r10.plusMonths(r8)
            j$.time.chrono.z r8 = r7.m172267R(r8)
            return r8
        L_0x004d:
            j$.time.chrono.x r2 = p073j$.time.chrono.C42616x.f107805d
            j$.time.temporal.r r2 = r2.mo138036W(r0)
            int r2 = r2.mo138226a(r8, r0)
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            if (r0 == r5) goto L_0x008e
            if (r0 == r4) goto L_0x0081
            if (r0 == r3) goto L_0x006f
        L_0x0064:
            j$.time.LocalDate r0 = r7.f107807a
            j$.time.LocalDate r8 = r0.m171823a(r8, r10)
            j$.time.chrono.z r8 = r7.m172267R(r8)
            return r8
        L_0x006f:
            j$.time.LocalDate r8 = r7.f107807a
            int r9 = r7.m172266K()
            int r1 = r1 - r9
            int r1 = r1 + 1911
            j$.time.LocalDate r8 = r8.mo137940i0(r1)
            j$.time.chrono.z r8 = r7.m172267R(r8)
            return r8
        L_0x0081:
            j$.time.LocalDate r8 = r7.f107807a
            int r2 = r2 + 1911
            j$.time.LocalDate r8 = r8.mo137940i0(r2)
            j$.time.chrono.z r8 = r7.m172267R(r8)
            return r8
        L_0x008e:
            j$.time.LocalDate r8 = r7.f107807a
            int r9 = r7.m172266K()
            if (r9 < r1) goto L_0x0099
            int r2 = r2 + 1911
            goto L_0x009c
        L_0x0099:
            int r1 = r1 - r2
            int r2 = r1 + 1911
        L_0x009c:
            j$.time.LocalDate r8 = r8.mo137940i0(r2)
            j$.time.chrono.z r8 = r7.m172267R(r8)
            return r8
        L_0x00a5:
            j$.time.chrono.b r8 = super.mo137902a(r8, r10)
            j$.time.chrono.z r8 = (p073j$.time.chrono.C42618z) r8
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p073j$.time.chrono.C42618z.m172273a(long, j$.time.temporal.n):j$.time.chrono.z");
    }

    /* renamed from: N */
    public final ChronoLocalDateTime mo137918N(LocalTime localTime) {
        return C42598f.m172096o(this, localTime);
    }

    /* renamed from: b */
    public final C42594b mo137905b(long j, C42677p pVar) {
        return (C42618z) super.mo137905b(j, pVar);
    }

    /* renamed from: b */
    public final C42671j m172275b(long j, C42677p pVar) {
        return (C42618z) super.mo137905b(j, pVar);
    }

    /* renamed from: e */
    public final C42671j mo137907e(LocalDate localDate) {
        return (C42618z) super.mo137941k(localDate);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C42618z) {
            return this.f107807a.equals(((C42618z) obj).f107807a);
        }
        return false;
    }

    /* renamed from: g */
    public final long mo137886g(C42675n nVar) {
        if (!(nVar instanceof C42662a)) {
            return nVar.mo138218q(this);
        }
        int i = C42617y.f107806a[((C42662a) nVar).ordinal()];
        int i2 = 1;
        if (i == 4) {
            int K = m172266K();
            if (K < 1) {
                K = 1 - K;
            }
            return (long) K;
        } else if (i == 5) {
            return ((((long) m172266K()) * 12) + ((long) this.f107807a.getMonthValue())) - 1;
        } else {
            if (i == 6) {
                return (long) m172266K();
            }
            if (i != 7) {
                return this.f107807a.mo137886g(nVar);
            }
            if (m172266K() < 1) {
                i2 = 0;
            }
            return (long) i2;
        }
    }

    /* renamed from: h */
    public final Chronology mo137937h() {
        return C42616x.f107805d;
    }

    public final int hashCode() {
        C42616x.f107805d.getClass();
        return this.f107807a.hashCode() ^ -1990173233;
    }

    /* renamed from: i */
    public final C42679r mo137889i(C42675n nVar) {
        if (!(nVar instanceof C42662a)) {
            return nVar.mo138212L(this);
        }
        if (mo137885f(nVar)) {
            C42662a aVar = (C42662a) nVar;
            int i = C42617y.f107806a[aVar.ordinal()];
            if (i == 1 || i == 2 || i == 3) {
                return this.f107807a.mo137889i(nVar);
            }
            if (i != 4) {
                return C42616x.f107805d.mo138036W(aVar);
            }
            C42679r E = C42662a.YEAR.mo138210E();
            return C42679r.m172526j(1, m172266K() <= 0 ? (-E.mo138229e()) + 1 + 1911 : E.mo138228d() - 1911);
        }
        throw new C42678q(C42619d.m172286a("Unsupported field: ", nVar));
    }

    /* renamed from: k */
    public final C42594b mo137941k(C42672k kVar) {
        return (C42618z) super.mo137941k(kVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final C42594b mo138055o(long j) {
        return m172267R(this.f107807a.mo137924b0(j));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final C42594b mo138056q(long j) {
        return m172267R(this.f107807a.plusMonths(j));
    }

    /* renamed from: u */
    public final C42602j mo137947u() {
        return m172266K() >= 1 ? C42587A.ROC : C42587A.BEFORE_ROC;
    }

    /* renamed from: v */
    public final C42594b mo137948v(long j, ChronoUnit chronoUnit) {
        return (C42618z) super.mo137948v(j, chronoUnit);
    }

    /* renamed from: w */
    public final long mo137949w() {
        return this.f107807a.mo137949w();
    }
}
