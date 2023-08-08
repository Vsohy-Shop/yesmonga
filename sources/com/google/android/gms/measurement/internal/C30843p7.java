package com.google.android.gms.measurement.internal;

import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.p7 */
public final /* synthetic */ class C30843p7 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C30855q7 f73853a;

    /* renamed from: b */
    public final /* synthetic */ int f73854b;

    /* renamed from: c */
    public final /* synthetic */ Exception f73855c;

    /* renamed from: d */
    public final /* synthetic */ byte[] f73856d;

    /* renamed from: e */
    public final /* synthetic */ Map f73857e;

    public /* synthetic */ C30843p7(C30855q7 q7Var, int i, Exception exc, byte[] bArr, Map map) {
        this.f73853a = q7Var;
        this.f73854b = i;
        this.f73855c = exc;
        this.f73856d = bArr;
        this.f73857e = map;
    }

    public final void run() {
        this.f73853a.mo87443a(this.f73854b, this.f73855c, this.f73856d, this.f73857e);
    }
}
