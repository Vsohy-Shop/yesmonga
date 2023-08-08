package com.google.firebase.concurrent;

import com.google.firebase.concurrent.C32630p;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.firebase.concurrent.l */
public final /* synthetic */ class C32626l implements C32630p.C32633c {

    /* renamed from: a */
    public final /* synthetic */ C32629o f79178a;

    /* renamed from: b */
    public final /* synthetic */ Runnable f79179b;

    /* renamed from: c */
    public final /* synthetic */ long f79180c;

    /* renamed from: d */
    public final /* synthetic */ long f79181d;

    /* renamed from: e */
    public final /* synthetic */ TimeUnit f79182e;

    public /* synthetic */ C32626l(C32629o oVar, Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        this.f79178a = oVar;
        this.f79179b = runnable;
        this.f79180c = j;
        this.f79181d = j2;
        this.f79182e = timeUnit;
    }

    /* renamed from: a */
    public final ScheduledFuture mo94775a(C32630p.C32632b bVar) {
        return this.f79178a.m131827v(this.f79179b, this.f79180c, this.f79181d, this.f79182e, bVar);
    }
}
