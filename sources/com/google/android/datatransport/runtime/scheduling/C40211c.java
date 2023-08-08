package com.google.android.datatransport.runtime.scheduling;

import com.google.android.datatransport.C40088i;
import com.google.android.datatransport.runtime.C40190j;
import com.google.android.datatransport.runtime.C40203r;
import com.google.android.datatransport.runtime.C40323w;
import com.google.android.datatransport.runtime.backends.C40106e;
import com.google.android.datatransport.runtime.backends.C40116m;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C40246x;
import com.google.android.datatransport.runtime.scheduling.persistence.C40255d;
import com.google.android.datatransport.runtime.synchronization.C40306a;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
import javax.inject.Inject;

/* renamed from: com.google.android.datatransport.runtime.scheduling.c */
public class C40211c implements C40213e {

    /* renamed from: f */
    public static final Logger f102466f = Logger.getLogger(C40323w.class.getName());

    /* renamed from: a */
    public final C40246x f102467a;

    /* renamed from: b */
    public final Executor f102468b;

    /* renamed from: c */
    public final C40106e f102469c;

    /* renamed from: d */
    public final C40255d f102470d;

    /* renamed from: e */
    public final C40306a f102471e;

    @Inject
    public C40211c(Executor executor, C40106e eVar, C40246x xVar, C40255d dVar, C40306a aVar) {
        this.f102468b = executor;
        this.f102469c = eVar;
        this.f102467a = xVar;
        this.f102470d = dVar;
        this.f102471e = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ Object m163534d(C40203r rVar, C40190j jVar) {
        this.f102470d.mo132926D3(rVar, jVar);
        this.f102467a.mo132880a(rVar, 1);
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m163535e(C40203r rVar, C40088i iVar, C40190j jVar) {
        try {
            C40116m mVar = this.f102469c.get(rVar.mo132737b());
            if (mVar == null) {
                String format = String.format("Transport backend '%s' is not registered", new Object[]{rVar.mo132737b()});
                f102466f.warning(format);
                iVar.mo95581a(new IllegalArgumentException(format));
                return;
            }
            this.f102471e.mo132960b(new C40209a(this, rVar, mVar.mo132562a(jVar)));
            iVar.mo95581a((Exception) null);
        } catch (Exception e) {
            Logger logger = f102466f;
            logger.warning("Error scheduling event " + e.getMessage());
            iVar.mo95581a(e);
        }
    }

    /* renamed from: a */
    public void mo132855a(C40203r rVar, C40190j jVar, C40088i iVar) {
        this.f102468b.execute(new C40210b(this, rVar, iVar, jVar));
    }
}
