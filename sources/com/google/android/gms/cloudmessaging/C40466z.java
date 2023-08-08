package com.google.android.gms.cloudmessaging;

import com.google.android.gms.tasks.C31035e;
import com.google.android.gms.tasks.C31047k;
import java.util.concurrent.ScheduledFuture;

/* renamed from: com.google.android.gms.cloudmessaging.z */
public final /* synthetic */ class C40466z implements C31035e {

    /* renamed from: a */
    public final /* synthetic */ C40444d f103110a;

    /* renamed from: b */
    public final /* synthetic */ String f103111b;

    /* renamed from: c */
    public final /* synthetic */ ScheduledFuture f103112c;

    public /* synthetic */ C40466z(C40444d dVar, String str, ScheduledFuture scheduledFuture) {
        this.f103110a = dVar;
        this.f103111b = str;
        this.f103112c = scheduledFuture;
    }

    public final void onComplete(C31047k kVar) {
        this.f103110a.mo133548e(this.f103111b, this.f103112c, kVar);
    }
}
