package com.google.firebase.crashlytics.internal.send;

import java.util.concurrent.CountDownLatch;

/* renamed from: com.google.firebase.crashlytics.internal.send.d */
public final /* synthetic */ class C32925d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C32926e f79959a;

    /* renamed from: b */
    public final /* synthetic */ CountDownLatch f79960b;

    public /* synthetic */ C32925d(C32926e eVar, CountDownLatch countDownLatch) {
        this.f79959a = eVar;
        this.f79960b = countDownLatch;
    }

    public final void run() {
        this.f79959a.m133082m(this.f79960b);
    }
}
