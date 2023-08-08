package p073j$.time.chrono;

import androidx.constraintlayout.core.motion.utils.C16717v;
import java.util.Objects;
import p073j$.time.LocalDate;
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
import p073j$.time.temporal.ChronoUnit;
import p073j$.time.temporal.TemporalQuery;

/* renamed from: j$.time.chrono.ChronoLocalDateTime */
public interface ChronoLocalDateTime<D extends C42594b> extends C42671j, C42672k, Comparable<ChronoLocalDateTime<?>> {
    /* renamed from: J */
    ChronoZonedDateTime mo137951J(ZoneId zoneId);

    /* renamed from: Z */
    int compareTo(ChronoLocalDateTime chronoLocalDateTime) {
        int X = mo137969m().compareTo(chronoLocalDateTime.mo137969m());
        if (X != 0) {
            return X;
        }
        int n = mo137967l().compareTo(chronoLocalDateTime.mo137967l());
        return n == 0 ? mo138043h().mo138051r(chronoLocalDateTime.mo138043h()) : n;
    }

    /* renamed from: a */
    ChronoLocalDateTime m171997a(long j, C42675n nVar);

    /* renamed from: b */
    ChronoLocalDateTime m171999b(long j, C42677p pVar);

    /* renamed from: c */
    Object mo137883c(TemporalQuery temporalQuery) {
        if (temporalQuery == C42676o.m172522g() || temporalQuery == C42676o.m172521f() || temporalQuery == C42676o.m172519d()) {
            return null;
        }
        return temporalQuery == C42676o.m172518c() ? mo137967l() : temporalQuery == C42676o.m172516a() ? mo138043h() : temporalQuery == C42676o.m172520e() ? ChronoUnit.NANOS : temporalQuery.queryFrom(this);
    }

    /* renamed from: d */
    C42671j mo137884d(C42671j jVar) {
        return jVar.mo137902a(mo137969m().mo137949w(), C42662a.EPOCH_DAY).mo137902a(mo137967l().mo137981f0(), C42662a.NANO_OF_DAY);
    }

    /* renamed from: e */
    ChronoLocalDateTime m172003e(LocalDate localDate) {
        return C42598f.m172095n(mo138043h(), localDate.mo137884d(this));
    }

    /* renamed from: h */
    Chronology mo138043h() {
        return mo137969m().mo137937h();
    }

    /* renamed from: l */
    LocalTime mo137967l();

    /* renamed from: m */
    C42594b mo137969m();

    long toEpochSecond(ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, C16717v.C16720c.f42211R);
        return ((mo137969m().mo137949w() * 86400) + ((long) mo137967l().mo137982g0())) - ((long) zoneOffset.mo138005q());
    }
}
