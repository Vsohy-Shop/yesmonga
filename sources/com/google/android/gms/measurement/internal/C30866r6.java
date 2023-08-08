package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* renamed from: com.google.android.gms.measurement.internal.r6 */
public final class C30866r6 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f73910a;

    /* renamed from: b */
    public final /* synthetic */ String f73911b;

    /* renamed from: c */
    public final /* synthetic */ long f73912c;

    /* renamed from: d */
    public final /* synthetic */ Bundle f73913d;

    /* renamed from: e */
    public final /* synthetic */ boolean f73914e;

    /* renamed from: f */
    public final /* synthetic */ boolean f73915f;

    /* renamed from: g */
    public final /* synthetic */ boolean f73916g;

    /* renamed from: v */
    public final /* synthetic */ String f73917v;

    /* renamed from: w */
    public final /* synthetic */ C30819n7 f73918w;

    public C30866r6(C30819n7 n7Var, String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        this.f73918w = n7Var;
        this.f73910a = str;
        this.f73911b = str2;
        this.f73912c = j;
        this.f73913d = bundle;
        this.f73914e = z;
        this.f73915f = z2;
        this.f73916g = z3;
        this.f73917v = str3;
    }

    public final void run() {
        this.f73918w.mo87336w(this.f73910a, this.f73911b, this.f73912c, this.f73913d, this.f73914e, this.f73915f, this.f73916g, this.f73917v);
    }
}
