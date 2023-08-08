package com.urbanairship.android.layout.environment;

import com.google.android.gms.common.internal.C40852x;
import com.urbanairship.android.layout.C35700k;
import com.urbanairship.android.layout.event.ReportingEvent;
import com.urbanairship.android.layout.reporting.C35868d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.urbanairship.android.layout.environment.h */
public final class C35598h implements C35606m {
    @C12579k

    /* renamed from: a */
    public final C35700k f88008a;

    public C35598h(@C12579k C35700k kVar) {
        Intrinsics.checkNotNullParameter(kVar, C40852x.C40853a.f103958a);
        this.f88008a = kVar;
    }

    /* renamed from: a */
    public void mo106647a(@C12579k ReportingEvent reportingEvent, @C12579k C35868d dVar) {
        Intrinsics.checkNotNullParameter(reportingEvent, "event");
        Intrinsics.checkNotNullParameter(dVar, "state");
        if (reportingEvent instanceof ReportingEvent.C35622h) {
            ReportingEvent.C35622h hVar = (ReportingEvent.C35622h) reportingEvent;
            this.f88008a.mo18496a(hVar.mo106765a(), dVar, hVar.mo106771b());
        } else if (reportingEvent instanceof ReportingEvent.C35621g) {
            ReportingEvent.C35621g gVar = (ReportingEvent.C35621g) reportingEvent;
            this.f88008a.mo18498c(gVar.mo106765a(), gVar.mo106769e(), gVar.mo106768d(), gVar.mo106767c(), gVar.mo106766b(), dVar);
        } else if (reportingEvent instanceof ReportingEvent.C35615a) {
            this.f88008a.mo18497b(((ReportingEvent.C35615a) reportingEvent).mo106751a(), dVar);
        } else if (reportingEvent instanceof ReportingEvent.C35617c) {
            this.f88008a.mo18499d(((ReportingEvent.C35617c) reportingEvent).mo106753a());
        } else if (reportingEvent instanceof ReportingEvent.C35616b) {
            ReportingEvent.C35616b bVar = (ReportingEvent.C35616b) reportingEvent;
            this.f88008a.mo18502g(bVar.mo106755c(), bVar.mo106754b(), bVar.mo106756d(), bVar.mo106753a(), dVar);
        } else if (reportingEvent instanceof ReportingEvent.C35620f) {
            this.f88008a.mo18501f(((ReportingEvent.C35620f) reportingEvent).mo106762b(), dVar);
        } else if (reportingEvent instanceof ReportingEvent.C35619e) {
            this.f88008a.mo18500e(((ReportingEvent.C35619e) reportingEvent).mo106759a(), dVar);
        }
    }

    @C12579k
    /* renamed from: b */
    public final C35700k mo106648b() {
        return this.f88008a;
    }
}
