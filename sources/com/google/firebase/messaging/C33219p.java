package com.google.firebase.messaging;

import android.content.Intent;

/* renamed from: com.google.firebase.messaging.p */
public final /* synthetic */ class C33219p implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C33221q f80771a;

    /* renamed from: b */
    public final /* synthetic */ Intent f80772b;

    public /* synthetic */ C33219p(C33221q qVar, Intent intent) {
        this.f80771a = qVar;
        this.f80772b = intent;
    }

    public final void run() {
        this.f80771a.m134023b(this.f80772b);
    }
}
