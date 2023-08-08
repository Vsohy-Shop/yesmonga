package com.google.android.gms.measurement.internal;

import androidx.annotation.C0348i1;
import com.google.android.gms.common.internal.C40843u;
import java.util.Map;

@C0348i1
/* renamed from: com.google.android.gms.measurement.internal.y3 */
public final class C30947y3 implements Runnable {

    /* renamed from: a */
    public final C30923w3 f74105a;

    /* renamed from: b */
    public final int f74106b;

    /* renamed from: c */
    public final Throwable f74107c;

    /* renamed from: d */
    public final byte[] f74108d;

    /* renamed from: e */
    public final String f74109e;

    /* renamed from: f */
    public final Map f74110f;

    public /* synthetic */ C30947y3(String str, C30923w3 w3Var, int i, Throwable th, byte[] bArr, Map map, C30935x3 x3Var) {
        C40843u.m166202l(w3Var);
        this.f74105a = w3Var;
        this.f74106b = i;
        this.f74107c = th;
        this.f74108d = bArr;
        this.f74109e = str;
        this.f74110f = map;
    }

    public final void run() {
        this.f74105a.mo87049a(this.f74109e, this.f74106b, this.f74107c, this.f74108d, this.f74110f);
    }
}
