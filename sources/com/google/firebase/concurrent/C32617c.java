package com.google.firebase.concurrent;

import com.google.firebase.concurrent.C32630p;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.firebase.concurrent.c */
public final /* synthetic */ class C32617c implements C32630p.C32633c {

    /* renamed from: a */
    public final /* synthetic */ C32629o f79150a;

    /* renamed from: b */
    public final /* synthetic */ Callable f79151b;

    /* renamed from: c */
    public final /* synthetic */ long f79152c;

    /* renamed from: d */
    public final /* synthetic */ TimeUnit f79153d;

    public /* synthetic */ C32617c(C32629o oVar, Callable callable, long j, TimeUnit timeUnit) {
        this.f79150a = oVar;
        this.f79151b = callable;
        this.f79152c = j;
        this.f79153d = timeUnit;
    }

    /* renamed from: a */
    public final ScheduledFuture mo94775a(C32630p.C32632b bVar) {
        return this.f79150a.m131824s(this.f79151b, this.f79152c, this.f79153d, bVar);
    }
}
