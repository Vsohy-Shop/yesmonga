package com.contentsquare.android.sdk;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.contentsquare.android.sdk.p */
public final class C14602p implements C14502lc {

    /* renamed from: a */
    public final C14453jf f36151a = new C14453jf("StartStopEventProvider");

    /* renamed from: b */
    public final List<C14374ga> f36152b = new ArrayList();

    /* renamed from: c */
    public final C14213b7 f36153c;

    public C14602p(C14213b7 b7Var) {
        Intrinsics.checkNotNullParameter(b7Var, "preferencesStore");
        this.f36153c = b7Var;
    }

    /* renamed from: a */
    public void mo35238a() {
    }

    /* renamed from: b */
    public final synchronized void mo36128b(boolean z) {
        C14896yc ycVar;
        boolean h = this.f36153c.mo34676h(C14477k8.LOCAL_SESSION_REPLAY_MODE, false);
        if (!this.f36153c.mo34676h(C14477k8.SESSION_REPLAY_FORCE_START, false)) {
            if (!h) {
                ycVar = C14896yc.REGULAR;
                this.f36152b.add(new C14190af(System.currentTimeMillis(), ycVar, z));
                C14453jf jfVar = this.f36151a;
                jfVar.mo35676e("Session Replay start event added: " + ycVar);
            }
        }
        ycVar = C14896yc.FORCED;
        this.f36152b.add(new C14190af(System.currentTimeMillis(), ycVar, z));
        C14453jf jfVar2 = this.f36151a;
        jfVar2.mo35676e("Session Replay start event added: " + ycVar);
    }

    /* renamed from: c */
    public synchronized List<C14374ga> mo35239c(C14507le leVar, long j) {
        List<C14374ga> T5;
        Intrinsics.checkNotNullParameter(leVar, "viewLight");
        T5 = CollectionsKt___CollectionsKt.m40572T5(this.f36152b);
        this.f36152b.clear();
        return T5;
    }

    /* renamed from: c */
    public void mo35240c() {
    }
}
