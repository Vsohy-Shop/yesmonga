package com.google.firebase.perf.session;

import android.content.Context;

/* renamed from: com.google.firebase.perf.session.b */
public final /* synthetic */ class C33399b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ SessionManager f81170a;

    /* renamed from: b */
    public final /* synthetic */ Context f81171b;

    /* renamed from: c */
    public final /* synthetic */ PerfSession f81172c;

    public /* synthetic */ C33399b(SessionManager sessionManager, Context context, PerfSession perfSession) {
        this.f81170a = sessionManager;
        this.f81171b = context;
        this.f81172c = perfSession;
    }

    public final void run() {
        this.f81170a.lambda$setApplicationContext$0(this.f81171b, this.f81172c);
    }
}
