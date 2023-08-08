package com.google.android.play.core.appupdate;

import android.content.Context;
import com.google.android.play.core.internal.C32046e1;
import com.google.android.play.core.internal.C32052g1;

/* renamed from: com.google.android.play.core.appupdate.a0 */
public final class C31866a0 {

    /* renamed from: a */
    public C32052g1<Context> f77712a;

    /* renamed from: b */
    public C32052g1<C31888u> f77713b;

    /* renamed from: c */
    public C32052g1<C31885s> f77714c;

    /* renamed from: d */
    public C32052g1<C31872f> f77715d;

    /* renamed from: e */
    public C32052g1<C31874h> f77716e;

    /* renamed from: f */
    public C32052g1<C31868c> f77717f;

    public /* synthetic */ C31866a0(C31876j jVar) {
        C31878l lVar = new C31878l(jVar);
        this.f77712a = lVar;
        C32052g1<C31888u> b = C32046e1.m129795b(new C31877k((C32052g1<Context>) lVar, (char[]) null));
        this.f77713b = b;
        this.f77714c = C32046e1.m129795b(new C31886t(this.f77712a, b));
        C32052g1<C31872f> b2 = C32046e1.m129795b(new C31877k(this.f77712a, (byte[]) null));
        this.f77715d = b2;
        C32052g1<C31874h> b3 = C32046e1.m129795b(new C31875i(this.f77714c, b2, this.f77712a));
        this.f77716e = b3;
        this.f77717f = C32046e1.m129795b(new C31877k(b3));
    }

    /* renamed from: a */
    public final C31868c mo92398a() {
        return this.f77717f.mo92416a();
    }
}
