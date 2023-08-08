package com.contentsquare.android.sdk;

import com.contentsquare.android.sdk.C14245c5;

/* renamed from: com.contentsquare.android.sdk.yd */
public class C14897yd extends C14430id {

    /* renamed from: d */
    public final C14245c5.C14246a f36950d;

    /* renamed from: e */
    public int f36951e;

    public C14897yd(String str) {
        this(str, C14245c5.m61282M(), System.currentTimeMillis());
    }

    /* renamed from: e */
    public void mo35550e(C14374ga gaVar) {
        this.f36950d.mo34836x(gaVar.mo34547c());
        this.f36951e = ((C14245c5) this.f36950d.mo34703p()).mo35018k().length;
    }

    /* renamed from: f */
    public boolean mo35551f(C14374ga gaVar, int i) {
        if (gaVar.mo34547c().mo35018k().length + mo36933j() >= i) {
            return false;
        }
        mo35550e(gaVar);
        return true;
    }

    /* renamed from: h */
    public boolean mo35553h() {
        return this.f36950d.mo34835B().isEmpty();
    }

    /* renamed from: i */
    public byte[] mo35554i() {
        return ((C14245c5) this.f36950d.mo34703p()).mo35018k();
    }

    /* renamed from: j */
    public int mo36933j() {
        return this.f36951e;
    }

    public C14897yd(String str, C14245c5.C14246a aVar, long j) {
        super(str, j);
        this.f36950d = aVar;
        aVar.mo34834A("1");
    }
}
