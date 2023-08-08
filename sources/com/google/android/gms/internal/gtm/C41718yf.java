package com.google.android.gms.internal.gtm;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.gtm.yf */
public final class C41718yf {

    /* renamed from: a */
    public final List<C41711y8> f105305a = new ArrayList();

    /* renamed from: b */
    public String f105306b;

    /* renamed from: a */
    public final C41718yf mo136104a(C41711y8 y8Var) {
        this.f105305a.add(y8Var);
        return this;
    }

    /* renamed from: b */
    public final C41718yf mo136105b(String str) {
        this.f105306b = str;
        return this;
    }

    /* renamed from: c */
    public final C41142ag mo136106c() {
        return new C41142ag(this.f105306b, this.f105305a, (C41742zf) null);
    }
}
