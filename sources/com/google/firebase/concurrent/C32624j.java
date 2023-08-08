package com.google.firebase.concurrent;

import com.google.firebase.concurrent.C32630p;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.firebase.concurrent.j */
public final /* synthetic */ class C32624j implements C32630p.C32633c {

    /* renamed from: a */
    public final /* synthetic */ C32629o f79170a;

    /* renamed from: b */
    public final /* synthetic */ Runnable f79171b;

    /* renamed from: c */
    public final /* synthetic */ long f79172c;

    /* renamed from: d */
    public final /* synthetic */ long f79173d;

    /* renamed from: e */
    public final /* synthetic */ TimeUnit f79174e;

    public /* synthetic */ C32624j(C32629o oVar, Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        this.f79170a = oVar;
        this.f79171b = runnable;
        this.f79172c = j;
        this.f79173d = j2;
        this.f79174e = timeUnit;
    }

    /* renamed from: a */
    public final ScheduledFuture mo94775a(C32630p.C32632b bVar) {
        return this.f79170a.m131829x(this.f79171b, this.f79172c, this.f79173d, this.f79174e, bVar);
    }
}
