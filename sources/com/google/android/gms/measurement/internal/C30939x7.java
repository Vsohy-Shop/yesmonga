package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* renamed from: com.google.android.gms.measurement.internal.x7 */
public final class C30939x7 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C30903u7 f74088a;

    /* renamed from: b */
    public final /* synthetic */ C30903u7 f74089b;

    /* renamed from: c */
    public final /* synthetic */ long f74090c;

    /* renamed from: d */
    public final /* synthetic */ boolean f74091d;

    /* renamed from: e */
    public final /* synthetic */ C30682c8 f74092e;

    public C30939x7(C30682c8 c8Var, C30903u7 u7Var, C30903u7 u7Var2, long j, boolean z) {
        this.f74092e = c8Var;
        this.f74088a = u7Var;
        this.f74089b = u7Var2;
        this.f74090c = j;
        this.f74091d = z;
    }

    public final void run() {
        this.f74092e.mo86919o(this.f74088a, this.f74089b, this.f74090c, this.f74091d, (Bundle) null);
    }
}
