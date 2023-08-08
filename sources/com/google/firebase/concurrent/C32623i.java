package com.google.firebase.concurrent;

import com.google.firebase.concurrent.C32630p;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.firebase.concurrent.i */
public final /* synthetic */ class C32623i implements C32630p.C32633c {

    /* renamed from: a */
    public final /* synthetic */ C32629o f79166a;

    /* renamed from: b */
    public final /* synthetic */ Runnable f79167b;

    /* renamed from: c */
    public final /* synthetic */ long f79168c;

    /* renamed from: d */
    public final /* synthetic */ TimeUnit f79169d;

    public /* synthetic */ C32623i(C32629o oVar, Runnable runnable, long j, TimeUnit timeUnit) {
        this.f79166a = oVar;
        this.f79167b = runnable;
        this.f79168c = j;
        this.f79169d = timeUnit;
    }

    /* renamed from: a */
    public final ScheduledFuture mo94775a(C32630p.C32632b bVar) {
        return this.f79166a.m131821p(this.f79167b, this.f79168c, this.f79169d, bVar);
    }
}
