package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.C40203r;
import com.google.android.datatransport.runtime.scheduling.persistence.C40255d;
import com.google.android.datatransport.runtime.synchronization.C40306a;
import java.util.concurrent.Executor;
import javax.inject.Inject;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.v */
public class C40244v {

    /* renamed from: a */
    public final Executor f102567a;

    /* renamed from: b */
    public final C40255d f102568b;

    /* renamed from: c */
    public final C40246x f102569c;

    /* renamed from: d */
    public final C40306a f102570d;

    @Inject
    public C40244v(Executor executor, C40255d dVar, C40246x xVar, C40306a aVar) {
        this.f102567a = executor;
        this.f102568b = dVar;
        this.f102569c = xVar;
        this.f102570d = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ Object m163619d() {
        for (C40203r a : this.f102568b.mo132929P0()) {
            this.f102569c.mo132880a(a, 1);
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m163620e() {
        this.f102570d.mo132960b(new C40242t(this));
    }

    /* renamed from: c */
    public void mo132900c() {
        this.f102567a.execute(new C40243u(this));
    }
}
