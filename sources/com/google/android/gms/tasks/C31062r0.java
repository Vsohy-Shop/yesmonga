package com.google.android.gms.tasks;

import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.gms.tasks.r0 */
public final /* synthetic */ class C31062r0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C31049l f74326a;

    public /* synthetic */ C31062r0(C31049l lVar) {
        this.f74326a = lVar;
    }

    public final void run() {
        this.f74326a.mo87744d(new TimeoutException());
    }
}
