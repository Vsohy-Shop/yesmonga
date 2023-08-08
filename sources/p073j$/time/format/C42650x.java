package p073j$.time.format;

import p073j$.time.ZoneId;
import p073j$.time.chrono.C42594b;
import p073j$.time.chrono.Chronology;
import p073j$.time.temporal.C42675n;
import p073j$.time.temporal.C42676o;
import p073j$.time.temporal.C42679r;
import p073j$.time.temporal.TemporalAccessor;
import p073j$.time.temporal.TemporalQuery;

/* renamed from: j$.time.format.x */
final class C42650x implements TemporalAccessor {

    /* renamed from: a */
    final /* synthetic */ C42594b f107914a;

    /* renamed from: b */
    final /* synthetic */ TemporalAccessor f107915b;

    /* renamed from: c */
    final /* synthetic */ Chronology f107916c;

    /* renamed from: d */
    final /* synthetic */ ZoneId f107917d;

    C42650x(C42594b bVar, TemporalAccessor temporalAccessor, Chronology chronology, ZoneId zoneId) {
        this.f107914a = bVar;
        this.f107915b = temporalAccessor;
        this.f107916c = chronology;
        this.f107917d = zoneId;
    }

    /* renamed from: c */
    public final Object mo137883c(TemporalQuery temporalQuery) {
        return temporalQuery == C42676o.m172516a() ? this.f107916c : temporalQuery == C42676o.m172522g() ? this.f107917d : temporalQuery == C42676o.m172520e() ? this.f107915b.mo137883c(temporalQuery) : temporalQuery.queryFrom(this);
    }

    /* renamed from: f */
    public final boolean mo137885f(C42675n nVar) {
        C42594b bVar = this.f107914a;
        return (bVar == null || !nVar.mo138216n()) ? this.f107915b.mo137885f(nVar) : bVar.mo137885f(nVar);
    }

    /* renamed from: g */
    public final long mo137886g(C42675n nVar) {
        C42594b bVar = this.f107914a;
        return (bVar == null || !nVar.mo138216n()) ? this.f107915b.mo137886g(nVar) : bVar.mo137886g(nVar);
    }

    /* renamed from: i */
    public final C42679r mo137889i(C42675n nVar) {
        C42594b bVar = this.f107914a;
        return (bVar == null || !nVar.mo138216n()) ? this.f107915b.mo137889i(nVar) : bVar.mo137889i(nVar);
    }
}
