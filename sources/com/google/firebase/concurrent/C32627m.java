package com.google.firebase.concurrent;

import com.google.firebase.concurrent.C32630p;

/* renamed from: com.google.firebase.concurrent.m */
public final /* synthetic */ class C32627m implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C32629o f79183a;

    /* renamed from: b */
    public final /* synthetic */ Runnable f79184b;

    /* renamed from: c */
    public final /* synthetic */ C32630p.C32632b f79185c;

    public /* synthetic */ C32627m(C32629o oVar, Runnable runnable, C32630p.C32632b bVar) {
        this.f79183a = oVar;
        this.f79184b = runnable;
        this.f79185c = bVar;
    }

    public final void run() {
        this.f79183a.m131820o(this.f79184b, this.f79185c);
    }
}
