package com.google.firebase.concurrent;

import com.google.firebase.concurrent.C32630p;
import java.util.concurrent.Callable;

/* renamed from: com.google.firebase.concurrent.f */
public final /* synthetic */ class C32620f implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Callable f79159a;

    /* renamed from: b */
    public final /* synthetic */ C32630p.C32632b f79160b;

    public /* synthetic */ C32620f(Callable callable, C32630p.C32632b bVar) {
        this.f79159a = callable;
        this.f79160b = bVar;
    }

    public final void run() {
        C32629o.m131822q(this.f79159a, this.f79160b);
    }
}
