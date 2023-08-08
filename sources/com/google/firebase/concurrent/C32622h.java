package com.google.firebase.concurrent;

import com.google.firebase.concurrent.C32630p;

/* renamed from: com.google.firebase.concurrent.h */
public final /* synthetic */ class C32622h implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C32629o f79163a;

    /* renamed from: b */
    public final /* synthetic */ Runnable f79164b;

    /* renamed from: c */
    public final /* synthetic */ C32630p.C32632b f79165c;

    public /* synthetic */ C32622h(C32629o oVar, Runnable runnable, C32630p.C32632b bVar) {
        this.f79163a = oVar;
        this.f79164b = runnable;
        this.f79165c = bVar;
    }

    public final void run() {
        this.f79163a.m131826u(this.f79164b, this.f79165c);
    }
}
