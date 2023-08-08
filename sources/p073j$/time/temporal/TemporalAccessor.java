package p073j$.time.temporal;

import java.util.Objects;
import p073j$.time.C42586c;
import p073j$.time.C42619d;

/* renamed from: j$.time.temporal.TemporalAccessor */
public interface TemporalAccessor {
    /* renamed from: c */
    Object mo137883c(TemporalQuery temporalQuery) {
        if (temporalQuery == C42676o.f107963a || temporalQuery == C42676o.f107964b || temporalQuery == C42676o.f107965c) {
            return null;
        }
        return temporalQuery.queryFrom(this);
    }

    /* renamed from: f */
    boolean mo137885f(C42675n nVar);

    /* renamed from: g */
    long mo137886g(C42675n nVar);

    /* renamed from: i */
    C42679r mo137889i(C42675n nVar) {
        if (!(nVar instanceof C42662a)) {
            Objects.requireNonNull(nVar, "field");
            return nVar.mo138212L(this);
        } else if (mo137885f(nVar)) {
            return nVar.mo138210E();
        } else {
            throw new C42678q(C42619d.m172286a("Unsupported field: ", nVar));
        }
    }

    /* renamed from: j */
    int mo137890j(C42675n nVar) {
        C42679r i = mo137889i(nVar);
        if (i.mo138233h()) {
            long g = mo137886g(nVar);
            if (i.mo138235i(g)) {
                return (int) g;
            }
            throw new C42586c("Invalid value for " + nVar + " (valid values " + i + "): " + g);
        }
        throw new C42678q("Invalid field " + nVar + " for get() method, use getLong() instead");
    }
}
