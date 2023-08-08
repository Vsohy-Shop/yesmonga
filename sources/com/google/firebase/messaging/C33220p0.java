package com.google.firebase.messaging;

import android.content.Context;
import com.google.android.gms.tasks.C31049l;

/* renamed from: com.google.firebase.messaging.p0 */
public final /* synthetic */ class C33220p0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Context f80773a;

    /* renamed from: b */
    public final /* synthetic */ boolean f80774b;

    /* renamed from: c */
    public final /* synthetic */ C31049l f80775c;

    public /* synthetic */ C33220p0(Context context, boolean z, C31049l lVar) {
        this.f80773a = context;
        this.f80774b = z;
        this.f80775c = lVar;
    }

    public final void run() {
        C33222q0.m134029e(this.f80773a, this.f80774b, this.f80775c);
    }
}
