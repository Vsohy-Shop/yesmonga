package com.google.android.gms.measurement.internal;

import android.content.Intent;

/* renamed from: com.google.android.gms.measurement.internal.i9 */
public final /* synthetic */ class C30761i9 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C30797l9 f73611a;

    /* renamed from: b */
    public final /* synthetic */ int f73612b;

    /* renamed from: c */
    public final /* synthetic */ C30899u3 f73613c;

    /* renamed from: d */
    public final /* synthetic */ Intent f73614d;

    public /* synthetic */ C30761i9(C30797l9 l9Var, int i, C30899u3 u3Var, Intent intent) {
        this.f73611a = l9Var;
        this.f73612b = i;
        this.f73613c = u3Var;
        this.f73614d = intent;
    }

    public final void run() {
        this.f73611a.mo87258c(this.f73612b, this.f73613c, this.f73614d);
    }
}
