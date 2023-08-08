package com.google.firebase.messaging;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.firebase.messaging.d1 */
public final /* synthetic */ class C33175d1 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ Context f80529a;

    /* renamed from: b */
    public final /* synthetic */ ScheduledExecutorService f80530b;

    /* renamed from: c */
    public final /* synthetic */ FirebaseMessaging f80531c;

    /* renamed from: d */
    public final /* synthetic */ C33206k0 f80532d;

    /* renamed from: e */
    public final /* synthetic */ C33188f0 f80533e;

    public /* synthetic */ C33175d1(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseMessaging firebaseMessaging, C33206k0 k0Var, C33188f0 f0Var) {
        this.f80529a = context;
        this.f80530b = scheduledExecutorService;
        this.f80531c = firebaseMessaging;
        this.f80532d = k0Var;
        this.f80533e = f0Var;
    }

    public final Object call() {
        return C33179e1.m133839k(this.f80529a, this.f80530b, this.f80531c, this.f80532d, this.f80533e);
    }
}
