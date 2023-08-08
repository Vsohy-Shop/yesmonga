package p073j$.time.temporal;

import p073j$.time.LocalDate;
import p073j$.time.LocalTime;
import p073j$.time.ZoneId;
import p073j$.time.ZoneOffset;
import p073j$.time.chrono.Chronology;

/* renamed from: j$.time.temporal.m */
public final /* synthetic */ class C42674m implements C42672k, TemporalQuery {

    /* renamed from: a */
    public final /* synthetic */ int f107962a;

    public /* synthetic */ C42674m(int i) {
        this.f107962a = i;
    }

    /* renamed from: d */
    public final C42671j mo137884d(C42671j jVar) {
        C42662a aVar = C42662a.DAY_OF_MONTH;
        return jVar.mo137902a(jVar.mo137889i(aVar).mo138228d(), aVar);
    }

    public final Object queryFrom(TemporalAccessor temporalAccessor) {
        C42674m mVar = C42676o.f107963a;
        switch (this.f107962a) {
            case 1:
                return (ZoneId) temporalAccessor.mo137883c(mVar);
            case 2:
                return (Chronology) temporalAccessor.mo137883c(C42676o.f107964b);
            case 3:
                return (C42677p) temporalAccessor.mo137883c(C42676o.f107965c);
            case 4:
                C42662a aVar = C42662a.OFFSET_SECONDS;
                if (temporalAccessor.mo137885f(aVar)) {
                    return ZoneOffset.m171937L(temporalAccessor.mo137890j(aVar));
                }
                return null;
            case 5:
                ZoneId zoneId = (ZoneId) temporalAccessor.mo137883c(mVar);
                return zoneId != null ? zoneId : (ZoneId) temporalAccessor.mo137883c(C42676o.f107966d);
            case 6:
                C42662a aVar2 = C42662a.EPOCH_DAY;
                if (temporalAccessor.mo137885f(aVar2)) {
                    return LocalDate.m171809R(temporalAccessor.mo137886g(aVar2));
                }
                return null;
            default:
                C42662a aVar3 = C42662a.NANO_OF_DAY;
                if (temporalAccessor.mo137885f(aVar3)) {
                    return LocalTime.m171886a0(temporalAccessor.mo137886g(aVar3));
                }
                return null;
        }
    }
}
