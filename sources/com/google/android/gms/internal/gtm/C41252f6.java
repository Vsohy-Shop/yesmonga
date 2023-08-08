package com.google.android.gms.internal.gtm;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.gtm.f6 */
public final class C41252f6 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ long f104582a;

    /* renamed from: b */
    public final /* synthetic */ String f104583b;

    /* renamed from: c */
    public final /* synthetic */ String f104584c;

    /* renamed from: d */
    public final /* synthetic */ String f104585d;

    /* renamed from: e */
    public final /* synthetic */ Map f104586e;

    /* renamed from: f */
    public final /* synthetic */ String f104587f;

    /* renamed from: g */
    public final /* synthetic */ C41276g6 f104588g;

    /* renamed from: v */
    public final /* synthetic */ C41276g6 f104589v;

    public C41252f6(C41276g6 g6Var, C41276g6 g6Var2, long j, String str, String str2, String str3, Map map, String str4, byte[] bArr) {
        this.f104588g = g6Var;
        this.f104589v = g6Var2;
        this.f104582a = j;
        this.f104583b = str;
        this.f104584c = str2;
        this.f104585d = str3;
        this.f104586e = map;
        this.f104587f = str4;
    }

    public final void run() {
        if (this.f104588g.f104616d == null) {
            C41494p7 f = C41494p7.m168157f();
            f.mo135713m(this.f104588g.f104617e, this.f104589v);
            this.f104588g.f104616d = f.mo135710e();
        }
        this.f104588g.f104616d.mo135430a(this.f104582a, this.f104583b, this.f104584c, this.f104585d, this.f104586e, this.f104587f);
    }
}
