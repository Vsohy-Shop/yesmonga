package com.google.firebase.concurrent;

import com.google.firebase.concurrent.C32630p;

/* renamed from: com.google.firebase.concurrent.k */
public final /* synthetic */ class C32625k implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C32629o f79175a;

    /* renamed from: b */
    public final /* synthetic */ Runnable f79176b;

    /* renamed from: c */
    public final /* synthetic */ C32630p.C32632b f79177c;

    public /* synthetic */ C32625k(C32629o oVar, Runnable runnable, C32630p.C32632b bVar) {
        this.f79175a = oVar;
        this.f79176b = runnable;
        this.f79177c = bVar;
    }

    public final void run() {
        this.f79175a.m131828w(this.f79176b, this.f79177c);
    }
}
