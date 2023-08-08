package com.google.android.gms.internal.gtm;

import android.content.ComponentName;

/* renamed from: com.google.android.gms.internal.gtm.a1 */
public final class C41127a1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ComponentName f104419a;

    /* renamed from: b */
    public final /* synthetic */ C41151b1 f104420b;

    public C41127a1(C41151b1 b1Var, ComponentName componentName) {
        this.f104420b = b1Var;
        this.f104419a = componentName;
    }

    public final void run() {
        C41175c1.m167238Z(this.f104420b.f104449d, this.f104419a);
    }
}
