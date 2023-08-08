package p073j$.time.chrono;

import p073j$.time.C42658l;
import p073j$.time.LocalTime;
import p073j$.time.temporal.C42662a;
import p073j$.time.temporal.C42671j;
import p073j$.time.temporal.C42672k;
import p073j$.time.temporal.C42675n;
import p073j$.time.temporal.C42676o;
import p073j$.time.temporal.C42677p;
import p073j$.time.temporal.ChronoUnit;
import p073j$.time.temporal.TemporalQuery;

/* renamed from: j$.time.chrono.b */
public interface C42594b extends C42671j, C42672k, Comparable {
    /* renamed from: D */
    C42594b mo137914D(C42658l lVar);

    /* renamed from: M */
    int mo137917M() {
        return mo137919P() ? 366 : 365;
    }

    /* renamed from: N */
    ChronoLocalDateTime mo137918N(LocalTime localTime);

    /* renamed from: P */
    boolean mo137919P() {
        return mo137937h().mo138030G(mo137886g(C42662a.YEAR));
    }

    /* renamed from: X */
    int compareTo(C42594b bVar) {
        int compare = Long.compare(mo137949w(), bVar.mo137949w());
        return compare == 0 ? mo137937h().mo138051r(bVar.mo137937h()) : compare;
    }

    /* renamed from: a */
    C42594b mo137902a(long j, C42675n nVar);

    /* renamed from: b */
    C42594b mo137905b(long j, C42677p pVar);

    /* renamed from: c */
    Object mo137883c(TemporalQuery temporalQuery) {
        if (temporalQuery == C42676o.m172522g() || temporalQuery == C42676o.m172521f() || temporalQuery == C42676o.m172519d() || temporalQuery == C42676o.m172518c()) {
            return null;
        }
        return temporalQuery == C42676o.m172516a() ? mo137937h() : temporalQuery == C42676o.m172520e() ? ChronoUnit.DAYS : temporalQuery.queryFrom(this);
    }

    /* renamed from: d */
    C42671j mo137884d(C42671j jVar) {
        return jVar.mo137902a(mo137949w(), C42662a.EPOCH_DAY);
    }

    boolean equals(Object obj);

    /* renamed from: f */
    boolean mo137885f(C42675n nVar) {
        return nVar instanceof C42662a ? nVar.mo138216n() : nVar != null && nVar.mo138213Y(this);
    }

    /* renamed from: h */
    Chronology mo137937h();

    int hashCode();

    /* renamed from: k */
    C42594b mo137941k(C42672k kVar);

    String toString();

    /* renamed from: u */
    C42602j mo137947u();

    /* renamed from: v */
    C42594b mo137948v(long j, ChronoUnit chronoUnit);

    /* renamed from: w */
    long mo137949w();
}
