package p073j$.time.chrono;

import p073j$.time.C42586c;
import p073j$.time.C42619d;
import p073j$.time.C42658l;
import p073j$.time.LocalDate;
import p073j$.time.LocalTime;
import p073j$.time.temporal.C42662a;
import p073j$.time.temporal.C42672k;
import p073j$.time.temporal.C42675n;
import p073j$.time.temporal.C42677p;
import p073j$.time.temporal.C42678q;
import p073j$.time.temporal.C42679r;
import p073j$.time.temporal.ChronoUnit;

/* renamed from: j$.time.chrono.u */
public final class C42613u extends C42596d {

    /* renamed from: d */
    static final LocalDate f107795d = LocalDate.m171813of(1873, 1, 1);

    /* renamed from: a */
    private final transient LocalDate f107796a;

    /* renamed from: b */
    private transient C42614v f107797b;

    /* renamed from: c */
    private transient int f107798c;

    C42613u(LocalDate localDate) {
        if (!localDate.mo137916K(f107795d)) {
            this.f107797b = C42614v.m172242n(localDate);
            this.f107798c = (localDate.getYear() - this.f107797b.mo138087p().getYear()) + 1;
            this.f107796a = localDate;
            return;
        }
        throw new C42586c("JapaneseDate before Meiji 6 is not supported");
    }

    C42613u(C42614v vVar, int i, LocalDate localDate) {
        if (!localDate.mo137916K(f107795d)) {
            this.f107797b = vVar;
            this.f107798c = i;
            this.f107796a = localDate;
            return;
        }
        throw new C42586c("JapaneseDate before Meiji 6 is not supported");
    }

    /* renamed from: Y */
    private C42613u m172218Y(LocalDate localDate) {
        return localDate.equals(this.f107796a) ? this : new C42613u(localDate);
    }

    /* renamed from: D */
    public final C42594b mo137914D(C42658l lVar) {
        return (C42613u) super.mo137914D(lVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public final C42594b mo138053E(long j) {
        return m172218Y(this.f107796a.mo137927d0(j));
    }

    /* renamed from: K */
    public final C42614v mo138083K() {
        return this.f107797b;
    }

    /* renamed from: L */
    public final C42613u m172230b(long j, C42677p pVar) {
        return (C42613u) super.mo137905b(j, pVar);
    }

    /* renamed from: M */
    public final int mo137917M() {
        C42614v q = this.f107797b.mo138088q();
        int M = (q == null || q.mo138087p().getYear() != this.f107796a.getYear()) ? this.f107796a.mo137917M() : q.mo138087p().mo137915E() - 1;
        return this.f107798c == 1 ? M - (this.f107797b.mo138087p().mo137915E() - 1) : M;
    }

    /* renamed from: N */
    public final ChronoLocalDateTime mo137918N(LocalTime localTime) {
        return C42598f.m172096o(this, localTime);
    }

    /* renamed from: R */
    public final C42613u m172227a(long j, C42675n nVar) {
        if (!(nVar instanceof C42662a)) {
            return (C42613u) super.mo137902a(j, nVar);
        }
        C42662a aVar = (C42662a) nVar;
        if (mo137886g(aVar) == j) {
            return this;
        }
        int[] iArr = C42612t.f107794a;
        int i = iArr[aVar.ordinal()];
        if (i == 3 || i == 8 || i == 9) {
            C42611s sVar = C42611s.f107793d;
            int a = sVar.mo138036W(aVar).mo138226a(j, aVar);
            int i2 = iArr[aVar.ordinal()];
            if (i2 == 3) {
                return m172218Y(this.f107796a.mo137940i0(sVar.mo138040x(this.f107797b, a)));
            } else if (i2 == 8) {
                return m172218Y(this.f107796a.mo137940i0(sVar.mo138040x(C42614v.m172244r(a), this.f107798c)));
            } else if (i2 == 9) {
                return m172218Y(this.f107796a.mo137940i0(a));
            }
        }
        return m172218Y(this.f107796a.m171823a(j, nVar));
    }

    /* renamed from: a0 */
    public final C42613u mo137941k(C42672k kVar) {
        return (C42613u) super.mo137941k(kVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C42613u) {
            return this.f107796a.equals(((C42613u) obj).f107796a);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo137885f(C42675n nVar) {
        if (nVar == C42662a.ALIGNED_DAY_OF_WEEK_IN_MONTH || nVar == C42662a.ALIGNED_DAY_OF_WEEK_IN_YEAR || nVar == C42662a.ALIGNED_WEEK_OF_MONTH || nVar == C42662a.ALIGNED_WEEK_OF_YEAR) {
            return false;
        }
        return nVar instanceof C42662a ? nVar.mo138216n() : nVar != null && nVar.mo138213Y(this);
    }

    /* renamed from: g */
    public final long mo137886g(C42675n nVar) {
        if (!(nVar instanceof C42662a)) {
            return nVar.mo138218q(this);
        }
        switch (C42612t.f107794a[((C42662a) nVar).ordinal()]) {
            case 2:
                return this.f107798c == 1 ? (long) ((this.f107796a.mo137915E() - this.f107797b.mo138087p().mo137915E()) + 1) : (long) this.f107796a.mo137915E();
            case 3:
                return (long) this.f107798c;
            case 4:
            case 5:
            case 6:
            case 7:
                throw new C42678q(C42619d.m172286a("Unsupported field: ", nVar));
            case 8:
                return (long) this.f107797b.getValue();
            default:
                return this.f107796a.mo137886g(nVar);
        }
    }

    /* renamed from: h */
    public final Chronology mo137937h() {
        return C42611s.f107793d;
    }

    public final int hashCode() {
        C42611s.f107793d.getClass();
        return this.f107796a.hashCode() ^ -688086063;
    }

    /* renamed from: i */
    public final C42679r mo137889i(C42675n nVar) {
        long j;
        int i;
        if (!(nVar instanceof C42662a)) {
            return nVar.mo138212L(this);
        }
        if (mo137885f(nVar)) {
            C42662a aVar = (C42662a) nVar;
            int i2 = C42612t.f107794a[aVar.ordinal()];
            if (i2 == 1) {
                i = this.f107796a.lengthOfMonth();
            } else if (i2 == 2) {
                i = mo137917M();
            } else if (i2 != 3) {
                return C42611s.f107793d.mo138036W(aVar);
            } else {
                int year = this.f107797b.mo138087p().getYear();
                C42614v q = this.f107797b.mo138088q();
                j = (long) (q != null ? (q.mo138087p().getYear() - year) + 1 : 999999999 - year);
                return C42679r.m172526j(1, j);
            }
            j = (long) i;
            return C42679r.m172526j(1, j);
        }
        throw new C42678q(C42619d.m172286a("Unsupported field: ", nVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final C42594b mo138055o(long j) {
        return m172218Y(this.f107796a.mo137924b0(j));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final C42594b mo138056q(long j) {
        return m172218Y(this.f107796a.plusMonths(j));
    }

    /* renamed from: u */
    public final C42602j mo137947u() {
        return this.f107797b;
    }

    /* renamed from: v */
    public final C42594b mo137948v(long j, ChronoUnit chronoUnit) {
        return (C42613u) super.mo137948v(j, chronoUnit);
    }

    /* renamed from: w */
    public final long mo137949w() {
        return this.f107796a.mo137949w();
    }
}
