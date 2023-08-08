package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import java.util.concurrent.Callable;

/* renamed from: com.google.firebase.messaging.k */
public final /* synthetic */ class C33205k implements Callable {

    /* renamed from: a */
    public final /* synthetic */ Context f80723a;

    /* renamed from: b */
    public final /* synthetic */ Intent f80724b;

    public /* synthetic */ C33205k(Context context, Intent intent) {
        this.f80723a = context;
        this.f80724b = intent;
    }

    public final Object call() {
        return Integer.valueOf(C33254w0.m134108b().mo96216h(this.f80723a, this.f80724b));
    }
}
