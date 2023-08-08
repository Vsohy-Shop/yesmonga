package p073j$.time.chrono;

import p073j$.time.Instant;
import p073j$.time.LocalTime;
import p073j$.time.ZoneId;
import p073j$.time.ZoneOffset;
import p073j$.time.chrono.C42594b;
import p073j$.time.temporal.C42662a;
import p073j$.time.temporal.C42671j;
import p073j$.time.temporal.C42672k;
import p073j$.time.temporal.C42675n;
import p073j$.time.temporal.C42676o;
import p073j$.time.temporal.C42677p;
import p073j$.time.temporal.C42678q;
import p073j$.time.temporal.C42679r;
import p073j$.time.temporal.ChronoUnit;
import p073j$.time.temporal.TemporalQuery;

/* renamed from: j$.time.chrono.ChronoZonedDateTime */
public interface ChronoZonedDateTime<D extends C42594b> extends C42671j, Comparable<ChronoZonedDateTime<?>> {
    /* renamed from: A */
    int compareTo(ChronoZonedDateTime chronoZonedDateTime) {
        int compare = Long.compare(mo138046S(), chronoZonedDateTime.mo138046S());
        if (compare != 0) {
            return compare;
        }
        int K = mo138016l().mo137973K() - chronoZonedDateTime.mo138016l().mo137973K();
        if (K != 0) {
            return K;
        }
        int Z = mo138006C().compareTo(chronoZonedDateTime.mo138006C());
        if (Z != 0) {
            return Z;
        }
        int compareTo = mo138010U().mo138002s().compareTo(chronoZonedDateTime.mo138010U().mo138002s());
        return compareTo == 0 ? mo138048h().mo138051r(chronoZonedDateTime.mo138048h()) : compareTo;
    }

    /* renamed from: C */
    ChronoLocalDateTime mo138006C();

    /* renamed from: S */
    long mo138046S() {
        return ((mo138017m().mo137949w() * 86400) + ((long) mo138016l().mo137982g0())) - ((long) getOffset().mo138005q());
    }

    /* renamed from: U */
    ZoneId mo138010U();

    /* renamed from: a */
    ChronoZonedDateTime m172012a(long j, C42675n nVar);

    /* renamed from: b */
    ChronoZonedDateTime m172014b(long j, C42677p pVar);

    /* renamed from: c */
    Object mo137883c(TemporalQuery temporalQuery) {
        return (temporalQuery == C42676o.m172521f() || temporalQuery == C42676o.m172522g()) ? mo138010U() : temporalQuery == C42676o.m172519d() ? getOffset() : temporalQuery == C42676o.m172518c() ? mo138016l() : temporalQuery == C42676o.m172516a() ? mo138048h() : temporalQuery == C42676o.m172520e() ? ChronoUnit.NANOS : temporalQuery.queryFrom(this);
    }

    /* renamed from: g */
    long mo137886g(C42675n nVar) {
        if (!(nVar instanceof C42662a)) {
            return nVar.mo138218q(this);
        }
        int i = C42599g.f107764a[((C42662a) nVar).ordinal()];
        return i != 1 ? i != 2 ? mo138006C().mo137886g(nVar) : (long) getOffset().mo138005q() : mo138046S();
    }

    ZoneOffset getOffset();

    /* renamed from: h */
    Chronology mo138048h() {
        return mo138017m().mo137937h();
    }

    /* renamed from: i */
    C42679r mo137889i(C42675n nVar) {
        return nVar instanceof C42662a ? (nVar == C42662a.INSTANT_SECONDS || nVar == C42662a.OFFSET_SECONDS) ? nVar.mo138210E() : mo138006C().mo137889i(nVar) : nVar.mo138212L(this);
    }

    /* renamed from: j */
    int mo137890j(C42675n nVar) {
        if (!(nVar instanceof C42662a)) {
            return super.mo137890j(nVar);
        }
        int i = C42599g.f107764a[((C42662a) nVar).ordinal()];
        if (i != 1) {
            return i != 2 ? mo138006C().mo137890j(nVar) : getOffset().mo138005q();
        }
        throw new C42678q("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
    }

    /* renamed from: k */
    ChronoZonedDateTime mo137907e(C42672k kVar) {
        return C42601i.m172114n(mo138048h(), kVar.mo137884d(this));
    }

    /* renamed from: l */
    LocalTime mo138016l() {
        return mo138006C().mo137967l();
    }

    /* renamed from: m */
    C42594b mo138017m() {
        return mo138006C().mo137969m();
    }

    Instant toInstant() {
        return Instant.m171792L(mo138046S(), (long) mo138016l().mo137973K());
    }
}
