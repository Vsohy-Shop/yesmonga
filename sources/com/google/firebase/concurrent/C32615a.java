package com.google.firebase.concurrent;

/* renamed from: com.google.firebase.concurrent.a */
public final /* synthetic */ class C32615a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C32616b f79143a;

    /* renamed from: b */
    public final /* synthetic */ Runnable f79144b;

    public /* synthetic */ C32615a(C32616b bVar, Runnable runnable) {
        this.f79143a = bVar;
        this.f79144b = runnable;
    }

    public final void run() {
        this.f79143a.m131802b(this.f79144b);
    }
}
