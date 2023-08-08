package p073j$.time.chrono;

import p073j$.time.C42619d;
import p073j$.time.temporal.C42662a;
import p073j$.time.temporal.C42671j;
import p073j$.time.temporal.C42672k;
import p073j$.time.temporal.C42675n;
import p073j$.time.temporal.C42676o;
import p073j$.time.temporal.C42678q;
import p073j$.time.temporal.C42679r;
import p073j$.time.temporal.ChronoUnit;
import p073j$.time.temporal.TemporalAccessor;
import p073j$.time.temporal.TemporalQuery;

/* renamed from: j$.time.chrono.j */
public interface C42602j extends TemporalAccessor, C42672k {
    /* renamed from: c */
    Object mo137883c(TemporalQuery temporalQuery) {
        return temporalQuery == C42676o.m172520e() ? ChronoUnit.ERAS : super.mo137883c(temporalQuery);
    }

    /* renamed from: d */
    C42671j mo137884d(C42671j jVar) {
        return jVar.mo137902a((long) getValue(), C42662a.ERA);
    }

    /* renamed from: f */
    boolean mo137885f(C42675n nVar) {
        return nVar instanceof C42662a ? nVar == C42662a.ERA : nVar != null && nVar.mo138213Y(this);
    }

    /* renamed from: g */
    long mo137886g(C42675n nVar) {
        if (nVar == C42662a.ERA) {
            return (long) getValue();
        }
        if (!(nVar instanceof C42662a)) {
            return nVar.mo138218q(this);
        }
        throw new C42678q(C42619d.m172286a("Unsupported field: ", nVar));
    }

    int getValue();

    /* renamed from: i */
    C42679r mo137889i(C42675n nVar) {
        return super.mo137889i(nVar);
    }

    /* renamed from: j */
    int mo137890j(C42675n nVar) {
        return nVar == C42662a.ERA ? getValue() : super.mo137890j(nVar);
    }
}
