package com.google.firebase.concurrent;

import com.google.firebase.concurrent.C32630p;
import java.util.concurrent.Callable;

/* renamed from: com.google.firebase.concurrent.e */
public final /* synthetic */ class C32619e implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C32629o f79156a;

    /* renamed from: b */
    public final /* synthetic */ Callable f79157b;

    /* renamed from: c */
    public final /* synthetic */ C32630p.C32632b f79158c;

    public /* synthetic */ C32619e(C32629o oVar, Callable callable, C32630p.C32632b bVar) {
        this.f79156a = oVar;
        this.f79157b = callable;
        this.f79158c = bVar;
    }

    public final Object call() {
        return this.f79156a.m131823r(this.f79157b, this.f79158c);
    }
}
