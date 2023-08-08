package com.google.firebase.messaging;

import com.google.android.gms.tasks.C31035e;
import com.google.android.gms.tasks.C31047k;
import java.util.concurrent.ScheduledFuture;

/* renamed from: com.google.firebase.messaging.l1 */
public final /* synthetic */ class C33210l1 implements C31035e {

    /* renamed from: a */
    public final /* synthetic */ ScheduledFuture f80746a;

    public /* synthetic */ C33210l1(ScheduledFuture scheduledFuture) {
        this.f80746a = scheduledFuture;
    }

    public final void onComplete(C31047k kVar) {
        this.f80746a.cancel(false);
    }
}
